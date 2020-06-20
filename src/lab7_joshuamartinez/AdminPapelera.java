package lab7_joshuamartinez;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AdminPapelera {
    private ArrayList<Archivos> listaA = new ArrayList();
    private ArrayList<NewCarpetas> listaC = new ArrayList();
    private File archivo = null;

    public AdminPapelera() {
    }

    public AdminPapelera(String path) {
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<Archivos> getListaA() {
        return listaA;
    }

    public void setListaA(ArrayList<Archivos> listaA) {
        this.listaA = listaA;
    }

    public ArrayList<NewCarpetas> getListaC() {
        return listaC;
    }

    public void setListaC(ArrayList<NewCarpetas> listaC) {
        this.listaC = listaC;
    }

    public void escribirArchivo() throws IOException {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (NewCarpetas f : listaC) {
                bw.writeObject(f);
            }
            for (Archivos t : listaA) {
                bw.writeObject(t);
            }
            bw.flush();
            bw.close();
            fw.close();
        } catch (Exception ex) {
        } finally {

        }
    }

    public void cargarArchivo() {
        try {
            listaA = new ArrayList();
            listaC = new ArrayList();
            Object temp;
            if (archivo.exists()) {
                FileInputStream entrada
                        = new FileInputStream(archivo);
                ObjectInputStream objeto
                        = new ObjectInputStream(entrada);
                try {
                    while (((temp = objeto.readObject()) != null)) {
                        if (temp instanceof NewCarpetas) {
                            listaC.add((NewCarpetas) temp);
                        }else if (temp instanceof Archivos) {
                            listaA.add((Archivos) temp);
                        } 
                    }
                } catch (IOException | ClassNotFoundException ex) {
                }
            } 

        } catch (FileNotFoundException ex) {
            Logger.getLogger(AdminArchivo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AdminArchivo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
