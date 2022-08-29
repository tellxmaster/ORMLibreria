
package controllers;
import java.util.List;
import javax.persistence.*;
import models.*;

public class RevistaController {
        public void guardar(Revista revista){
        EntityManagerFactory bbf = Persistence.createEntityManagerFactory("ORMLibreriaPU");
        EntityManager bb = bbf.createEntityManager();
        bb.getTransaction().begin();
        bb.persist(revista);
        bb.getTransaction().commit();
        bb.close();
        bbf.close();
    }

    public List<Revista> listar(){
        EntityManagerFactory bbf = Persistence.createEntityManagerFactory("ORMLibreriaPU");
        EntityManager bb = bbf.createEntityManager();
        TypedQuery<Revista> query = bb.createQuery("SELECT b FROM Revista b ", Revista.class);
        List<Revista> results = query.getResultList();
        return results;
    }

    public Revista recuperarRevistaById(int id){
        EntityManagerFactory bbf= Persistence.createEntityManagerFactory("ORMLibreriaPU");
        EntityManager bb = bbf.createEntityManager();
        Revista revista = bb.createQuery("Select b from Revista b WHERE b.id = :id", Revista.class).setParameter("id", id).getSingleResult();
        bb.close();
        bbf.close();
        return revista;
    }


    public void imprimir(List<Revista> revistas){
        for(Revista revista : revistas){
            System.out.println(revista.toString());
        }
    }

    public void eliminar(){
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("ORMLibreriaPU");
        EntityManager em= emf.createEntityManager();
        em.getTransaction().begin();
        em.createQuery("Delete from Revista").executeUpdate();
        System.out.println("Registros Eliminados");
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
