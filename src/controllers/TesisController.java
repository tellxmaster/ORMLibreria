
package controllers;
import java.util.List;
import javax.persistence.*;
import models.*;

public class TesisController {
    public void guardar(Tesis tesis){
        EntityManagerFactory bbf = Persistence.createEntityManagerFactory("ORMLibreriaPU");
        EntityManager bb = bbf.createEntityManager();
        bb.getTransaction().begin();
        bb.persist(tesis);
        bb.getTransaction().commit();
        bb.close();
        bbf.close();
    }

    public List<Tesis> listar(){
        EntityManagerFactory bbf = Persistence.createEntityManagerFactory("ORMLibreriaPU");
        EntityManager bb = bbf.createEntityManager();
        TypedQuery<Tesis> query = bb.createQuery("SELECT b FROM Tesis b ", Tesis.class);
        List<Tesis> results = query.getResultList();
        return results;
    }

    public Tesis recuperarTesisById(int id){
        EntityManagerFactory bbf= Persistence.createEntityManagerFactory("ORMLibreriaPU");
        EntityManager bb = bbf.createEntityManager();
        Tesis tesis = bb.createQuery("Select b from Tesis b WHERE b.id = :id", Tesis.class).setParameter("id", id).getSingleResult();
        bb.close();
        bbf.close();
        return tesis;
    }


    public void imprimir(List<Tesis> tesiss){
        for(Tesis tesis : tesiss){
            System.out.println(tesis.toString());
        }
    }

    public void eliminar(){
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("ORMLibreriaPU");
        EntityManager em= emf.createEntityManager();
        em.getTransaction().begin();
        em.createQuery("Delete from Tesis").executeUpdate();
        System.out.println("Registros Eliminados");
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
