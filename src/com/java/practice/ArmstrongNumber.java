package com.java.practice;

import java.util.Scanner;

public class ArmstrongNumber {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		
		int num = sc.nextInt();
		int temp;
		int rem = 0, cube = 0;
		temp = num;
		int cubeSum = 0;
		
		while(num != 0) {
			
			// To get the last reminder i.e last digit in the given number
			rem = num % 10;
			
			// To calculate cube of the extracted digit
			cube = (rem * rem * rem);
			
			// Adding the cube of the extracted digit to the cubeSum variable
			cubeSum = cubeSum + cube;
			
			// To get the quotent i.e the number except last digit of the number
			num = num / 10;
		}
		if(cubeSum == temp) {
			
			System.out.println("Given number " + temp + " is a Armstrong number" + cubeSum);
		}else {
			
			System.out.println("Given number " + temp + " is not a Armstrong number" + cubeSum);
		}
	}

}
