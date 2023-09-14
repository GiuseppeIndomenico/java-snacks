package org.java;

import java.util.Random;

public class Snack8 {
    public static void main(String[] args) {
        
        Random rnd = new Random();
        
        int arr[] = new int[10];
        int arrSum = 0;
        int min = Integer.MAX_VALUE; 
        int max = Integer.MIN_VALUE; 
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(51) + 100; 
            arrSum += arr[i];
      
            if (arr[i] < min) {
                min = arr[i];
            }

            if (arr[i] > max) {
                max = arr[i];
            }
        }
        
        System.out.println("Il numero minimo è: " + min);
        System.out.println("Il numero massimo è: " + max);
        System.out.println("Il numero medio è: " + (arrSum / arr.length));
    }
}
