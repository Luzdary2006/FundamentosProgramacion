/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.videojuegolaberinto.modelo;

import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author Luzdary Fernandez
 */
public class Elemento {
    protected int x;
    private int y;
    private ImageIcon imagen; 
    
    public Elemento(int x, int y, ImageIcon imagen){
        this.x=x;
        this.y=y;
        this.imagen=imagen;
    }
    

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public ImageIcon getImagen() {
        return imagen;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setImagen(ImageIcon imagen) {
        this.imagen = imagen;
    }
    
    public void show(Graphics g){
       imagen.paintIcon(null, g, x, y);
    }
    
    
}
