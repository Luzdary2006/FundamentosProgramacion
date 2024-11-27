/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.videojuegolaberinto.modelo;

import javax.swing.ImageIcon;

/**
 *
 * @author Luzdary Fernandez
 */
public class Enemigo extends Personaje {
    
    public Enemigo(int fila, int columna, int x, int y, ImageIcon imagen) {
        super(fila, columna, x, y, imagen);
    }
    
    public void mover(){
        x=x+10; 
//        setY(getY()-10); otra forma de acceder al atributo cuando esta privado en la clase padre
    }
    
    
}
