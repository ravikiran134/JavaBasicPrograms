package com.java.practice;

import java.util.Scanner;

public class SunnyNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		double number = sc.nextDouble();
		
		number = number + 1;
		
		// To get the square root of the given number
		double square_root = Math.sqrt(number);   
		
		// Checking if the acquired square rot is a real number or an integer
		if(square_root - Math.floor(square_root) == 0) {
			
			System.out.println("Given number is a Sunny Number");
		}
		else {
			
			System.out.println("Given number is not a Sunny Number");
		}

	}

}
