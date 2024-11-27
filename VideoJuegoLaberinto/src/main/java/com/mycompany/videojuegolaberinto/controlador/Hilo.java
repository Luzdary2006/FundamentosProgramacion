/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.videojuegolaberinto.controlador;

import com.mycompany.videojuegolaberinto.modelo.AreaJuego;

/**
 *
 * @author Luzdary Fernandez
 */
public class Hilo extends Thread{
  private AreaJuego areaJuego;
  private ControladorLaberinto controladorLaberinto;
  private boolean estado;
    public Hilo(ControladorLaberinto controladorLaberinto) {
        this.controladorLaberinto=controladorLaberinto;
        estado=true;
    }
    
    public void run(){
      while(true){
          try{
              if(estado){
                 controladorLaberinto.moverEnemigo();
//                 System.out.println("Moviendoo"); 
              }
              
              sleep(200);
          }
           catch(InterruptedException ex){
               System.out.println(""+ex);
           }
          
      }
    }
  
}
