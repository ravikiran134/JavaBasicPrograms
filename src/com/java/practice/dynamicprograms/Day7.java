package com.java.practice.dynamicprograms;

import java.util.Scanner;

public class Day7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int sizeOfArray, number, pairs = 0;
		System.out.println("Enter Size of the Array");
		sizeOfArray = sc.nextInt();
		
		int array[] = new int[sizeOfArray];
		int temp[]  = new int[sizeOfArray];
		System.out.println("Enter elements into Array");
		for(int i = 0; i< sizeOfArray; i++) {
			
			array[i] = sc.nextInt();
			temp[i] = array[i];
		}
		
		for(int i = 0; i < sizeOfArray; i++) {
			int count = 1; 
			for(int j = i+1; j < sizeOfArray; j++) {
				
				if(array[i] == array[j]) {
					count++;
					array[j] = 0;
					break;
				}
			}
			if(array[i] != 0){
				array[i] = count;
			}
			
		}
		
		for(int i = 0; i < sizeOfArray; i++) {
			if(array[i] % 2 == 0 && array[i] != 0) {
				pairs++;
			}	
		}
		System.out.println(pairs + " Pairs are possible");
	}

}
