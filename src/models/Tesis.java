package models;

import javax.persistence.Entity;

@Entity
public class Tesis extends MaterialBibliografico{
    private String Universidad;
    private String Tutor;

    public Tesis(String titulo, String autor, String editorial, String categoria, String universidad, String tutor) {
        super(titulo, autor, editorial, categoria);
        Universidad = universidad;
        Tutor = tutor;
    }

    public Tesis(String titulo, String autor, String editorial, String categoria) {
        super(titulo, autor, editorial, categoria);
    }
    
    
    public Tesis() {
    }

    public String getUniversidad() {
        return Universidad;
    }

    public void setUniversidad(String universidad) {
        Universidad = universidad;
    }

    @Override
    public String toString() {
        return "Tesis{" + "Universidad=" + Universidad + '}';
    }
    
    
}
