/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cine;

/**
 *
 * @author Luzdary Fernandez
 */
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Cine {

    public static void main(String[] args) {
        CinemaRoom cinemaRoom;
        Movie movie;
        CashRegister cashRegister;
        cashRegister= new CashRegister(); 
        int ticketPrice;
        ticketPrice=3500; 
        Scanner scanner= new Scanner (System.in);
        char option;
        String input;  
        
        do {
             input=JOptionPane.showInputDialog("*********************Boletería*********************"
		      +"\na.Vender boleto. "
		      +"\nb.Devolver entrada."
		      +"\nc.Ver disponibilidad de espacios."
		      +"\nd.Ver información de la película."
		      +"\ne.Cerrar boletería."
		      +"\nf.Ver total recaudado."
                     + "\ng.Salir."); 
             option = input != null ? input.charAt(0) : 'g'; 
             
              switch(option ){
               
                  case 'a':
                      cashRegister= new CashRegister(); 
                      int ticketPayment=Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de tickets que desea comprar.")); 
                             JOptionPane.showMessageDialog(null,"El monto a pagar es de " +cashRegister.increaseAmountCollected(ticketPayment));
                      
                      break;
                      
                  case 'b':
                       cashRegister=new CashRegister(); 
                       double returnTicket=Double.parseDouble(JOptionPane.showInputDialog("Digite la cantidad de entradas que desea devolver."));
                       JOptionPane.showMessageDialog(null, "Se ha realizado el reembolso exitosamente de una cantidad de "+cashRegister.cashBack(returnTicket));
                       
                      break;
                  
                  case 'c':
                       cinemaRoom=new CinemaRoom();
                       ticketPayment=0;
                      JOptionPane.showMessageDialog(null,"La cantidad de asientos disponibles es de "+cinemaRoom.seatsAvailable(ticketPayment));
                       
                      break;
                      
                  case 'd':
                      movie=new Movie ();
                      String title=(JOptionPane.showInputDialog("Escriba  el titulo de la pelicula en cartelera."));
                      String director=(JOptionPane.showInputDialog("Escriba el nombre del director de la pelicula."));
                      String category=(JOptionPane.showInputDialog("Escriba la categoria de la pelicula."));
                      int duration=Integer.parseInt(JOptionPane.showInputDialog("Digite el tiempo de duracion de la pelicula."));
                      JOptionPane.showMessageDialog(null,movie.toString());
                      break;
                      
                  case 'e':
                    
                      break;
                      
                  case 'f':
                      JOptionPane.showMessageDialog(null, cashRegister.getAmountCollected());
                      break;
                      
                  case 'g':
                      
                      break;
                      
                  default: 
              }
            
        }while(option!='g' );
        
       scanner.close();
}
   
}
