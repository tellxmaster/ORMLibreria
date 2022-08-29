package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "t_material_bibliografico")
@Inheritance(strategy=InheritanceType.JOINED)
public class MaterialBibliografico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String titulo;
    private String autor;
    private String editorial;
    private String categoria;


    @OneToMany(cascade = CascadeType.ALL, mappedBy = "materialBibliografico")
    private List<LineaPrestamo> lineasPrestamo;

    public MaterialBibliografico(String titulo, String autor, String editorial, String categoria) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.categoria = categoria;
        this.lineasPrestamo = new ArrayList<LineaPrestamo>();
    }

    public MaterialBibliografico() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public List<LineaPrestamo> getLineasPrestamo() {
        return lineasPrestamo;
    }

    public void setLineasPrestamo(List<LineaPrestamo> lineasPrestamo) {
        this.lineasPrestamo = lineasPrestamo;
    }

    @Override
    public String toString() {
        return "MaterialBibliografico{" + "id=" + id + ", titulo=" + titulo + ", autor=" + autor + ", editorial=" + editorial + ", categoria=" + categoria + ", lineasPrestamo=" + lineasPrestamo + '}';
    }
    
}
