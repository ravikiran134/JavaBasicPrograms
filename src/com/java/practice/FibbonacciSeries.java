package com.java.practice;

import java.util.Scanner;

public class FibbonacciSeries {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
		int prev = 0, next = 1, nextNext = 0;
		System.out.print(prev +" " + next);
		
		// Since already 0 and 1 are printed so starting loop from 2
		for(int i = 2; i < number; i++) {
			
			// Finding sum of previous and next elements
			nextNext = prev + next;
			System.out.print(" " + nextNext);
			
			// Making previous element as next element
			prev = next;
			
			// Making nextNext element as next element for next iteration
			next = nextNext;
		}

	}

}
