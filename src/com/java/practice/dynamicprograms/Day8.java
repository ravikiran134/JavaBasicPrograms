package com.java.practice.dynamicprograms;

import java.util.Scanner;

public class Day8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int graterNumber = 0, number = 0;
		System.out.println("Enter elements");
		
		while(true) {
			number = sc.nextInt();
			
			if(number != -1) {
				
				if(number > graterNumber) {
					graterNumber = number;
				}
			}
			else {
				
				System.out.println("End of List");
				break;
			}
		}
		System.out.println("Grater number is " + graterNumber);
	}

}
