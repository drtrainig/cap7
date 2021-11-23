package com.itfactory.problema1;

public class IngrijirePersonala extends Produs {
    private boolean returnabil;

    public IngrijirePersonala(String numeProdus, double pret, int discount, boolean returnabil) {
        super(numeProdus, pret, discount);
        this.returnabil = returnabil;
    }

    public boolean getReturnabil() {
        return returnabil;
    }
}
