package com.java.practice.dynamicprograms;

import java.util.Scanner;

public class Day2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sizeOfArray, count = 0, number;
		
		System.out.println("Enter Size of the Array");
		sizeOfArray = sc.nextInt();
		int array[] = new int[sizeOfArray];
		
		System.out.println("Enter elements into Array");
		for(int i = 0; i < sizeOfArray; i++) {
			
			number = sc.nextInt();
			if(number != 22) {
				
				array[count] = number;
				count++;
			}else {
				i--;
			}
		}
		for(int i = 0; i < count; i++) {
			System.out.println(array[i]);
		}
		

	}

}
