package com.java.practice;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
		int flag = 0;
		
		// Since 2 is the only even prime number all other even numbers need not be verified
		if(number ==1 || number % 2 == 0 ) {
			if(number == 2) {
				System.out.println("Given number "+ number + " is a Prime");
			}else {
				System.out.println("Given number "+ number + " is not a Prime");
			}
		}
		// Only Odd number will be verified for Prime numbers
		// Reduces Time complexity
		else {
			
			// Since last factor of a number will not be grater than half of the given number
			for(int i = 2; i <= number/2; i++) {
				
				// When a given number is divided by a number between 1 and itself it is not a prime
				if(number % i == 0) {
					
					flag = 1;
					
					// If one factor is found other than 1 and itself, it is enough to tell the number is not a prime
					break;
				}
			}
			if(flag == 1) {
				
				System.out.println("Given number " + number + " is not a Prime");
			}else {
				
				System.out.println("Given number " + number + " is a Prime");
			}	
		}
	}

}
