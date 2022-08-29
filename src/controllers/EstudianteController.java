
package controllers;
import java.util.List;
import javax.persistence.*;
import models.*;

public class EstudianteController {
    public void guardar(Estudiante estudiante){
        EntityManagerFactory bbf = Persistence.createEntityManagerFactory("ORMLibreriaPU");
        EntityManager bb = bbf.createEntityManager();
        bb.getTransaction().begin();
        bb.persist(estudiante);
        bb.getTransaction().commit();
        bb.close();
        bbf.close();
    }

    public List<Estudiante> listar(){
        EntityManagerFactory bbf = Persistence.createEntityManagerFactory("ORMLibreriaPU");
        EntityManager bb = bbf.createEntityManager();
        TypedQuery<Estudiante> query = bb.createQuery("SELECT b FROM Estudiante b ", Estudiante.class);
        List<Estudiante> results = query.getResultList();
        return results;
    }

    public Estudiante recuperarEstudianteById(int id){
        EntityManagerFactory bbf= Persistence.createEntityManagerFactory("ORMLibreriaPU");
        EntityManager bb = bbf.createEntityManager();
        Estudiante estudiante = bb.createQuery("Select b from Estudiante b WHERE b.id = :id", Estudiante.class).setParameter("id", id).getSingleResult();
        bb.close();
        bbf.close();
        return estudiante;
    }


    public void imprimir(List<Estudiante> estudiantes){
        for(Estudiante estudiante : estudiantes){
            System.out.println(estudiante.toString());
        }
    }

    public void eliminar(){
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("ORMLibreriaPU");
        EntityManager em= emf.createEntityManager();
        em.getTransaction().begin();
        em.createQuery("Delete from Estudiante").executeUpdate();
        System.out.println("Registros Eliminados");
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
