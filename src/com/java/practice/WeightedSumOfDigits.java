package com.java.practice;

import java.util.Scanner;

public class WeightedSumOfDigits {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
		
		// To get the length of the given integer
		int len = String.valueOf(number).length();
		int sum = 0, rem = 0, temp = number;
		
		
		for(int i = len; i > 0; i--) {
			
			// To get the reminder of a number when divided by 10
			rem = number % 10;
			
			// Multiplying the digit with the respective index and adding it to the total
			sum = sum + rem * i;
			
			// To get the quotent of a number when divided by 10
			number = number /10;
		}
		
		System.out.println("Weighted Sum of given number " + temp + " is " + sum);
	}

}
