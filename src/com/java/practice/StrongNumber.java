package com.java.practice;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
		int rem = 0, sum = 0, temp = number;
		while(number != 0) {
			
			// To get the reminder of a number i.e last digit when completely divided by 10
			rem = number % 10;
			// For calculating each digit Factorial
			sum = sum + getFactorial(rem);
			
			// To get the quotent of a number when divided by 10
			number = number / 10;
		}
		if(temp == sum) {
			
			System.out.println("Given number " + temp + " is a Strong Number");
		}else {
			
			System.out.println("Given number " + temp + " is not a Strong Number");
		}
	}

	private static int getFactorial(int number) {
		int result = 1;
		while(number != 1) {
			
			// Multiplying every value with the previous sequential value
			result = result * number;
			// To get the previous sequential value
			number--;
		}
		return result;
	}

}
