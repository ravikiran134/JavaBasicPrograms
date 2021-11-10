package com.java.practice;

import java.util.Scanner;

public class TrimorphicNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
		int cube = number * number * number;
		
		// To get the last (length of given number) digits of the cube of the given number
		int revOfCube = reverseOfNumber(String.valueOf(number).length(), cube);
		// To reverse the above attained result inorder to compare with given number
		int revOfResult = reverseOfNumber(String.valueOf(number).length(), revOfCube);
		
		if(number == revOfResult) {
			
			System.out.println("Given number " + number + " is a Trimorphic number");
		}else {
			
			System.out.println("Given number " + number + " is not a Trimorphic number");
		}
	}

	private static int reverseOfNumber(int len, int number) {
		int rem = 0, sum = 0;
		for(int i = 0; i < len; i++) {
			
			// To get the reminder of a number when divided by 10
			rem = number % 10;
			// To add individual numbers to sum of previous numbers
			sum = sum * 10 + rem;
			// To get the quotent of a number when divided by 10
			number = number /10;
		}
		return sum;
	}

}
