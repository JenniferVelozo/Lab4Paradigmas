
package Vistas;

import Modelos.Repositorio;

/**
 * La clase VentanaInit permite desplegar una ventana para solicitar el nombre y autor del repositorio al usuario,
 * por medio del método gitInit de la clase Repositorio.
 * Cabe destacar que, esta clase tiene a la clase Repositorio, por lo que se tiene una relación de agregación.
 * @author Jennifer
 */
public class VentanaInit extends javax.swing.JFrame {
    
    //Atributos
    Repositorio myRepo; //un repositorio
    
    /**
     * Se inicilizan los componentes de la VentanaInit
     */
    public VentanaInit() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        labelNombreRepo = new javax.swing.JLabel();
        nombreRepo = new javax.swing.JTextField();
        labelAutorRepo = new javax.swing.JLabel();
        autorRepo = new javax.swing.JTextField();
        botonIniciarRepo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));

        titulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        titulo.setText("INICIANDO REPOSITORIO");

        labelNombreRepo.setText("Ingrese nombre del nuevo repositorio");

        labelAutorRepo.setText("Ingrese autor del nuevo repositorio");

        botonIniciarRepo.setText("Iniciar Repositorio");
        botonIniciarRepo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIniciarRepoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(nombreRepo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(botonIniciarRepo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(autorRepo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 88, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titulo)
                    .addComponent(labelAutorRepo)
                    .addComponent(labelNombreRepo))
                .addGap(70, 70, 70))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelNombreRepo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombreRepo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelAutorRepo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(autorRepo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonIniciarRepo)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Permite inicializar el repositorio con un nombre y autor, y sus zonas de trabajo vacías.
     * Esto, por medio del método gitInit de la clase Repositorio.
     * Además se habilitan los demás botones de la ventana principal.
     * @param evt evento
     */
    private void botonIniciarRepoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIniciarRepoActionPerformed
        String nombreRepositorio= String.valueOf(nombreRepo.getText());
        String autorRepositorio= String.valueOf(autorRepo.getText());
        //Se inicializa el repositorio con el nombre y autor ingresados por el usuario
        this.myRepo.gitInit(nombreRepositorio, autorRepositorio);
                
        this.dispose();
        VentanaPrincipal VentanaRepoIniciado=new VentanaPrincipal();
        VentanaRepoIniciado.myRepo=this.myRepo;
        VentanaRepoIniciado.setVisible(true);
        VentanaRepoIniciado.botonStatusWorkspace.setEnabled(true);
        VentanaRepoIniciado.botonStatusIndex.setEnabled(true);
        VentanaRepoIniciado.botonStatusLR.setEnabled(true);
        VentanaRepoIniciado.botonStatusRR.setEnabled(true);
        VentanaRepoIniciado.botonAdd.setEnabled(true);
        VentanaRepoIniciado.botonCommit.setEnabled(true);
        VentanaRepoIniciado.botonNuevoArchivo.setEnabled(true);
        VentanaRepoIniciado.botonPull.setEnabled(true);
        VentanaRepoIniciado.botonPush.setEnabled(true);
        this.dispose();
        
    }//GEN-LAST:event_botonIniciarRepoActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaInit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaInit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaInit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaInit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaInit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField autorRepo;
    private javax.swing.JButton botonIniciarRepo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelAutorRepo;
    private javax.swing.JLabel labelNombreRepo;
    private javax.swing.JTextField nombreRepo;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
