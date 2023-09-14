package org.java;

import java.util.Scanner;

public class Snack4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Inserire la parola:");
        String word = sc.nextLine();

        word = word.trim().toLowerCase(); 

        char[] charArray = word.toCharArray();

        String reversedWord = "";

        for (int i = charArray.length - 1; i >= 0; i--) {
            reversedWord += charArray[i];
        }

        if (word.equals(reversedWord)) {
            System.out.println("La parola è palindroma.");
        } else {
            System.out.println("La parola non è palindroma.");
        }

        sc.close();
    }
}
