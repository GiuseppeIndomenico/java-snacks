package org.java;

import java.util.Scanner;

public class Snack6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Inserisci una stringa: ");

        String str = sc.nextLine();
        int intValue = 0; // Inizializza l'intero risultante

        for (int i = 0; i < str.length(); i++) {
            char digit = str.charAt(i);

            if (digit >= '0' && digit <= '9') {
                int digitValue = digit - '0'; // Converte il carattere in un numero
                intValue = intValue * 10 + digitValue; // Concatena la cifra al risultato
            }
        }

        System.out.println("Il numero trovato: " + intValue);

        sc.close();
    }
}
