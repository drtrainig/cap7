package com.itfactory.problema1;

public class Electronice extends Produs {

    private int voltaj;

    public Electronice(String numeProdus, double pret, int discount, int voltaj) {
        super(numeProdus, pret, discount);
        this.voltaj = voltaj;
    }

    public int getVoltaj() {
        return voltaj;
    }
}
