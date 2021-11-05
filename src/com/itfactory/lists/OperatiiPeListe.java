package com.itfactory.lists;

import com.itfactory.utils.Persoana;

import java.util.ArrayList;
import java.util.List;

public class OperatiiPeListe {
    public static void main(String[] args) {

        List<Persoana> persoane = new ArrayList<>();

        /**
         * Adaugare elemente
         */
        persoane.add(new Persoana("Ion Popescu", 30));
        persoane.add(new Persoana("Vasile Pruna", 32));
        persoane.add(new Persoana("Maria Popescu", 28));

        /**
         * Adaugare o lista de elemente
         */
        List<Persoana> persoaneAditionale = new ArrayList<>();
        persoaneAditionale.add(new Persoana("Florin Calin", 28));
        persoaneAditionale.add(new Persoana("Ion Ion", 21));
        //Adaug toata lista
        persoane.addAll(persoaneAditionale);

        /**
         * Lungime
         */
        System.out.println("Lungime: " + persoane.size());

        /**
         * Contains
         */
        Persoana anonim = new Persoana("Ion Popescu", 30);
        System.out.println("Contine 1 element  ?: " + persoane.contains(anonim));

        System.out.println("Contine o lista de elemente? " + persoane.containsAll(persoaneAditionale));

        /**
         * Egalitatea a doua liste
         */
        System.out.println("Egalitate? " + persoane.equals(persoaneAditionale));

        /**
         * Stergerea unui element
         */
        persoane.remove(anonim);
        System.out.println(persoane);
    }
}
