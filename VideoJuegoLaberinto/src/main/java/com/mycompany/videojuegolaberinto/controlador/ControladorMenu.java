/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.videojuegolaberinto.controlador;

import com.mycompany.videojuegolaberinto.modelo.Elemento;
import com.mycompany.videojuegolaberinto.vista.GUIHistoria;
import com.mycompany.videojuegolaberinto.vista.GUIInstrucciones;
import com.mycompany.videojuegolaberinto.vista.GUILaberinto;
import com.mycompany.videojuegolaberinto.vista.GUIMenu;
import com.mycompany.videojuegolaberinto.vista.PanelLaberinto;
//import com.mycompany.videojuegolaberinto.vista.PanelLaberinto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author Luzdary Fernandez
 */
public class ControladorMenu implements ActionListener,MouseListener
{
    private GUIMenu guiMenu; 
    private GUIInstrucciones guiInstrucciones; 
    private GUIHistoria guiHistoria;
//    private PanelLaberinto panelLaberinto; 
    private GUILaberinto guiLaberinto;
    private Elemento sean; 
    private PanelLaberinto panelLaberinto;
    private ControladorLaberinto controladorLaberinto;
    private Hilo hilo;

    public ControladorMenu() {
        guiMenu=  new GUIMenu(this);
        guiInstrucciones= new GUIInstrucciones();
        guiInstrucciones.escuchar(this);
        guiHistoria= new GUIHistoria();
        guiHistoria.escuchar(this);
        guiLaberinto=new GUILaberinto(); 
        panelLaberinto=guiLaberinto.getPanelLaberinto(); 
        controladorLaberinto= new ControladorLaberinto(guiLaberinto);
        guiLaberinto.escucharClick(this);
        guiLaberinto.escucharTeclado(controladorLaberinto);
        controladorLaberinto.setPanelLaberinto(panelLaberinto);
        panelLaberinto.setControlador(controladorLaberinto);
        hilo=new Hilo(controladorLaberinto);
//        guiLaberinto.escucharClick(this);
//        sean= new Personaje(); 
//        panelLaberinto=guiLaberinto.getPanelLaberinto(); 
//        panelLaberinto.escuchar(this);
//        guiLaberinto.escuchar(this); 
        guiMenu.setVisible(true);
    }
    
    @Override
    public void mouseClicked(MouseEvent e){
        System.out.print("Presiono la coordenada x: "+ e.getX()+"y la coordenada y: "+ e.getY()+"\n"); 
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
        switch(e.getActionCommand()){
            case "instrucciones":
                guiMenu.setVisible(false);
               guiInstrucciones.setVisible(true);
                break;
                
            case "historia":
                 guiMenu.setVisible(false);
                 guiHistoria.setVisible(true);
                break;
                
            case "jugar":
                  guiMenu.setVisible(false);
                  guiLaberinto.setVisible(true);
                  hilo.start();
                 
                break;
                
            case "salir":
                 System.exit(0);
                break;
                
            case "regresarInstrucciones":
               guiInstrucciones.setVisible(false);
               guiMenu.setVisible(true);
               
            case "regresarHistoria":
                guiHistoria.setVisible(false);
                guiMenu.setVisible(true);
                break;
                
            default: System.out.print("Esa opcion no existe");;
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseReleased(MouseEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseEntered(MouseEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseExited(MouseEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

