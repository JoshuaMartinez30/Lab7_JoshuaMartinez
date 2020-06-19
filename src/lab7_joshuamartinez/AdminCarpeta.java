package lab7_joshuamartinez;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class AdminCarpeta {
    private ArrayList<NewCarpetas> listaC = new ArrayList();
    private File archivo = null;

    public AdminCarpeta(String path) {
        archivo = new File(path);
    }

    public ArrayList<NewCarpetas> getListaC() {
        return listaC;
    }

    public void setListaC(ArrayList<NewCarpetas> listaC) {
        this.listaC = listaC;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "admincliente{" + "listaCliente=" + listaC + '}';
    }

    public void setlistaC(NewCarpetas C) {
        this.listaC.add(C);
    }
    
    public void cargarArchivo() {
        try {            
            listaC = new ArrayList();
            NewCarpetas temp;
            if (archivo.exists()) {
                  FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (NewCarpetas) objeto.readObject()) != null) {
                        listaC.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            } //fin if           
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (NewCarpetas t : listaC) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
}
