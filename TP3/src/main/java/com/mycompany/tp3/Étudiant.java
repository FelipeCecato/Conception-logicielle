/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp3;

import java.util.ArrayList;

/**
 *
 * @author Felipe
 */
public class Étudiant extends Personne{
    private Integer numeroEtudiant;
    private Integer moyenne;
    private ArrayList<String> cours = new ArrayList<>();
    
    public Étudiant(String name, Integer âge,String prenom, Integer numeroEtudiant) {
            super(name, âge); 
            this.numeroEtudiant = numeroEtudiant;
            this.moyenne = 0; 
            this.cours = new ArrayList<>(); 
    }
}
