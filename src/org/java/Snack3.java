package org.java;

import java.util.Iterator;

public class Snack3 {
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		
		int sum = 0;
		
		for(int x = 0; x < arr.length; x++) {
			
			int num = arr[x];
		
			if(x %2 == 1) {
				
				sum += num;
								
			}
			
		}
		
		System.out.println("numero finale: " + sum);
		
	}
}
