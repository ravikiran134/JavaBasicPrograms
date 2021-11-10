package com.java.practice.dynamicprograms;

import java.util.Scanner;

public class Day1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[1000];
		int number, count = 0;
		System.out.println("Enter numbers");
		while(true) {
			
			number = sc.nextInt();
			if(number == 22) {
				
				arr[count] = number;
				break;
			}else {
				
				arr[count] = number;
				count++;
			}
			
		}
		for(int i = 0; i < count; i++) {
			
			System.out.println(arr[i]);
		}
		

	}

}
