
package com.mycompany.hotel;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Estada {
    private Client client;
    private Habitacio habitacio;
    private ArrayList<Servei> serveis;
    private LocalDateTime dataEntrada;
    private LocalDateTime dataSortida;
    private double importActualGastat;
    private double facturaFinal;
    private boolean pagat;

    public Estada(Client client, LocalDateTime dataEntrada, LocalDateTime dataSortida) {
        this.client = client;
        this.habitacio = null;
        this.serveis = new ArrayList<>();
        this.dataEntrada = dataEntrada;
        this.dataSortida = dataSortida;
        this.importActualGastat = 0;
        this.facturaFinal = 0;
        this.pagat = false;
    }

    public Client getClient() {
        return client;
    }

    public Habitacio getHabitacio() {
        return habitacio;
    }

    public ArrayList<Servei> getServeis() {
        return serveis;
    }

    public LocalDateTime getDataEntrada() {
        return dataEntrada;
    }

    public LocalDateTime getDataSortida() {
        return dataSortida;
    }

    public double getImportActualGastat() {
        return importActualGastat;
    }

    public double getFacturaFinal() {
        return facturaFinal;
    }

    public boolean isPagat() {
        return pagat;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setHabitacio(Habitacio habitacio) {
        this.habitacio = habitacio;
    }

    public void setServeis(ArrayList<Servei> serveis) {
        this.serveis = serveis;
    }

    public void setDataEntrada(LocalDateTime dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public void setDataSortida(LocalDateTime dataSortida) {
        this.dataSortida = dataSortida;
    }

    public void setImportActualGastat(double importActualGastat) {
        this.importActualGastat = importActualGastat;
    }

    public void setFacturaFinal(double facturaFinal) {
        this.facturaFinal = facturaFinal;
    }

    public void setPagat(boolean pagat) {
        this.pagat = pagat;
    }

    @Override
    public String toString() {
        return "Estada{" + "client=" + client + ", habitacio=" + habitacio + ", serveis=" + serveis + ", dataEntrada=" + dataEntrada + ", dataSortida=" + dataSortida + ", importActualGastat=" + importActualGastat + ", facturaFinal=" + facturaFinal + ", pagat=" + pagat + '}';
    }
    
    
    
    
}
