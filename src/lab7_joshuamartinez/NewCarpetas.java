package lab7_joshuamartinez;

import java.io.Serializable;
import java.util.ArrayList;

public class NewCarpetas implements Serializable{
    private String nombre, link;
    private ArrayList lista = new ArrayList();
    private ArrayList<Archivos> lista2 = new ArrayList();
    
    private static final long SerialVersionUID=555L;

    public NewCarpetas(String nombre, String link) {
        this.nombre = nombre;
        this.link = link;
    }
    
    public NewCarpetas(String nombre, String link, ArrayList<Archivos> lista2) {
        this.nombre = nombre;
        this.link = link;
        setLista2(lista2);
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

    public ArrayList getLista() {
        return lista;
    }

    public void setLista(ArrayList lista) {
        this.lista = lista;
    }

    public ArrayList<Archivos> getLista2() {
        return lista2;
    }

    public void setLista2(ArrayList<Archivos> lista2) {
        this.lista2 = lista2;
    }

    @Override
    public String toString() {
        return "Carpeta:" + nombre + ", Carpetas:" + lista + ", Archivos:" + lista2 + '}';
    }
    
    
    
}
