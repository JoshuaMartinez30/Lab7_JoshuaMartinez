package lab7_joshuamartinez;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class AdminArchivo {
    private ArrayList<Archivos> listaA = new ArrayList();
    private File archivo = null;

    public AdminArchivo(String path) {
        archivo = new File(path);
    }

    public ArrayList<Archivos> getListaA() {
        return listaA;
    }

    public void setListaA(ArrayList<Archivos> listaA) {
        this.listaA = listaA;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "admincliente{" + "listaCliente=" + listaA + '}';
    }

    public void setlistaA(Archivos a) {
        this.listaA.add(a);
    }
    
    public void cargarArchivo() {
        try {            
            listaA = new ArrayList();
            Archivos temp;
            if (archivo.exists()) {
                  FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Archivos) objeto.readObject()) != null) {
                        listaA.add(temp);
                    }
                } catch (EOFException e) {
                    
                }
                objeto.close();
                entrada.close();
            }            
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
            for (Archivos t : listaA) {
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
