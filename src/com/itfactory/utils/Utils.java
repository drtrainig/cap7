package com.itfactory.utils;

import com.itfactory.problema1.Electronice;
import com.itfactory.problema1.Imbracaminte;
import com.itfactory.problema1.IngrijirePersonala;
import com.itfactory.problema1.Produs;

import java.util.Scanner;

public class Utils {

    private static final Scanner scanner;

    //Acest bloc static este executat o singura data atunci cand se apeleaza orice metoda.
    //O sa am access la scanner in metode
    static {
        scanner = new Scanner(System.in);
    }

    public static Imbracaminte citesteImbracaminte() {
        System.out.println("Datele produsului de tip imbracaminte");
        Produs produs = citesteProdus();
        System.out.print("Introduceti tipul de imbracaminte: ");
        String tipImbracaminte = scanner.nextLine();
        return new Imbracaminte(produs.getNumeProdus(), produs.getPret(), produs.getDiscount(), tipImbracaminte);
    }


    public static Electronice citesteElectronice() {
        System.out.println("Datele produsului de tip electronice");
        Produs produs = citesteProdus();
        System.out.print("Introduceti voltajul: ");
        int voltaj = Integer.parseInt(scanner.nextLine());
        return new Electronice(produs.getNumeProdus(), produs.getPret(), produs.getDiscount(), voltaj);
    }

    public static IngrijirePersonala citesteProdusDeIngrijirePersonala() {
        System.out.println("Datele produsului de tip ingrijire personala");
        Produs produs = citesteProdus();
        System.out.print("Introduceti true sau false daca produsul este returnabil sau nu: ");
        boolean returnabil = Boolean.parseBoolean(scanner.nextLine());
        return new IngrijirePersonala(produs.getNumeProdus(), produs.getPret(), produs.getDiscount(), returnabil);
    }

    public static Produs citesteProdus() {
        System.out.print("Introduceti nume produs: ");
        String numeProdus = scanner.nextLine();
        System.out.print("Introduceti pret produs: ");
        double pretProdus = Double.parseDouble(scanner.nextLine());
        System.out.print("Introduceti discountul initial: ");
        int discountInitial = Integer.parseInt(scanner.nextLine());
        return new Produs(numeProdus, pretProdus, discountInitial);
    }
}
