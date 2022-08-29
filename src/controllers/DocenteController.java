/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;
import java.util.List;
import javax.persistence.*;
import models.*;

public class DocenteController {
    public void guardar(Docente docente){
        EntityManagerFactory bbf = Persistence.createEntityManagerFactory("ORMLibreriaPU");
        EntityManager bb = bbf.createEntityManager();
        bb.getTransaction().begin();
        bb.persist(docente);
        bb.getTransaction().commit();
        bb.close();
        bbf.close();
    }

    public List<Docente> listar(){
        EntityManagerFactory bbf = Persistence.createEntityManagerFactory("ORMLibreriaPU");
        EntityManager bb = bbf.createEntityManager();
        TypedQuery<Docente> query = bb.createQuery("SELECT b FROM Docente b ", Docente.class);
        List<Docente> results = query.getResultList();
        return results;
    }

    public Docente recuperarDocenteById(int id){
        EntityManagerFactory bbf= Persistence.createEntityManagerFactory("ORMLibreriaPU");
        EntityManager bb = bbf.createEntityManager();
        Docente docente = bb.createQuery("Select b from Docente b WHERE b.id = :id", Docente.class).setParameter("id", id).getSingleResult();
        bb.close();
        bbf.close();
        return docente;
    }


    public void imprimir(List<Docente> docentes){
        for(Docente docente : docentes){
            System.out.println(docente.toString());
        }
    }

    public void eliminar(){
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("ORMLibreriaPU");
        EntityManager em= emf.createEntityManager();
        em.getTransaction().begin();
        em.createQuery("Delete from Docente").executeUpdate();
        System.out.println("Registros Eliminados");
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
