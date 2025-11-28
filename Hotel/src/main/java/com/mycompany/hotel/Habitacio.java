/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hotel;

/**
 *
 * @author nicod
 */
public class Habitacio {
    
    private int numHabitacio;
    private double preuPerNit;
    private boolean ocupada;

    public Habitacio(int numHabitacio, double preuPerNit, boolean ocupada) {
        this.numHabitacio = numHabitacio;
        this.preuPerNit = preuPerNit;
        this.ocupada = ocupada;
    }

    public int getNumHabitacio() {
        return numHabitacio;
    }

    public double getPreuPerNit() {
        return preuPerNit;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setNumHabitacio(int numHabitacio) {
        this.numHabitacio = numHabitacio;
    }

    public void setPreuPerNit(double preuPerNit) {
        this.preuPerNit = preuPerNit;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    @Override
    public String toString() {
        return "Habitacio{" + "numHabitacio=" + numHabitacio + ", preuPerNit=" + preuPerNit + ", ocupada=" + ocupada + '}';
    }
    
    
    
}
