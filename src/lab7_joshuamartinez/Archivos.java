package lab7_joshuamartinez;

import java.io.Serializable;

public class Archivos implements Serializable{
    private String nombre, link;
    private String extension;
    private Double Tamaño;

    private static final long SerialVersionUID=555L;
    
    public Archivos(String nombre, String link, String extension, Double Tamaño) {
        this.nombre = nombre;
        this.link = link;
        this.extension = extension;
        this.Tamaño = Tamaño;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public Double getTamaño() {
        return Tamaño;
    }

    public void setTamaño(Double Tamaño) {
        this.Tamaño = Tamaño;
    }
    
    
}
