package org.java;

import java.util.Scanner;

public class Snack4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Inserire una frase:");
        String frase = sc.nextLine();

        frase = frase.trim().toLowerCase(); 
        
        String cleanFrase = frase.replaceAll("\\s+", "");
        
        char[] charArray = cleanFrase.toCharArray();

        String reversedFrase = "";

        for (int i = charArray.length - 1; i >= 0; i--) {
            reversedFrase += charArray[i];
        }

        if (cleanFrase.equals(reversedFrase)) {
            System.out.println("La frase è palindroma.");
        } else {
            System.out.println("La frase non è palindroma.");
        }

        sc.close();
    }
}
