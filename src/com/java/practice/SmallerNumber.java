package com.java.practice;

import java.util.Scanner;

public class SmallerNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number");
		int firstNumber = sc.nextInt();
		System.out.println("Enter Second number");
		int secondNumber = sc.nextInt();
		
		if(firstNumber < secondNumber) {
			System.out.println(firstNumber + " is lesser than " + secondNumber);
		}
		else {
			
			System.out.println(secondNumber + " is lesser than " + firstNumber);
		}
	}

}
