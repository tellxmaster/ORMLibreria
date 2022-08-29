package models;

import java.time.LocalDate;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "t_prestamo")
public class Prestamo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private LocalDate fechaPrestamo;
    private LocalDate fechaEntrega;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "prestamo")
    private List<LineaPrestamo> lineasPrestamo;
    
    @ManyToOne
    private Usuario usuario;
    
    @ManyToOne
    private Biblioteca biblioteca;

    public Prestamo() {
    }

    public Prestamo(LocalDate fechaPrestamo, LocalDate fechaEntrega, Biblioteca biblioteca, Usuario usuario) {
        this.fechaPrestamo = fechaPrestamo;
        this.fechaEntrega = fechaEntrega;
        this.lineasPrestamo = new ArrayList<LineaPrestamo>();
        this.biblioteca = biblioteca;
        this.usuario = usuario;
    }
    
    
    public void addLineaPrestamo(LineaPrestamo lineaPrestamo){
        this.lineasPrestamo.add(lineaPrestamo);
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<LineaPrestamo> getLineasPrestamo() {
        return lineasPrestamo;
    }

    public void setLineasPrestamo(List<LineaPrestamo> lineasPrestamo) {
        this.lineasPrestamo = lineasPrestamo;
    }

    public Biblioteca getBiblioteca() {
        return biblioteca;
    }

    public void setBiblioteca(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }


    @Override
    public String toString() {
        return "Prestamo{" +
                "id=" + id +
                ", fechaPrestamo=" + fechaPrestamo +
                ", fechaEntrega=" + fechaEntrega +
                ", lineasPrestamo=" + lineasPrestamo +
                ", biblioteca=" + biblioteca +
                '}';
    }
}
