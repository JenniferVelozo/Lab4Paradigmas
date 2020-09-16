
package Modelos;

import Vistas.VentanaPrincipal;

/**
 *
 * @author Jennifer Velozo
 */
public class Principal {
    public static void main(String[] args){  
        //Se crea una nueva ventana
        VentanaPrincipal v1 = new VentanaPrincipal();
        //Se hace visible la ventana
        v1.setVisible(true);
        v1.botonStatusWorkspace.setEnabled(false);
        v1.botonStatusIndex.setEnabled(false);
        v1.botonStatusLR.setEnabled(false);
        v1.botonStatusRR.setEnabled(false);
        v1.botonAdd.setEnabled(false);
        v1.botonCommit.setEnabled(false);
        v1.botonNuevoArchivo.setEnabled(false);
        v1.botonPull.setEnabled(false);
        v1.botonPush.setEnabled(false);
        v1.botonStatus.setEnabled(false);
        
    }
}
