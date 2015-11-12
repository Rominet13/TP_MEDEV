/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_medev;

/**
 *
 * @author Hicham
 */
public abstract class Case {
    private String nom;
    private int numero;
    
    // Constructors

    public Case(String nom, int numero) {
        this.nom = nom;
        this.numero = numero;
    }
    
    // Getters

    public String getNom() {
        return nom;
    }

    public int getNumero() {
        return numero;
    }
    
    // Setters

    public void setNom(String Nom) {
        this.nom = nom;
    }

    public void setNumero(int Numero) {
        this.numero = numero;
    }    
    
    /**
     * @author jvuil
     */
    public abstract String toString();
}
