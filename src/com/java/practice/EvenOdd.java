package com.java.practice;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		// If remainder is 0 when a number is divided by 2 then it is Even number
		if(num % 2 == 0) { 
			
			System.out.println(num + " is Even number");
			
		}else { 
			// If remainder is not 0 when a number is divided by 2 then it is Odd number
			System.out.println(num + " is Odd number");
		}
		

	}

}
