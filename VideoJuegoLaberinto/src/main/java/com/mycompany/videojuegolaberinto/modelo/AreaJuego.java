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
public class AreaJuego {
    private Laberinto laberinto;
    private Personaje sean; 
    private int coordenadasX[]={25,42,86,122,141,169,191,218,243,260,297,318,346,370,394,417,444,466,490,514,542,570,};
    private int coordenadasY[]={52,85,110,135,150,168,197,221,246,269,294,320,346,375,400,424,438,469,495,516,544,574,590};
    private Enemigo enemigo;
    
    public AreaJuego(){
       laberinto=new Laberinto();
       posicionarPersonajes();
    }
    
    public int getCelda(){
        return laberinto.getCelda(sean.getFila(), sean.getColumna());
    }
    public void posicionarPersonajes(){
        sean= new Personaje(1,11,coordenadasX[11],coordenadasY[1],new ImageIcon("./src/main/resources/ImagenesJuego/Gift-Pequeño.gif"));
        enemigo= new Enemigo(15,0,30,100,new ImageIcon("./src/main/resources/ImagenesJuego/personaje-animadopequeño.gif"));
        
    }
    
    public void dibujar(Graphics g){
        sean.show(g); 
        enemigo.show(g);
    }
    
    public void moverEnemigo(){
        enemigo.mover();
        
    }
    
    public void caminar(String dirigir){
        int filaDestino=sean.getFila();
        int columnaDestino=sean.getColumna();
       
        switch(dirigir){
           case"arriba":
               filaDestino--;
               break;
               
           case "abajo":
               filaDestino++;
               break;
               
           case "derecha":
                columnaDestino++;
                break;
                
           case "izquierda":
               columnaDestino--;
               break;
        }
        if((isValido(filaDestino, columnaDestino))){//&& laberinto.getCelda(filaDestino, columnaDestino)==0){
        sean.setFila(filaDestino);
        sean.setColumna(columnaDestino);
        sean.setX(coordenadasX[columnaDestino]);
        sean.setY(coordenadasY[filaDestino]);
        } 
    }
    
    public boolean isValido(int filaDestino, int columnaDestino){
        if((filaDestino>=0) && (filaDestino<21) && (columnaDestino>=0) && (columnaDestino<23)){
           System.out.println("Entré isValido");
            return true; 
        }
        return false;
    }
    
    public Personaje getPersonaje(){
        return sean;
    }
}
