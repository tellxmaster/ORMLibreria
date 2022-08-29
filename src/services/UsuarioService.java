
package services;
import controllers.*;
import java.util.List;
import models.*;

public class UsuarioService {
    
    private static final UsuarioController tc = new UsuarioController();

    public void guardar(Usuario usuario){
        tc.guardar(usuario);
    }

    public List<Usuario> listar(){
        return tc.listar();
    }

    public Usuario recuperarUsuarioById(int id){
        return tc.recuperarUsuarioById(id);
    }


    public void imprimir(List<Usuario> usuarios){
        tc.imprimir(usuarios);
    }

    public void eliminar(){
        tc.eliminar();
    }
}
