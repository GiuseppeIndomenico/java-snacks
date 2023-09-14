package org.java;

import java.util.Scanner;

public class Snack5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Inserisci una stringa (inserisci 0 per uscire): ");
            String inputString = scanner.nextLine();

            if (inputString.equals("0")) {
                break;
            }

            int alphaCount = 0;
            int digitCount = 0;
            int symbolCount = 0;

            char[] charArray = inputString.toCharArray();
            
            for (int i = 0; i < charArray.length; i++) {
                char c = charArray[i]; 
                if (Character.isLetter(c)) {
                    alphaCount++;
                } else if (Character.isDigit(c)) {
                    digitCount++;
                } else if (!Character.isWhitespace(c)) {
                    symbolCount++;
                }
            }

            System.out.println("Caratteri alfabetici: " + alphaCount);
            System.out.println("Numeri: " + digitCount);
            System.out.println("Simboli non alfanumerici: " + symbolCount);
        }

        scanner.close();

    }
}
