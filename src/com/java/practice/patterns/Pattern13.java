package com.java.practice.patterns;

import java.util.Scanner;

public class Pattern13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
		
		for(int i = 0; i < number; i++) {
			
			for(int j = 1; j <= number-i; j++) {
				
				System.out.print(j);
				System.out.print(" ");
			}
			System.out.println("");
		}

	}

}
