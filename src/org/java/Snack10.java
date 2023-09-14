package org.java;

import java.util.Random;

public class Snack10 {
    public static void main(String[] args) {

        Random rnd = new Random();

        int arr[] = new int[10];


        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(901) + 100; 
        }

        System.out.println("Tutti gli elementi pari: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println("- " + arr[i]);
            }
        }

        System.out.println("Tutti gli elementi dispari: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                System.out.println("- " + arr[i]);
            }
        }

        System.out.println("Tutti gli elementi in indice pari: ");
        for (int i = 0; i < arr.length; i += 2) {
            System.out.println("- " + arr[i]);
        }

        System.out.println("Tutti gli elementi in indice dispari: ");
        for (int i = 1; i < arr.length; i += 2) {
            System.out.println("- " + arr[i]);
        }
    }
}
