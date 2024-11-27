/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.videojuegolaberinto.controlador;

import com.mycompany.videojuegolaberinto.modelo.AreaJuego;
import com.mycompany.videojuegolaberinto.vista.GUILaberinto;
import com.mycompany.videojuegolaberinto.vista.PanelLaberinto;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;

/**
 *
 * @author Luzdary Fernandez
 */
public class ControladorLaberinto implements KeyListener {
    private GUILaberinto guiLaberinto;
    private PanelLaberinto panelLaberinto;
    private AreaJuego areaJuego;

    public ControladorLaberinto(GUILaberinto guiLaberinto) {
        this.guiLaberinto = guiLaberinto;
        areaJuego= new AreaJuego();
    }

    public void setPanelLaberinto(PanelLaberinto panelLaberinto) {
        this.panelLaberinto = panelLaberinto;
    }
    
    public int getC(){
        return areaJuego.getPersonaje().getX();
    }
    
    public int getF(){
        return areaJuego.getPersonaje().getY();
    }
    public void dibujar(Graphics g){
        areaJuego.dibujar(g);
    }
    
    public int getCelda(){
        return areaJuego.getCelda();
    }

    public void moverEnemigo(){
        areaJuego.moverEnemigo();
        panelLaberinto.repaint();
    }
    
   
    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch(e.getKeyCode()){
            case KeyEvent.VK_UP:
                areaJuego.caminar("arriba");
                break;
                
            case KeyEvent.VK_DOWN:
                areaJuego.caminar("abajo");
                break;
                
            case KeyEvent.VK_LEFT:
                areaJuego.caminar("izquierda");
                break;
                
            case KeyEvent.VK_RIGHT:
                areaJuego.caminar("derecha");
                break;
        }
      System.out.println("presiono una tecla\n");
    }
        

    @Override
    public void keyReleased(KeyEvent e) {
        
    }
    
    
}
