/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hotel;

/**
 *
 * @author nicod
 */
public class Servei {
    
    private int idServei;
    private String descripcio;
    private double preu;

    public Servei(int idServei, String descripcio, double preu) {
        this.idServei = idServei;
        this.descripcio = descripcio;
        this.preu = preu;
    }

    public int getIdServei() {
        return idServei;
    }

    public String getDescripcio() {
        return descripcio;
    }

    public double getPreu() {
        return preu;
    }

    public void setIdServei(int idServei) {
        this.idServei = idServei;
    }

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }
    
    
    
}
