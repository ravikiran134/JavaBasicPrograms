package com.java.practice;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
		long result = 1;
		
		// Since we ge 0 when we multiply a number with 0
		while(number != 1) {
			
			// Multiplying a number with its preceding sequence number 
			result = result * number;
			
			// Subtracting 1 number to make a preceding value for next iteration
			number--;
		}
		
		System.out.println(result);
	}

}
