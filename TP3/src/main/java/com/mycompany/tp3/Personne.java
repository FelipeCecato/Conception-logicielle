/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp3;

/**
 *
 * @author Felipe
 */
public abstract class Personne {
    
    private String name;
    private Integer âge;
    
    public Personne(String Name, Integer Âge){
        this.name = Name;
        this.âge = Âge;
    }
    
    public Personne(){
        this.name = "No nome";
        this.âge = 0;
    }
    
}
