package com.java.practice.dynamicprograms;

import java.util.Arrays;
import java.util.Scanner;

public class Day3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sizeOfArray, count = 0, number, flag = 0;
		System.out.println("Enter Size of the Array");
		sizeOfArray = sc.nextInt();
		int array[] = new int[sizeOfArray];
		
		System.out.println("Enter a search number");
		number = sc.nextInt();
		
		System.out.println("Enter elements into Array");
		for(int i = 0; i< sizeOfArray; i++) {
			
			array[i] = sc.nextInt();
		}
		Arrays.sort(array);
		
		for(int i = 0; i < sizeOfArray; i++) {
			
			for(int j = i+1; j < sizeOfArray; j++) {
				
				if(number == array[i]+array[j]) {
					
					flag = 1;
					break;
				}
				if(flag == 1)
					break;
			}
		}
		if(flag == 1) {
			System.out.println("Given array is a Super Array");
		}else {
			System.out.println("Given Array is not a Super Array");
		}
	}
	
}
