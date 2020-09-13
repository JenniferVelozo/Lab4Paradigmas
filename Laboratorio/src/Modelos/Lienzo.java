/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Jennifer
 */
public class Lienzo extends JPanel{
    public Lienzo(){
        
    }
    public void paintComponent(Graphics p){
        super.paintComponent(p);
        p.setColor(Color.BLUE);
        p.fillRect(200,400, 50, 50);
    }
    
}
