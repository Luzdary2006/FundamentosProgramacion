/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cine;

/**
 *
 * @author Luzdary Fernandez
 */
public class Movie {
    private int duration;
    private String title, director, category;
    
    public Movie ( ) {
        
    }
    
    public Movie (String title, String director, String category, int duration){
        
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }
    
    

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
    

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Movie=" + "duration=" + duration + ", title=" + title + ", director=" + director + ", category=" + category + '}';
    }
    
    
    
}
