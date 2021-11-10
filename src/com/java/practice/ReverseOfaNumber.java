package com.java.practice;

import java.util.Scanner;

public class ReverseOfaNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
		int temp = number;
		int reverse = 0, rem = 0;
		
		while(number != 0) {
			
			// To get the reminder of a number when divided by 10
			rem = number % 10;
			
			// To add individual numbers to sum of previous numbers
			reverse = reverse * 10 + rem;
			
			// To get the quotent of a number when divided by 10
			number = number / 10;
		}
		
		System.out.println("Reverse of a given number " + temp + " is " + reverse);
	}

}
