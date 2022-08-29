
package controllers;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import models.Biblioteca;



public class BibliotecaController {
    public void guardar(Biblioteca biblioteca){
        EntityManagerFactory bbf = Persistence.createEntityManagerFactory("ORMLibreriaPU");
        EntityManager bb = bbf.createEntityManager();
        bb.getTransaction().begin();
        bb.persist(biblioteca);
        bb.getTransaction().commit();
        bb.close();
        bbf.close();
    }

    public List<Biblioteca> listar(){
        EntityManagerFactory bbf = Persistence.createEntityManagerFactory("ORMLibreriaPU");
        EntityManager bb = bbf.createEntityManager();
        TypedQuery<Biblioteca> query = bb.createQuery("SELECT b FROM Biblioteca b ", Biblioteca.class);
        List<Biblioteca> results = query.getResultList();
        return results;
    }

    public Biblioteca recuperarBibliotecaById(int id){
        EntityManagerFactory bbf= Persistence.createEntityManagerFactory("ORMLibreriaPU");
        EntityManager bb = bbf.createEntityManager();
        Biblioteca biblioteca = bb.createQuery("Select b from Biblioteca b WHERE b.id = :id", Biblioteca.class).setParameter("id", id).getSingleResult();
        bb.close();
        bbf.close();
        return biblioteca;
    }
    
    public Biblioteca recuperarBibliotecaByNombre(String nombre){
        EntityManagerFactory bbf= Persistence.createEntityManagerFactory("ORMLibreriaPU");
        EntityManager bb = bbf.createEntityManager();
        Biblioteca biblioteca = bb.createQuery("Select b from Biblioteca b WHERE b.nombre = :nombre", Biblioteca.class).setParameter("nombre", nombre).getSingleResult();
        bb.close();
        bbf.close();
        return biblioteca;
    }

    
    public void imprimir(List<Biblioteca> bibliotecas){
        for(Biblioteca biblioteca : bibliotecas){
            System.out.println(biblioteca.toString());
        }
    }

    public void eliminar(){
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("ORMLibreriaPU");
        EntityManager em= emf.createEntityManager();
        em.getTransaction().begin();
        em.createQuery("Delete from Biblioteca").executeUpdate();
        System.out.println("Registros Eliminados");
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
    
}
