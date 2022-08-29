
package services;
import controllers.*;
import java.util.List;
import models.*;

public class LibroService {
    private static final LibroController lc = new LibroController();

    public void guardar(Libro libro){
        lc.guardar(libro);
    }

    public List<Libro> listar(){
        return lc.listar();
    }

    public Libro recuperarLibroById(int id){
        return lc.recuperarLibroById(id);
    }


    public void imprimir(List<Libro> libros){
        lc.imprimir(libros);
    }

    public void eliminar(){
        lc.eliminar();
    }
}
