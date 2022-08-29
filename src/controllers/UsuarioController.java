
package controllers;
import java.util.List;
import javax.persistence.*;
import models.*;

public class UsuarioController {
    public void guardar(Usuario usuario){
        EntityManagerFactory bbf = Persistence.createEntityManagerFactory("ORMLibreriaPU");
        EntityManager bb = bbf.createEntityManager();
        bb.getTransaction().begin();
        bb.persist(usuario);
        bb.getTransaction().commit();
        bb.close();
        bbf.close();
    }

    public List<Usuario> listar(){
        EntityManagerFactory bbf = Persistence.createEntityManagerFactory("ORMLibreriaPU");
        EntityManager bb = bbf.createEntityManager();
        TypedQuery<Usuario> query = bb.createQuery("SELECT b FROM Usuario b ", Usuario.class);
        List<Usuario> results = query.getResultList();
        return results;
    }

    public Usuario recuperarUsuarioById(int id){
        EntityManagerFactory bbf= Persistence.createEntityManagerFactory("ORMLibreriaPU");
        EntityManager bb = bbf.createEntityManager();
        Usuario usuario = bb.createQuery("Select b from Usuario b WHERE b.id = :id", Usuario.class).setParameter("id", id).getSingleResult();
        bb.close();
        bbf.close();
        return usuario;
    }


    public void imprimir(List<Usuario> usuarios){
        for(Usuario usuario : usuarios){
            System.out.println(usuario.toString());
        }
    }

    public void eliminar(){
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("ORMLibreriaPU");
        EntityManager em= emf.createEntityManager();
        em.getTransaction().begin();
        em.createQuery("Delete from Usuario").executeUpdate();
        System.out.println("Registros Eliminados");
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
