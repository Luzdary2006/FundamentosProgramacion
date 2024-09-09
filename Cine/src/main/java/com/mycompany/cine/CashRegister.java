/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cine;

/**
 *
 * @author Luzdary Fernandez
 */
public class CashRegister {
    private double amountCollected;
    
    public CashRegister( ) {
        
    }
    
    public CashRegister (double amountCollected){
        
    }
    
    public void setAmountCollected (double amountCollected){
        
    }
    
   public double getAmountCollected ( ){
       return amountCollected;
   }
    
    public double increaseAmountCollected (int ticketPayment ) { 
        return (3500*ticketPayment)+amountCollected; 
    }
    
    
    public double cashBack (double returnTicket){
        return 3500*returnTicket;
    }
    public double decreaseAmountCollected(double returnTicket){
        return (3500*returnTicket)-amountCollected;
    }
    
    
}
