package org.java;

import java.util.Scanner;

public class Snack1 {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		
		System.out.println("inserire un numero: ");
		
		int val = sc.nextInt();
		
		if(val %2 == 0) {
			System.out.println("numero: " + val);
		}	else {
			val= val + 1;
			System.out.println("numero " + val);
		}
		
		sc.close();
	}
}
