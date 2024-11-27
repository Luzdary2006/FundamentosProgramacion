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
public class Principal extends Personaje {
    private int vidas;
    
    public Principal(int fila, int columna, int x, int y, ImageIcon imagen, int vidas) {
        super(fila, columna, x, y, imagen);
        vidas=0;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }
    
    
}
