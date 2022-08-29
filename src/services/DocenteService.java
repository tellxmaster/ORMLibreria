
package services;
import controllers.*;
import java.util.List;
import models.*;

public class DocenteService {
    private static final DocenteController dc = new DocenteController();

    public void guardar(Docente docente){
        dc.guardar(docente);
    }

    public List<Docente> listar(){
        return dc.listar();
    }

    public Docente recuperarDocenteById(int id){
        return dc.recuperarDocenteById(id);
    }


    public void imprimir(List<Docente> docentes){
        dc.imprimir(docentes);
    }

    public void eliminar(){
        dc.eliminar();
    }
}
