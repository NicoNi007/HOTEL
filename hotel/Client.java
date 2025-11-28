
package com.mycompany.hotel;

import java.time.LocalDate;

public class Client {
    
    private String nom;
    private String cognom;
    private String NIF;
    private LocalDate dataNaixement;
    private String localitat;

    public Client(String nom, String cognom, String NIF, LocalDate dataNaixement,  String localitat) {
        this.nom = nom;
        this.cognom = cognom;
        this.NIF = NIF;
        this.dataNaixement = dataNaixement;
        this.localitat = localitat;
    }

    public String getNom() {
        return nom;
    }

    public String getCognom() {
        return cognom;
    }

    public String getNIF() {
        return NIF;
    }

    public LocalDate getDataNaixement() {
        return dataNaixement;
    }

    public String getLocalitat() {
        return localitat;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public void setDataNaixement(LocalDate dataNaixement) {
        this.dataNaixement = dataNaixement;
    }

    public void setLocalitat(String localitat) {
        this.localitat = localitat;
    }

    @Override
    public String toString() {
        return "Client{" + "nom=" + nom + ", cognom=" + cognom + ", NIF=" + NIF + ", dataNaixement=" + dataNaixement + ", localitat=" + localitat + '}';
    }

 

    
    

        
    
}
