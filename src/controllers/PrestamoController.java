
package controllers;
import java.util.List;
import javax.persistence.*;
import models.*;

public class PrestamoController {
        public void guardar(Prestamo prestamo){
        EntityManagerFactory bbf = Persistence.createEntityManagerFactory("ORMLibreriaPU");
        EntityManager bb = bbf.createEntityManager();
        bb.getTransaction().begin();
        bb.persist(prestamo);
        bb.getTransaction().commit();
        bb.close();
        bbf.close();
    }

    public List<Prestamo> listar(){
        EntityManagerFactory bbf = Persistence.createEntityManagerFactory("ORMLibreriaPU");
        EntityManager bb = bbf.createEntityManager();
        TypedQuery<Prestamo> query = bb.createQuery("SELECT b FROM Prestamo b ", Prestamo.class);
        List<Prestamo> results = query.getResultList();
        return results;
    }

    public Prestamo recuperarPrestamoById(int id){
        EntityManagerFactory bbf= Persistence.createEntityManagerFactory("ORMLibreriaPU");
        EntityManager bb = bbf.createEntityManager();
        Prestamo prestamo = bb.createQuery("Select b from Prestamo b WHERE b.id = :id", Prestamo.class).setParameter("id", id).getSingleResult();
        bb.close();
        bbf.close();
        return prestamo;
    }


    public void imprimir(List<Prestamo> prestamos){
        for(Prestamo prestamo : prestamos){
            System.out.println(prestamo.toString());
        }
    }

    public void eliminar(){
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("ORMLibreriaPU");
        EntityManager em= emf.createEntityManager();
        em.getTransaction().begin();
        em.createQuery("Delete from Prestamo").executeUpdate();
        System.out.println("Registros Eliminados");
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
