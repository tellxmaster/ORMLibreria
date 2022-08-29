
package services;
import controllers.*;
import java.util.List;
import models.*;

public class RevistaService {
    
    private static final RevistaController rc = new RevistaController();

    public void guardar(Revista revista){
        rc.guardar(revista);
    }

    public List<Revista> listar(){
        return rc.listar();
    }

    public Revista recuperarRevistaById(int id){
        return rc.recuperarRevistaById(id);
    }


    public void imprimir(List<Revista> revistas){
        rc.imprimir(revistas);
    }

    public void eliminar(){
        rc.eliminar();
    }
}
