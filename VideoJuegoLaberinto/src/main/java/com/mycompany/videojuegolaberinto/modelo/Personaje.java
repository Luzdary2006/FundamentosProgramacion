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
public class Personaje extends Elemento {
    private int fila;
    protected int columna;

    public Personaje(int fila,int columna,int x, int y, ImageIcon imagen) {
        super(x, y, imagen);
        this.fila=fila;
        this.columna=columna;
    }

    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }
    
    
    
}
