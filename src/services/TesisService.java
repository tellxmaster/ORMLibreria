
package services;
import controllers.*;
import java.util.List;
import models.*;

public class TesisService {
    
    private static final TesisController tc = new TesisController();

    public void guardar(Tesis tesis){
        tc.guardar(tesis);
    }

    public List<Tesis> listar(){
        return tc.listar();
    }

    public Tesis recuperarTesisById(int id){
        return tc.recuperarTesisById(id);
    }


    public void imprimir(List<Tesis> tesiss){
        tc.imprimir(tesiss);
    }

    public void eliminar(){
        tc.eliminar();
    }
}
