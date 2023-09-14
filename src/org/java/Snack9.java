package org.java;

import java.util.Scanner;

public class Snack9 {
	public static void main(String[] args) {
	
		int val = 0;
		Scanner sc= new Scanner(System.in);
		 
		while(val <= 1000) {
			
			System.out.println("inserire un numero: ");
			
			int num = sc.nextInt();
			
			val += val + num;
		
			
		}
		sc.close();
		System.out.println("La somma ha superato i mille!!");
	}
}
