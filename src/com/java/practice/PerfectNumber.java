package com.java.practice;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
		
		int sumOfFactors = 1;
		
		// Factors will only lies less than half of the given number
		for(int i = 2; i <= number/2; i++) {
			
			// If the number is completely divisible then it is a factor
			if(number % i == 0) {
				
				// Adding the each factor
				sumOfFactors = sumOfFactors + i;
			}
		}
		// If sum of all the factors and given number are equal
		if(sumOfFactors == number) {
			
			System.out.println("Given number " + number + " is a Perfect number");
		}else {
			
			System.out.println("Given number " + number + " is not a Perfect number");
		}
	}

}
