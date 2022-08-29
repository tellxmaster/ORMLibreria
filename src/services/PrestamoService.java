
package services;
import controllers.*;
import java.util.List;
import models.*;

public class PrestamoService {
    
    private static final PrestamoController pc = new PrestamoController();

    public void guardar(Prestamo prestamo){
        pc.guardar(prestamo);
    }

    public List<Prestamo> listar(){
        return pc.listar();
    }

    public Prestamo recuperarPrestamoById(int id){
        return pc.recuperarPrestamoById(id);
    }


    public void imprimir(List<Prestamo> prestamos){
        pc.imprimir(prestamos);
    }

    public void eliminar(){
        pc.eliminar();
    }
}
