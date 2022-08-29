
package services;
import controllers.*;
import java.util.List;
import models.*;

public class CuentaService {
    private static final CuentaController cc = new CuentaController();

    public void guardar(Cuenta cuenta){
        cc.guardar(cuenta);
    }

    public List<Cuenta> listar(){
        return cc.listar();
    }

    public Cuenta recuperarCuentaById(int id){
        return cc.recuperarCuentaById(id);
    }

    
    public Cuenta recuperarCuentaByUsername(String nombreUsuario){
        return cc.recuperarCuentaByUsername(nombreUsuario);
    }
    
    public boolean comprobarCuenta(String nombreUsuario){
        return cc.comprobarCuenta(nombreUsuario);
    }
    
  
    public boolean login(String nombreUsuario, String password){
        return cc.login(nombreUsuario, password);
    }


    public void imprimir(List<Cuenta> cuentas){
        cc.imprimir(cuentas);
    }

    public void eliminar(){
        cc.eliminar();
    }
}
