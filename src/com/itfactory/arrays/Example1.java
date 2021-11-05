package com.itfactory.arrays;

public class Example1 {
    public static void main(String[] args) {

        /**
         * Construire array
         */
        // Prea obositor, nu economisim timp, posibile pierderi de date
        String fruct1 = "mar";
        String fruct2 = "par";
        String fruct3 = "ciresica";
        String fruct4 = "banana";

        //Exemplu de initializare direta cu valori
        String[] exempluArrayFructe1 = {"mar", "par", "ciresica", "banana"};
        String[] exempluArrayFructe2 = {fruct1, fruct2, fruct3, fruct4};

        String[] tipuriDeImbracaminte = {"blugi", "tricouri", "bluze"};

        //Exemplu de constructie
        String[] exempluConstructieArray;
        exempluConstructieArray = new String[4];
        exempluConstructieArray[0] = fruct1; //exempluConstructieArray = "mar"
        exempluConstructieArray[1] = fruct2; //exempluConstructieArray = "par"
        exempluConstructieArray[2] = fruct3; //exempluConstructieArray = "ciresica"
        exempluConstructieArray[3] = fruct4; //exempluConstructieArray = "banana"

        System.out.println("Lungimea array-ului este: " + exempluConstructieArray.length);



        /**
         * Parcurgere array-uri. Metoda 1
         */
        for (int i = 0; i < exempluConstructieArray.length; i++) {
            System.out.println(exempluArrayFructe1[i]);
        }

        /**
         * Parcurgere array-uri. Metoda 2
         */
        System.out.println("Afisare prin for special: ");
        for (String fruct : exempluArrayFructe1) {
            System.out.println(fruct);
        }
    }

    public void afsiarePrimulElement(String[] fructe) {
        System.out.println(fructe[0]);
    }
}
