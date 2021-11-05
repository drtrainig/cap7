package com.itfactory.arrays;

public class Exemplu2 {
    public static void main(String[] args) {


        //Exemplu de initializare direta cu valori
        int[] arrayInt  = {1,2,3,4,5,6,1,2,3,12,4,1,23,12,4,123123};


        //Exemplu de constructie
        int[] exempluConstructieArray;
        exempluConstructieArray = new int[4];
        exempluConstructieArray[0] = 3; //exempluConstructieArray = "mar"
        exempluConstructieArray[1] = 4; //exempluConstructieArray = "par"
        exempluConstructieArray[2] = 6; //exempluConstructieArray = "ciresica"
        exempluConstructieArray[3] = 1; //exempluConstructieArray = "banana"

        System.out.println("Lungimea array-ului este: " + exempluConstructieArray.length);



        /**
         * Parcurgere array-uri. Metoda 1
         */
        for (int i = 0; i < exempluConstructieArray.length; i++) {
            System.out.println(exempluConstructieArray[i]);
        }

        /**
         * Parcurgere array-uri. Metoda 2
         */
        System.out.println("Afisare prin for special: ");
        for (int intNr : exempluConstructieArray) {
            System.out.println(intNr);
        }
    }
}
