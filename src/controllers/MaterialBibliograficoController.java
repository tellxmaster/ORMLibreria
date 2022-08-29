
package controllers;
import java.util.List;
import javax.persistence.*;
import models.*;

public class MaterialBibliograficoController {
    public void guardar(MaterialBibliografico materialBibliografico){
        EntityManagerFactory bbf = Persistence.createEntityManagerFactory("ORMLibreriaPU");
        EntityManager bb = bbf.createEntityManager();
        bb.getTransaction().begin();
        bb.persist(materialBibliografico);
        bb.getTransaction().commit();
        bb.close();
        bbf.close();
    }

    public List<MaterialBibliografico> listar(){
        EntityManagerFactory bbf = Persistence.createEntityManagerFactory("ORMLibreriaPU");
        EntityManager bb = bbf.createEntityManager();
        TypedQuery<MaterialBibliografico> query = bb.createQuery("SELECT b FROM MaterialBibliografico b ", MaterialBibliografico.class);
        List<MaterialBibliografico> results = query.getResultList();
        return results;
    }

    public MaterialBibliografico recuperarMaterialBibliograficoById(int id){
        EntityManagerFactory bbf= Persistence.createEntityManagerFactory("ORMLibreriaPU");
        EntityManager bb = bbf.createEntityManager();
        MaterialBibliografico materialBibliografico = bb.createQuery("Select b from MaterialBibliografico b WHERE b.id = :id", MaterialBibliografico.class).setParameter("id", id).getSingleResult();
        bb.close();
        bbf.close();
        return materialBibliografico;
    }
    
    public MaterialBibliografico recuperarMaterialBibliograficoByNombre(String titulo){
        EntityManagerFactory bbf= Persistence.createEntityManagerFactory("ORMLibreriaPU");
        EntityManager bb = bbf.createEntityManager();
        MaterialBibliografico materialBibliografico = bb.createQuery("Select b from MaterialBibliografico b WHERE b.titulo = :titulo", MaterialBibliografico.class).setParameter("titulo", titulo).getSingleResult();
        bb.close();
        bbf.close();
        return materialBibliografico;
    }


    public void imprimir(List<MaterialBibliografico> materialBibliograficos){
        for(MaterialBibliografico materialBibliografico : materialBibliograficos){
            System.out.println(materialBibliografico.toString());
        }
    }

    public void eliminar(){
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("ORMLibreriaPU");
        EntityManager em= emf.createEntityManager();
        em.getTransaction().begin();
        em.createQuery("Delete from MaterialBibliografico").executeUpdate();
        System.out.println("Registros Eliminados");
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
