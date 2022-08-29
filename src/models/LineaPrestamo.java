package models;

import javax.persistence.*;

@Entity
@Table(name = "t_linea_prestamo")
public class LineaPrestamo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private int cantidad;

    @ManyToOne
    private Prestamo prestamo;

    @ManyToOne
    private MaterialBibliografico materialBibliografico;

    public LineaPrestamo(int cantidad, Prestamo prestamo, MaterialBibliografico materialBibliografico) {
        this.cantidad = cantidad;
        this.prestamo = prestamo;
        this.materialBibliografico = materialBibliografico;
    }
    
    
        public LineaPrestamo(int cantidad, MaterialBibliografico materialBibliografico) {
        this.cantidad = cantidad;
        this.materialBibliografico = materialBibliografico;
    }

    public LineaPrestamo() {
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Prestamo getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }

    public MaterialBibliografico getMaterialBibliografico() {
        return materialBibliografico;
    }

    public void setMaterialBibliografico(MaterialBibliografico materialBibliografico) {
        this.materialBibliografico = materialBibliografico;
    }

    @Override
    public String toString() {
        return "LineaPrestamo{" + "id=" + id + ", cantidad=" + cantidad + ", materialBibliografico=" + materialBibliografico.getTitulo() + '}';
    }
    
    
}
