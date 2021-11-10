package com.java.practice;

import java.util.Scanner;

public class PronicNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
		
		// To subtract one value from given number as range starts from 0
		number = number-1;
		
		// Multiplying the given number with the number after adding 1 value to the same number
		System.out.println(number * (number + 1));

	}

}
