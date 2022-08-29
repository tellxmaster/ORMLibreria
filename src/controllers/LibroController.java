
package controllers;
import java.util.List;
import javax.persistence.*;
import models.*;

public class LibroController {
    public void guardar(Libro libro){
        EntityManagerFactory bbf = Persistence.createEntityManagerFactory("ORMLibreriaPU");
        EntityManager bb = bbf.createEntityManager();
        bb.getTransaction().begin();
        bb.persist(libro);
        bb.getTransaction().commit();
        bb.close();
        bbf.close();
    }

    public List<Libro> listar(){
        EntityManagerFactory bbf = Persistence.createEntityManagerFactory("ORMLibreriaPU");
        EntityManager bb = bbf.createEntityManager();
        TypedQuery<Libro> query = bb.createQuery("SELECT b FROM Libro b ", Libro.class);
        List<Libro> results = query.getResultList();
        return results;
    }

    public Libro recuperarLibroById(int id){
        EntityManagerFactory bbf= Persistence.createEntityManagerFactory("ORMLibreriaPU");
        EntityManager bb = bbf.createEntityManager();
        Libro libro = bb.createQuery("Select b from Libro b WHERE b.id = :id", Libro.class).setParameter("id", id).getSingleResult();
        bb.close();
        bbf.close();
        return libro;
    }


    public void imprimir(List<Libro> libros){
        for(Libro libro : libros){
            System.out.println(libro.toString());
        }
    }

    public void eliminar(){
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("ORMLibreriaPU");
        EntityManager em= emf.createEntityManager();
        em.getTransaction().begin();
        em.createQuery("Delete from Libro").executeUpdate();
        System.out.println("Registros Eliminados");
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
