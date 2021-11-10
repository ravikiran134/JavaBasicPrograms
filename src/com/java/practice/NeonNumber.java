package com.java.practice;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		
		int num = sc.nextInt();
		int temp = num;
		int rem = 0, sum = 0;
		
		// To calculate square of a number
		num = num * num;
		
		while(num != 0) {
			
			// To get the reminder of a number when divided by 10
			rem = num % 10;
			
			// To add individual numbers to sum of previous numbers
			sum = sum + rem;
			
			// To get the quotent of a number when divided by 10
			num = num/10;
		}
		
		if(sum == temp) {
			
			System.out.println("Given number " + temp + " is a Neon Number");
		}
		else {
			
			System.out.println("Given number " + temp + " is not a Neon Number");
		}

	}

}
