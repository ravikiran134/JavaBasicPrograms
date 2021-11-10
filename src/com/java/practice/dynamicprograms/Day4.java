package com.java.practice.dynamicprograms;

import java.util.Scanner;

public class Day4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int sizeOfArray, count = 0, number, flag = 0;
		System.out.println("Enter Size of the Array");
		sizeOfArray = sc.nextInt();
		int array[] = new int[sizeOfArray];
		int index[] = new int[sizeOfArray];
		
		System.out.println("Enter a search number");
		number = sc.nextInt();
		
		System.out.println("Enter elements into Array");
		for(int i = 0; i< sizeOfArray; i++) {
			
			array[i] = sc.nextInt();
		}
		
		for(int i = 0; i < sizeOfArray; i++) {
			
			if(array[i] == number) {
				index[count] = i;
				count++;
			}
		}
		if(count > 0) {
			System.out.print(count + " indices -> ");
			for(int i = 0; i < count; i++) {
				
				System.out.print( " "+index[i]);
			}
			
		}else {
			
			System.out.print("-1");
		}
		
	}

}
