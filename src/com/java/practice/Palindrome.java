package com.java.practice;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
		int temp = number;
		int reverse = 0, rem = 0;
		
		while(number != 0) {
			
			// To get the reminder of a number when divided by 10
			rem = number % 10;
			
			// Multiplying the previous digit with 10 and adding newly received digit to get fuller number
			reverse = reverse * 10 + rem;
			
			// To get the quotent of a number when divided by 10
			number = number / 10;
		}
		
		if(reverse == temp) {
			
			System.out.println("Given number " + temp + " is a palindrome");
		}
		else {
			
			System.out.println("Given number " + temp + " is not a palindrome");
		}

	}

}
