
package controllers;
import java.util.List;
import javax.persistence.*;
import models.*;

public class LineaPrestamoController {
    public void guardar(LineaPrestamo lineaPrestamo){
        EntityManagerFactory bbf = Persistence.createEntityManagerFactory("ORMLibreriaPU");
        EntityManager bb = bbf.createEntityManager();
        bb.getTransaction().begin();
        bb.persist(lineaPrestamo);
        bb.getTransaction().commit();
        bb.close();
        bbf.close();
    }

    public List<LineaPrestamo> listar(){
        EntityManagerFactory bbf = Persistence.createEntityManagerFactory("ORMLibreriaPU");
        EntityManager bb = bbf.createEntityManager();
        TypedQuery<LineaPrestamo> query = bb.createQuery("SELECT b FROM LineaPrestamo b ", LineaPrestamo.class);
        List<LineaPrestamo> results = query.getResultList();
        return results;
    }

    public LineaPrestamo recuperarLineaPrestamoById(int id){
        EntityManagerFactory bbf= Persistence.createEntityManagerFactory("ORMLibreriaPU");
        EntityManager bb = bbf.createEntityManager();
        LineaPrestamo lineaPrestamo = bb.createQuery("Select b from LineaPrestamo b WHERE b.id = :id", LineaPrestamo.class).setParameter("id", id).getSingleResult();
        bb.close();
        bbf.close();
        return lineaPrestamo;
    }


    public void imprimir(List<LineaPrestamo> lineaPrestamos){
        for(LineaPrestamo lineaPrestamo : lineaPrestamos){
            System.out.println(lineaPrestamo.toString());
        }
    }

    public void eliminar(){
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("ORMLibreriaPU");
        EntityManager em= emf.createEntityManager();
        em.getTransaction().begin();
        em.createQuery("Delete from LineaPrestamo").executeUpdate();
        System.out.println("Registros Eliminados");
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
