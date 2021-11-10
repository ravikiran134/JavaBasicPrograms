package com.java.practice;

import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		
		int num = sc.nextInt();
		
		int sum = 0, reminder = 0, temp = num;
		int product = 1;
		
		while(num != 0) {
			
			// To get the reminder of a number when divided by 10
			reminder = num % 10;
			
			// To add individual numbers to sum of previous numbers
			sum = sum + reminder;
			
			// To multiply individual numbers to product of previous numbers
			product = product * reminder;
			
			// To get the quotent of a number when divided by 10
			num = num / 10;
		}
		// If sum of all digits is equal to product of all digits
		if(sum == product) {
			
			System.out.println("Given number " + temp + " is a Spy Number");
			
		}else {
			
			System.out.println("Given number " + temp + " is not a Spy Number");
		}

	}

}
