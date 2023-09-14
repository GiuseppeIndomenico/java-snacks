package org.java;

import java.util.Scanner;

public class Snack7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Inserisci il numero di secondi: ");

               
        int sec = sc.nextInt();
        
        sc.close();
        
        int min = 0;
        int hour = 0;
        int day = 0;
        int year = 0;
        
        

        while (sec >= 60) {
            min++;
            sec -= 60;
        }

        while (min >= 60) {
            hour++;
            min -= 60;
        }
        
        while (hour >= 24) {
            day++;
            hour -= 24;
        }
        
        while (day >= 365 ) {
            year++;
            day -= 365;
        }
       
        
        System.out.println("Il tempo che hai inserito e': "+ year + (year == 1? " anno " : " anni " ) + day + " giorni " + hour + (hour == 1? " ora " : " ore ") + min + " minuti " + sec + " secondi ");
    }
}
