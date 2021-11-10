package com.java.practice.patterns;

import java.util.Scanner;

public class Pattern15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
		
		for(int i = number; i >= 1; i--) {
			
			for(int j = number; j >= 1; j--) {
				
				if(i >= j) {
					System.out.print(j);
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}

}
