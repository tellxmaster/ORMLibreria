
package services;
import controllers.*;
import java.util.List;
import models.*;

public class EstudianteService {
    
    private static final EstudianteController ec = new EstudianteController();

    public void guardar(Estudiante estudiante){
        ec.guardar(estudiante);
    }

    public List<Estudiante> listar(){
        return ec.listar();
    }

    public Estudiante recuperarEstudianteById(int id){
        return ec.recuperarEstudianteById(id);
    }


    public void imprimir(List<Estudiante> estudiantes){
        ec.imprimir(estudiantes);
    }

    public void eliminar(){
        ec.eliminar();
    }
}
