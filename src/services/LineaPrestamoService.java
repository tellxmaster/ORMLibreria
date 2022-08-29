
package services;
import controllers.*;
import java.util.List;
import models.*;

public class LineaPrestamoService {
    
    private static final LineaPrestamoController lpc = new LineaPrestamoController();

    public void guardar(LineaPrestamo lineaPrestamo){
        lpc.guardar(lineaPrestamo);
    }

    public List<LineaPrestamo> listar(){
        return lpc.listar();
    }

    public LineaPrestamo recuperarLineaPrestamoById(int id){
        return lpc.recuperarLineaPrestamoById(id);
    }


    public void imprimir(List<LineaPrestamo> lineaPrestamos){
        lpc.imprimir(lineaPrestamos);
    }

    public void eliminar(){
        lpc.eliminar();
    }
}
