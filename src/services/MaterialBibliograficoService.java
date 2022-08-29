
package services;
import controllers.*;
import java.util.List;
import models.*;

public class MaterialBibliograficoService {
    
    private static final MaterialBibliograficoController mbc = new MaterialBibliograficoController();

    public void guardar(MaterialBibliografico materialBibliografico){
        mbc.guardar(materialBibliografico);
    }

    public List<MaterialBibliografico> listar(){
        return mbc.listar();
    }

    public MaterialBibliografico recuperarMaterialBibliograficoById(int id){
        return mbc.recuperarMaterialBibliograficoById(id);
    }
    
    public MaterialBibliografico recuperarMaterialBibliograficoByNombre(String nombre){
        return mbc.recuperarMaterialBibliograficoByNombre(nombre);
    }


    public void imprimir(List<MaterialBibliografico> materialBibliograficos){
        mbc.imprimir(materialBibliograficos);
    }

    public void eliminar(){
        mbc.eliminar();
    }
}
