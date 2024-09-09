/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cine;

/**
 *
 * @author Luzdary Fernandez
 */
public class CinemaRoom {
     private int capacity=60; 
     private int occupiedSeat=0; 
     CashRegister cashRegister;
    
    public CinemaRoom ( ){
        
    }
    
    public CinemaRoom (int capacity){
        
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
    
    

    public void setOccupiedSeat(int occupiedSeat) {
        this.occupiedSeat = occupiedSeat;
    }

    public int getOccupiedSeat() {
        return occupiedSeat;
    }
    
    public int decreaseOccupiedSeat (int vacateSeat ){
        return occupiedSeat-vacateSeat;
    }
    
    public int seatsAvailable (int occupiedSeat ){ 
        
        return capacity-occupiedSeat;
    }
  
}
