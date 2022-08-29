
package controllers;

import java.util.List;
import javax.persistence.*;
import models.*;


public class CuentaController {
    public void guardar(Cuenta cuenta){
        EntityManagerFactory bbf = Persistence.createEntityManagerFactory("ORMLibreriaPU");
        EntityManager bb = bbf.createEntityManager();
        bb.getTransaction().begin();
        bb.persist(cuenta);
        bb.getTransaction().commit();
        bb.close();
        bbf.close();
    }

    public List<Cuenta> listar(){
        EntityManagerFactory bbf = Persistence.createEntityManagerFactory("ORMLibreriaPU");
        EntityManager bb = bbf.createEntityManager();
        TypedQuery<Cuenta> query = bb.createQuery("SELECT b FROM Cuenta b ", Cuenta.class);
        List<Cuenta> results = query.getResultList();
        return results;
    }

    public Cuenta recuperarCuentaById(int id){
        EntityManagerFactory bbf= Persistence.createEntityManagerFactory("ORMLibreriaPU");
        EntityManager bb = bbf.createEntityManager();
        Cuenta cuenta = bb.createQuery("Select b from Cuenta b WHERE b.id = :id", Cuenta.class).setParameter("id", id).getSingleResult();
        bb.close();
        bbf.close();
        return cuenta;
    }
   

    public Cuenta recuperarCuentaByUsername(String nombreUsuario){
        EntityManagerFactory clf= Persistence.createEntityManagerFactory("ORMLibreriaPU");
        EntityManager cl = clf.createEntityManager();
        Cuenta cuenta = cl.createQuery("Select c from Cuenta c WHERE c.nombreUsuario = :nombreUsuario", Cuenta.class).setParameter("nombreUsuario", nombreUsuario).getSingleResult();
        cl.close();
        clf.close();
        return cuenta;
    }
    
    public boolean comprobarCuenta(String nombreUsuario){
        try{
            EntityManagerFactory clf= Persistence.createEntityManagerFactory("ORMLibreriaPU");
            EntityManager cl = clf.createEntityManager();
            Cuenta cuenta = cl.createQuery("Select c from Cuenta c WHERE c.nombreUsuario = :nombreUsuario", Cuenta.class).setParameter("nombreUsuario", nombreUsuario).getSingleResult();
            cl.close();
            clf.close();
            return true;
        }catch(Exception ex){
            return false;
        }
    }
    
  
    public boolean login(String nombreUsuario, String password){
        EntityManagerFactory clf= Persistence.createEntityManagerFactory("ORMLibreriaPU");
        EntityManager cl = clf.createEntityManager();
        Cuenta cuenta = cl.createQuery("Select c from Cuenta c WHERE c.nombreUsuario = :nombreUsuario", Cuenta.class).setParameter("nombreUsuario", nombreUsuario).getSingleResult();
        cl.close();
        clf.close(); 
        return (cuenta.getNombreUsuario().equals(nombreUsuario) && cuenta.getPassword().equals(password) ? true:false);
    }


    public void imprimir(List<Cuenta> cuentas){
        for(Cuenta cuenta : cuentas){
            System.out.println(cuenta.toString());
        }
    }

    public void eliminar(){
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("ORMLibreriaPU");
        EntityManager em= emf.createEntityManager();
        em.getTransaction().begin();
        em.createQuery("Delete from Cuenta").executeUpdate();
        System.out.println("Registros Eliminados");
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
