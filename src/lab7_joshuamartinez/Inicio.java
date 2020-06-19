package lab7_joshuamartinez;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Inicio extends javax.swing.JFrame {
    public Inicio() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JD_MiUnidad = new javax.swing.JDialog();
        JD_Destacado = new javax.swing.JDialog();
        JD_Papelera = new javax.swing.JDialog();
        JD_Archivo = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmi_MiUnidad = new javax.swing.JMenuItem();
        jmi_Destacados = new javax.swing.JMenuItem();
        jmi_Papelera = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmi_CrearArchivo = new javax.swing.JMenuItem();
        jmi_CrearCarpeta = new javax.swing.JMenuItem();

        javax.swing.GroupLayout JD_MiUnidadLayout = new javax.swing.GroupLayout(JD_MiUnidad.getContentPane());
        JD_MiUnidad.getContentPane().setLayout(JD_MiUnidadLayout);
        JD_MiUnidadLayout.setHorizontalGroup(
            JD_MiUnidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        JD_MiUnidadLayout.setVerticalGroup(
            JD_MiUnidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout JD_DestacadoLayout = new javax.swing.GroupLayout(JD_Destacado.getContentPane());
        JD_Destacado.getContentPane().setLayout(JD_DestacadoLayout);
        JD_DestacadoLayout.setHorizontalGroup(
            JD_DestacadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        JD_DestacadoLayout.setVerticalGroup(
            JD_DestacadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout JD_PapeleraLayout = new javax.swing.GroupLayout(JD_Papelera.getContentPane());
        JD_Papelera.getContentPane().setLayout(JD_PapeleraLayout);
        JD_PapeleraLayout.setHorizontalGroup(
            JD_PapeleraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        JD_PapeleraLayout.setVerticalGroup(
            JD_PapeleraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jLabel1.setText("Nombre");

        jLabel2.setText("Extension");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".pdf", ".txt", ".docx", ".jpg", ".mp4" }));

        jLabel3.setText("Tamaño");

        btnGuardar.setText("Guardar");

        javax.swing.GroupLayout JD_ArchivoLayout = new javax.swing.GroupLayout(JD_Archivo.getContentPane());
        JD_Archivo.getContentPane().setLayout(JD_ArchivoLayout);
        JD_ArchivoLayout.setHorizontalGroup(
            JD_ArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JD_ArchivoLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(JD_ArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(JD_ArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox1, 0, 234, Short.MAX_VALUE)
                    .addComponent(jTextField1)
                    .addComponent(jTextField2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JD_ArchivoLayout.createSequentialGroup()
                .addContainerGap(167, Short.MAX_VALUE)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(143, 143, 143))
        );
        JD_ArchivoLayout.setVerticalGroup(
            JD_ArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JD_ArchivoLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(JD_ArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(JD_ArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(JD_ArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Admin");

        jmi_MiUnidad.setText("Mi Unidad");
        jmi_MiUnidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_MiUnidadActionPerformed(evt);
            }
        });
        jMenu1.add(jmi_MiUnidad);

        jmi_Destacados.setText("Destacados");
        jmi_Destacados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_DestacadosActionPerformed(evt);
            }
        });
        jMenu1.add(jmi_Destacados);

        jmi_Papelera.setText("Papelera");
        jmi_Papelera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_PapeleraActionPerformed(evt);
            }
        });
        jMenu1.add(jmi_Papelera);

        jMenu2.setText("Agregar");

        jmi_CrearArchivo.setText("Crear Archivo");
        jmi_CrearArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_CrearArchivoActionPerformed(evt);
            }
        });
        jMenu2.add(jmi_CrearArchivo);

        jmi_CrearCarpeta.setText("Crear Carpeta");
        jmi_CrearCarpeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_CrearCarpetaActionPerformed(evt);
            }
        });
        jMenu2.add(jmi_CrearCarpeta);

        jMenu1.add(jMenu2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 418, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 285, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmi_MiUnidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_MiUnidadActionPerformed
        JD_MiUnidad.setModal(true);
        JD_MiUnidad.pack();
        JD_MiUnidad.setLocationRelativeTo(null);
        JD_MiUnidad.setVisible(true);
        JD_MiUnidad.setVisible(false);
    }//GEN-LAST:event_jmi_MiUnidadActionPerformed

    private void jmi_DestacadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_DestacadosActionPerformed
        
    }//GEN-LAST:event_jmi_DestacadosActionPerformed

    private void jmi_CrearArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_CrearArchivoActionPerformed
        JD_Archivo.setModal(true);
        JD_Archivo.pack();
        JD_Archivo.setLocationRelativeTo(null);
        JD_Archivo.setVisible(true);
        JD_Archivo.setVisible(false);
    }//GEN-LAST:event_jmi_CrearArchivoActionPerformed

    private void jmi_CrearCarpetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_CrearCarpetaActionPerformed

    }//GEN-LAST:event_jmi_CrearCarpetaActionPerformed

    private void jmi_PapeleraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_PapeleraActionPerformed
        JD_Papelera.setModal(true);
        JD_Papelera.pack();
        JD_Papelera.setLocationRelativeTo(null);
        JD_Papelera.setVisible(true);
        JD_Papelera.setVisible(false);
    }//GEN-LAST:event_jmi_PapeleraActionPerformed

    public String Link() {
        Random r = new Random();
        int numAletorio;
        String link = "";
        for (int i = 0; i < 5; i++) {
            numAletorio = 48 + r.nextInt(122);
            if (numAletorio >= 65 && numAletorio <= 89) {
                Character caracter = (char) numAletorio;
                link += caracter;
            } else if (numAletorio >= 97 && numAletorio <= 122) {
                Character caracter = (char) numAletorio;
                link += caracter;
            } else if (numAletorio >= 48 && numAletorio <= 57) {
                Character caracter = (char) numAletorio;
                link += caracter;
            } else {
                i--;
            }
        }
        return link;
    }

    public String Link2() {
        Random r = new Random();
        int numAletorio;
        String link = "";
        for (int i = 0; i < 10; i++) {
            numAletorio = 48 + r.nextInt(122);
            if (numAletorio >= 65 && numAletorio <= 89) {
                Character caracter = (char) numAletorio;
                link += caracter;
            } else if (numAletorio >= 97 && numAletorio <= 122) {
                Character caracter = (char) numAletorio;
                link += caracter;
            } else if (numAletorio >= 48 && numAletorio <= 57) {
                Character caracter = (char) numAletorio;
                link += caracter;
            } else {
                i--;
            }
        }
        return link;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog JD_Archivo;
    private javax.swing.JDialog JD_Destacado;
    private javax.swing.JDialog JD_MiUnidad;
    private javax.swing.JDialog JD_Papelera;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JMenuItem jmi_CrearArchivo;
    private javax.swing.JMenuItem jmi_CrearCarpeta;
    private javax.swing.JMenuItem jmi_Destacados;
    private javax.swing.JMenuItem jmi_MiUnidad;
    private javax.swing.JMenuItem jmi_Papelera;
    // End of variables declaration//GEN-END:variables
}
