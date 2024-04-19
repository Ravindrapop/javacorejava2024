package com.rsg.flowconntrol;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		n = scanner.nextInt();
		int i = 1;
		int fact = 1;
		while (i <= n) {
			fact = fact * i;
			i++;
		}
		System.out.println(fact);
	}

}