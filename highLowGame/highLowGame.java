/*
	created by Jeremy Reynolds on September 6th. Game will start out as command line based.
*/

import java.util.*;

class highLowGame {
	public static void main(String[] args) {
		// initializing variables for game
		int max, min, guessNumber, randomNumber;
		//boolean value for validRange
		boolean validRange = false;
		
		Scanner input = new Scanner(System.in);
		do{
		System.out.println("Please enter the max number: ");
		max = input.nextInt();
		
		System.out.println("Please enter the min number: ");
		min = input.nextInt();
		
		if (max < min) {
			validRange = false;
			System.out.println("The max cannot be less than the min.");
		} else {
			validRange = true;
		}
		
		}while (validRange == false);
		Random rand = new Random();
		
		randomNumber = rand.nextInt((max - min) + 1) + min;
		
		//System.out.println(randomNumber);
		
		System.out.println("Please enter a guess: ");
		guessNumber = input.nextInt();
		
		while(guessNumber != randomNumber){
			System.out.println("Wrong. Guess Again.");
			if (guessNumber > randomNumber) {
				System.out.println("The number is higher");
			}
			else {
				System.out.println("The Number is lower.");
			}
			System.out.println("Please enter a guess: ");
			guessNumber = input.nextInt();
		}
		System.out.println("you're right!");
		
	}
}