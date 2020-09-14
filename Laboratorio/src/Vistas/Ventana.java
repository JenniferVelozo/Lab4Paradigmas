
package Vistas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
//JFrame es una clase perteneciente a la biblioteca javax.swing, que permite crear ventanas
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


import Modelos.Lienzo;
import Modelos.Repositorio;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

/**
 *
 * @author Jennifer
 */
public class Ventana extends JFrame{
    
    Repositorio repo;
   
    public Ventana(){
        iniciarComponentes();
        //Se establecen las dimensiones de la ventana (ancho,largo)
        this.setSize(600, 600);
        //Se establece un título para la ventana
        this.setTitle("Simulación de Git");
        //Para que al cerrar la ventana se termine de ejecutar el programa
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.getContentPane().setBackground(Color.BLUE);
    }
    
    //Creamos un método para crear un panel
    //El panel se coloca encima de la ventana
    private void iniciarComponentes(){
        JPanel  panel = new JPanel();
        //Se establece el color del panel
        panel.setBackground(new Color(175, 238, 238));
        //Se coloca el panel encima de la ventana
        this.getContentPane().add(panel);
        //Se desactiva el diseño del panel por defecto
        panel.setLayout(null);
        
        JLabel bienvenida = new JLabel("SIMULACIÓN DE GIT",SwingConstants.CENTER);
        //bienvenida.setText("SIMULACIÓN DE GIT");
        bienvenida.setBounds(160,10,200,30); //x,y,ancho,alto
        //Establece el color de la letra
        bienvenida.setForeground(Color.PINK);
        //Permiso para editar el fondo de la etiqueta
        bienvenida.setOpaque(true);
        //Color de fondo de la etiqueta
        bienvenida.setBackground(Color.white);
        //Para cambiar la fuente de la etiqueta
        bienvenida.setFont(new Font("Fuente", Font.CENTER_BASELINE, 20));
        //Se agrega la etiqueta al panel
        panel.add(bienvenida);
        
          
        JLabel label1 = new JLabel("Ingrese nombre del nuevo repositorio");
        label1.setBounds(150,40,400,50);
        panel.add(label1);
          
        JTextField JTextField1 = new JTextField();
        JTextField1.setBounds(200,80,100,30);
        panel.add(JTextField1);
          
        JLabel label2 = new JLabel();
        label2.setText("Ingrese autor del nuevo repositorio");
        label2.setBounds(150,100,400,50);
        panel.add(label2);
          
        JTextField JTextField2 = new JTextField();
        JTextField2.setBounds(200,140,100,30);
        panel.add(JTextField2);
          
        JButton JButton1 = new JButton();
        JButton1.setBounds(177,200,140,50);
        JButton1.setText("Iniciar Repositorio");
        panel.add(JButton1);
        
        JRadioButton botonAdd= new JRadioButton();
        botonAdd.setBounds(10,300,70,30);
        botonAdd.setText("Add");
        
        JRadioButton botonCommit= new JRadioButton();
        botonCommit.setBounds(10,320,70,30);
        botonCommit.setText("Commit");
        
        JRadioButton botonPush= new JRadioButton();
        botonPush.setBounds(10,340,70,30);
        botonPush.setText("Push");
        
        JRadioButton botonPull= new JRadioButton();
        botonPull.setBounds(10,360,70,30);
        botonPull.setText("Pull");
       
        ActionListener ActionListener1 = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
             
                String nombreRepo = String.valueOf(JTextField1.getText());
                String autorRepo = String.valueOf(JTextField2.getText());
                Ventana.this.repo.gitInit(nombreRepo, autorRepo);
                //x,y , ANCHO DEL BOTON/ALTURA DEL BOTON
                JLabel opciones = new JLabel();
                opciones.setText("Escoja una opción");
                opciones.setBounds(10,290,400,50);
                panel.add(opciones);
                
                panel.add(botonAdd);
                panel.add(botonCommit);
                panel.add(botonPush);
                panel.add(botonPull);
                ButtonGroup grupoBotones= new ButtonGroup();
                grupoBotones.add(botonAdd);
                grupoBotones.add(botonCommit);
                grupoBotones.add(botonPush);
                grupoBotones.add(botonPull);
                
                    
            }
        }; 
        JButton1.addActionListener(ActionListener1);
        
        ActionListener ActionListener2 = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
             
                /*String nombreRepo = String.valueOf(JTextField1.getText());
                String autorRepo = String.valueOf(JTextField2.getText());
                myRepo.gitInit(nombreRepo,autorRepo);
                //x,y , ANCHO DEL BOTON/ALTURA DEL BOTON
                JRadioButton botonAdd= new JRadioButton("ADD",true);
                botonAdd.setBounds(10,300,70,30);
                JPanel1.add(botonAdd);*/
                
                
            }
        }; 
        botonAdd.addActionListener(ActionListener2);
    }
     
     
  
     
     
}
