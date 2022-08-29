package models;

import javax.persistence.Entity;


@Entity
public class Estudiante extends Usuario{
    private String nivel;
    private String carrera;

    public Estudiante(String nombre, String apellido, String cedula, String direccion, String email, String telefono, String nivel, String carrera) {
        super(nombre, apellido, cedula, direccion, email, telefono);
        this.nivel = nivel;
        this.carrera = carrera;
    }

    public Estudiante(String nivel, String carrera) {
        this.nivel = nivel;
        this.carrera = carrera;
    }

    public Estudiante() {
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nivel=" + nivel + ", carrera=" + carrera + '}';
    }
    
    
}
