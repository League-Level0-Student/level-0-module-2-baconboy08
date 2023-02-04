//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._4_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
	
		
		// 1. Use each value of randomNumber to give the user a random compliment.

		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
			for (int num = 0; num < 10; num += 1) {
				
				int randomNumber = randomMaker.nextInt(5) + 1;
				
				System.out.println(randomNumber);

					if (randomNumber == 1) {
					
						JOptionPane.showMessageDialog(null,"you're cool" );
				
					} else if (randomNumber == 2) {
					
						JOptionPane.showMessageDialog(null,"you're awesome");
					
					} else if (randomNumber == 3) {
					
						JOptionPane.showMessageDialog(null,"you're amazing" );
				
					} else if (randomNumber == 4) {
					
						JOptionPane.showMessageDialog(null,"you're outstanding");
					
					} else if (randomNumber == 5) {
					
						JOptionPane.showMessageDialog(null,"you're smart" );
				
					}
				
			}
				
			
			
	}
}
