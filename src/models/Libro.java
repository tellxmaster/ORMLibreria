package models;

import javax.persistence.Entity;

@Entity
public class Libro extends MaterialBibliografico{
    private String descripcion;
    private String isbn;

    public Libro(String titulo, String autor, String editorial, String categoria, String descripcion, String isbn) {
        super(titulo, autor, editorial, categoria);
        this.descripcion = descripcion;
        this.isbn = isbn;
    }

    public Libro(String titulo, String autor, String editorial, String categoria) {
        super(titulo, autor, editorial, categoria);
    }
    
    public Libro() {
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Libro{" + "descripcion=" + descripcion + '}';
    }
    
    
}
