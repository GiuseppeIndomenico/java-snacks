package org.java;

import java.util.Random;

public class Snack2 {

	    public static void main(String[] args) {

	        String name[] = {"Mario", "Luigi", "Giuseppe", "Marta", "Clara"};
	        String surname[] = {"Rossi", "Bianchi", "Verdi", "Viola", "Ciano"};

	        Random random = new Random();

	        for (int x = 0; x < 9; x++) {
	        
	        	int randomNameIndex = random.nextInt(name.length);
	            int randomSurnameIndex = random.nextInt(surname.length);

	            String randomName = name[randomNameIndex];
	            String randomSurname = surname[randomSurnameIndex];

	            System.out.println(randomName + " " + randomSurname);
	        }
	    }


}
