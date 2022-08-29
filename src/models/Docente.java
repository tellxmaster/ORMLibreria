package models;

import javax.persistence.Entity;

@Entity
public class Docente extends Usuario{
    private String titulo;
    private String departamento;

    public Docente(String nombre, String apellido, String cedula, String direccion, String email, String telefono, String titulo, String departamento) {
        super(nombre, apellido, cedula, direccion, email, telefono);
        this.titulo = titulo;
        this.departamento = departamento;
    }

    public Docente(String titulo, String departamento) {
        this.titulo = titulo;
        this.departamento = departamento;
    }

    public Docente() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Docente{" + "titulo=" + titulo + ", departamento=" + departamento + '}';
    }
    
    
    
}
