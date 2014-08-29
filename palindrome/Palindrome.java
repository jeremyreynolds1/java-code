/*
	Simple palindrome checker based in Java.
	Created by Jeremy Reynolds on August 29, 2014.
	
	A palindrome is a word that is the same any way that you read it.
	Example: racecar is racecar when you read it backwards or forwards.
*/

import java.util.*;

class Palindrome {
	public static void main(String[] args) {
		
		String original = "";
		String reversed = "";
		//created new Scanner object to read user input.
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a word to be tested as a palindrome.");
		original = input.next();
		
		//get length for original string as condition in for loop
		int length = original.length();
		
		for (int i = length-1; i >= 0; i--) {
			reversed = reversed + original.charAt(i);
		}
		
		if(original.equals(reversed)){
			System.out.println("It's a palindrome!");
		}
		else {
			System.out.println("Not a palindrome");
		}
				
	}
}