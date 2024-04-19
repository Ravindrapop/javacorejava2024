package com.rsg.flowconntrol;

import java.util.Scanner;

public class PositiveOrNegativeNumber {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please entere the value of number: ");
		int number = scanner.nextInt();
		
		if(number<0) {
			System.out.println("Entered number is negative");
		}
		System.out.println("The value of number is : "+number);
		
		
		scanner.close();

	}

}
