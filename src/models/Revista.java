package models;

import javax.persistence.Entity;

@Entity
public class Revista extends MaterialBibliografico{
    private int numArticulos;

    public Revista(String titulo, String autor, String editorial, String categoria, int numArticulos) {
        super(titulo, autor, editorial, categoria);
        this.numArticulos = numArticulos;
    }

    public Revista(String titulo, String autor, String editorial, String categoria) {
        super(titulo, autor, editorial, categoria);
    }
    
    
    public Revista() {
    }

    public int getNumArticulos() {
        return numArticulos;
    }

    public void setNumArticulos(int numArticulos) {
        this.numArticulos = numArticulos;
    }

    @Override
    public String toString() {
        return "Revista{" + "numArticulos=" + numArticulos + '}';
    }
    
    
}
