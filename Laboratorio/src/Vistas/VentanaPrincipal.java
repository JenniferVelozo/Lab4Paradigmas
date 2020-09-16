
package Vistas;

import Modelos.Repositorio;

/**
 * La clase VentanaPrincipal  permite visualizar la simulación de git, mostrando botones para simular los comandos básicos de Git,
 * como init,add,commit,push, pull,status, y crear un archivo. Además, permite ver el contenido de las 4 zonas de trabajo.
 * @author Jennifer
 */
public class VentanaPrincipal extends javax.swing.JFrame {
    
    /**
     * Se crea un nuevo repositorio (relación de composición)
     */
    Repositorio myRepo=new Repositorio();
    
    /**
     * Inicializa los componentes de la ventana principal
     */
    public VentanaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jDialog1 = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        botonInit = new javax.swing.JButton();
        botonAdd = new javax.swing.JButton();
        botonCommit = new javax.swing.JButton();
        botonNuevoArchivo = new javax.swing.JButton();
        botonPull = new javax.swing.JButton();
        botonPush = new javax.swing.JButton();
        panelWorkspace = new javax.swing.JPanel();
        labelWorkspace = new javax.swing.JLabel();
        botonStatusWorkspace = new javax.swing.JButton();
        panelIndex = new javax.swing.JPanel();
        labelIndex = new javax.swing.JLabel();
        botonStatusIndex = new javax.swing.JButton();
        panelLocalR = new javax.swing.JPanel();
        labelLR = new javax.swing.JLabel();
        labelLR1 = new javax.swing.JLabel();
        botonStatusLR = new javax.swing.JButton();
        panelRR = new javax.swing.JPanel();
        labelRR = new javax.swing.JLabel();
        labelRR1 = new javax.swing.JLabel();
        botonStatusRR = new javax.swing.JButton();
        botonStatus = new javax.swing.JButton();
        botonExit = new javax.swing.JButton();
        tituloGit = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jMenu3.setText("jMenu3");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(51, 102, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        botonInit.setText("Init");
        botonInit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInitActionPerformed(evt);
            }
        });

        botonAdd.setText("add");
        botonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAddActionPerformed(evt);
            }
        });

        botonCommit.setText("commit");
        botonCommit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCommitActionPerformed(evt);
            }
        });

        botonNuevoArchivo.setText("Nuevo archivo");
        botonNuevoArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNuevoArchivoActionPerformed(evt);
            }
        });

        botonPull.setText("pull");
        botonPull.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPullActionPerformed(evt);
            }
        });

        botonPush.setText("push");
        botonPush.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPushActionPerformed(evt);
            }
        });

        panelWorkspace.setBackground(new java.awt.Color(255, 255, 255));

        labelWorkspace.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelWorkspace.setText("Workspace");

        botonStatusWorkspace.setText("Status");
        botonStatusWorkspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonStatusWorkspaceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelWorkspaceLayout = new javax.swing.GroupLayout(panelWorkspace);
        panelWorkspace.setLayout(panelWorkspaceLayout);
        panelWorkspaceLayout.setHorizontalGroup(
            panelWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelWorkspaceLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelWorkspace)
                .addGap(19, 19, 19))
            .addGroup(panelWorkspaceLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonStatusWorkspace)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelWorkspaceLayout.setVerticalGroup(
            panelWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelWorkspaceLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelWorkspace)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonStatusWorkspace)
                .addContainerGap())
        );

        panelIndex.setBackground(new java.awt.Color(255, 255, 255));

        labelIndex.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelIndex.setText("Index");

        botonStatusIndex.setText("Status");
        botonStatusIndex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonStatusIndexActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelIndexLayout = new javax.swing.GroupLayout(panelIndex);
        panelIndex.setLayout(panelIndexLayout);
        panelIndexLayout.setHorizontalGroup(
            panelIndexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIndexLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonStatusIndex)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelIndexLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelIndex)
                .addGap(24, 24, 24))
        );
        panelIndexLayout.setVerticalGroup(
            panelIndexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIndexLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelIndex)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonStatusIndex)
                .addContainerGap())
        );

        panelLocalR.setBackground(new java.awt.Color(255, 255, 255));

        labelLR.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelLR.setText("Local");

        labelLR1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelLR1.setText("Repository");

        botonStatusLR.setText("Status");
        botonStatusLR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonStatusLRActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLocalRLayout = new javax.swing.GroupLayout(panelLocalR);
        panelLocalR.setLayout(panelLocalRLayout);
        panelLocalRLayout.setHorizontalGroup(
            panelLocalRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLocalRLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelLR1)
                .addGap(20, 20, 20))
            .addGroup(panelLocalRLayout.createSequentialGroup()
                .addGroup(panelLocalRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLocalRLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botonStatusLR))
                    .addGroup(panelLocalRLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(labelLR)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLocalRLayout.setVerticalGroup(
            panelLocalRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLocalRLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelLR)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelLR1)
                .addGap(18, 18, 18)
                .addComponent(botonStatusLR)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        panelRR.setBackground(new java.awt.Color(255, 255, 255));

        labelRR.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelRR.setText("Remote");

        labelRR1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelRR1.setText("Repository");

        botonStatusRR.setText("Status");
        botonStatusRR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonStatusRRActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRRLayout = new javax.swing.GroupLayout(panelRR);
        panelRR.setLayout(panelRRLayout);
        panelRRLayout.setHorizontalGroup(
            panelRRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRRLayout.createSequentialGroup()
                .addGroup(panelRRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRRLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(panelRRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelRR1)
                            .addComponent(labelRR)))
                    .addGroup(panelRRLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botonStatusRR)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRRLayout.setVerticalGroup(
            panelRRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRRLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelRR)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelRR1)
                .addGap(18, 18, 18)
                .addComponent(botonStatusRR)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        botonStatus.setText("status");
        botonStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonStatusActionPerformed(evt);
            }
        });

        botonExit.setText("exit");
        botonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botonNuevoArchivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonInit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botonPull, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botonCommit, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                            .addComponent(botonPush, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonStatus)
                            .addComponent(botonExit)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(panelWorkspace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelIndex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelLocalR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelRR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelLocalR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelRR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelIndex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelWorkspace, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonInit)
                    .addComponent(botonAdd)
                    .addComponent(botonCommit)
                    .addComponent(botonStatus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonNuevoArchivo)
                    .addComponent(botonPull)
                    .addComponent(botonPush)
                    .addComponent(botonExit))
                .addGap(18, 18, 18))
        );

        tituloGit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tituloGit.setText("GIT");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(232, 232, 232)
                .addComponent(tituloGit, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloGit)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * Al hacer click en el botón "Init", se crea una VentanaInit para solicitar 
     * el nombre y autor del nuevo repositorio al usuario.
     * @param evt evento
     */
    private void botonInitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInitActionPerformed
        VentanaInit ventanaInit= new VentanaInit();
        ventanaInit.setVisible(true);
        ventanaInit.myRepo= myRepo;
        this.dispose();
    }//GEN-LAST:event_botonInitActionPerformed
    /**
     * Al hacer click en el botón "Nuevo archivo", se crea una VentanaNuevoArch 
     * para solicitar el nombre y contenido del archivo al usuario.
     * @param evt evento
     */
    private void botonNuevoArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNuevoArchivoActionPerformed
        VentanaNuevoArchivo ventanaNuevoArch= new VentanaNuevoArchivo();
        ventanaNuevoArch.setVisible(true);
        ventanaNuevoArch.myRepo=this.myRepo;
        this.dispose();
    }//GEN-LAST:event_botonNuevoArchivoActionPerformed
    
    /**
     * Al hacer click en el botón "commit", se crea una VentanaCommit 
     * para solicitar el mensaje y autor del commit al usuario.
     * @param evt evento
     */
    private void botonCommitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCommitActionPerformed
        VentanaCommit ventanaCommit= new VentanaCommit();
        ventanaCommit.setVisible(true);
        ventanaCommit.myRepo=this.myRepo;
        this.dispose();
    }//GEN-LAST:event_botonCommitActionPerformed
    
    /**
     * Al hacer click en el botón "add", se crea una VentanaAdd
     * @param evt evento
     */
    private void botonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAddActionPerformed
        VentanaAdd ventanaAdd= new VentanaAdd();
        ventanaAdd.setVisible(true);
        ventanaAdd.myRepo=this.myRepo;
        this.dispose();
    }//GEN-LAST:event_botonAddActionPerformed
    
    /**
     * Al hacer click en el botón "push", se hace el llamado al método gitPush de la clase Repositorio
     * @param evt evento
     */
    private void botonPushActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPushActionPerformed
        this.myRepo.gitPush();
    }//GEN-LAST:event_botonPushActionPerformed
    
    /**
     * Al hacer click en el botón "pull", se hace el llamado al método gitPull de la clase Repositorio
     * @param evt evento
     */
    private void botonPullActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPullActionPerformed
        this.myRepo.gitPull();
    }//GEN-LAST:event_botonPullActionPerformed
    
    /**
     * Permite mostrar una ventana para indicar los archivos que posee el Workspace.
     * @param evt evento
     */
    private void botonStatusWorkspaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonStatusWorkspaceActionPerformed
        VentanaStatus v1= new VentanaStatus();
        v1.areaDeTexto.setText(this.myRepo.workspace.toString());
        v1.titulo.setText("STATUS WORKSPACE");
        v1.setVisible(true);
    }//GEN-LAST:event_botonStatusWorkspaceActionPerformed
    
    /**
     * Permite mostrar una ventana para indicar los archivos que posee el Index.
     * @param evt evento
     */
    private void botonStatusIndexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonStatusIndexActionPerformed
        VentanaStatus v1= new VentanaStatus();
        v1.areaDeTexto.setText(this.myRepo.index.toString());
        v1.titulo.setText("STATUS INDEX");
        v1.setVisible(true);
    }//GEN-LAST:event_botonStatusIndexActionPerformed
    
    /**
     * Permite mostrar una ventana para indicar los commit que posee el Local Repository.
     * @param evt evento
     */
    private void botonStatusLRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonStatusLRActionPerformed
        VentanaStatus v1= new VentanaStatus();
        v1.areaDeTexto.setText(this.myRepo.localR.toString());
        v1.titulo.setText("STATUS LOCAL REPOSITORY");
        v1.setVisible(true);
    }//GEN-LAST:event_botonStatusLRActionPerformed

       /**
     * Permite mostrar una ventana para indicar los commits que posee el Remote Repository.
     * @param evt evento
     */
    private void botonStatusRRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonStatusRRActionPerformed
        VentanaStatus v1= new VentanaStatus();
        v1.areaDeTexto.setText(this.myRepo.remoteR.toString());
        v1.titulo.setText("STATUS REMOTE REPOSITORY");
        v1.setVisible(true);
    }//GEN-LAST:event_botonStatusRRActionPerformed

    /**
    * Permite mostrar una ventana para indicar el estado actual del repositorio Git.
    * @param evt evento
    */
    private void botonStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonStatusActionPerformed
        VentanaStatus v1= new VentanaStatus();
        v1.areaDeTexto.setText(this.myRepo.gitStatus());
        v1.titulo.setText("GIT STATUS");
        v1.setVisible(true);
    }//GEN-LAST:event_botonStatusActionPerformed

    /**
     * Permite finalizar la simulación de Git, cerrando la ventana principal.
     * @param evt evento
     */
    private void botonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonExitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton botonAdd;
    public javax.swing.JButton botonCommit;
    private javax.swing.JButton botonExit;
    private javax.swing.JButton botonInit;
    public javax.swing.JButton botonNuevoArchivo;
    public javax.swing.JButton botonPull;
    public javax.swing.JButton botonPush;
    public javax.swing.JButton botonStatus;
    public javax.swing.JButton botonStatusIndex;
    public javax.swing.JButton botonStatusLR;
    public javax.swing.JButton botonStatusRR;
    public javax.swing.JButton botonStatusWorkspace;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelIndex;
    private javax.swing.JLabel labelLR;
    private javax.swing.JLabel labelLR1;
    private javax.swing.JLabel labelRR;
    private javax.swing.JLabel labelRR1;
    private javax.swing.JLabel labelWorkspace;
    private javax.swing.JPanel panelIndex;
    private javax.swing.JPanel panelLocalR;
    private javax.swing.JPanel panelRR;
    private javax.swing.JPanel panelWorkspace;
    private javax.swing.JLabel tituloGit;
    // End of variables declaration//GEN-END:variables
}
