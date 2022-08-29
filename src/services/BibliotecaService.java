
package services;
import controllers.BibliotecaController;
import java.util.List;
import models.*;

public class BibliotecaService {
    
    private static final BibliotecaController bc = new BibliotecaController();
    
    public void guardar(Biblioteca biblioteca){
        bc.guardar(biblioteca);
    }

    public List<Biblioteca> listar(){
        return bc.listar();
    }

    public Biblioteca recuperarBibliotecaById(int id){
        return bc.recuperarBibliotecaById(id);
    }
    
    public Biblioteca recuperarBibliotecaByNombre(String nombre){
        return bc.recuperarBibliotecaByNombre(nombre);
    }
    
    public void imprimir(List<Biblioteca> bibliotecas){
        bc.imprimir(bibliotecas);
    }

    public void eliminar(){
        bc.eliminar();
    }
}
