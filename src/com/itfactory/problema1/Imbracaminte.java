package com.itfactory.problema1;

public class Imbracaminte extends Produs {

    private String tipImbracaminte;

    public Imbracaminte(String numeProdus, double pret, int discount, String tipImbracaminte) {
        super(numeProdus, pret, discount);
        this.tipImbracaminte = tipImbracaminte;
    }

    public String getTipImbracaminte() {
        return tipImbracaminte;
    }
}
