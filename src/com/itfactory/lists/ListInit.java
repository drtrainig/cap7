package com.itfactory.lists;

import java.util.ArrayList;
import java.util.List;

public class ListInit {
    public static void main(String[] args) {

        /**
         * Exemplu construire si initializare
         */
        List<String> fructe = new ArrayList<>();
        fructe.add("mar");
        fructe.add("asdasd");
        System.out.println(fructe);

        /**
         * Accesare elemente
         */
        String mar = fructe.get(0);
        System.out.println("aici" + mar);
        String par = fructe.get(1);
        System.out.println(par);

        /**
         * Parcurgere elemente.Metoda 1
         */
        for (int i = 0; i < fructe.size(); i++) {
            System.out.println(fructe.get(i));
        }

        /**
         * Parcurgere elemente.Metoda 2
         */
        for (String fruct : fructe) {
            System.out.println(fruct);
        }
    }
}
