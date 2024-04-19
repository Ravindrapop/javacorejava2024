package com.rsg.flowconntrol;

public class FindGreaterFromThree {

	public static void main(String[] args) {

		int a = 100;
		int b = 15;
		int c = 50;

		if (a > b) {
			if (a > c) {
				System.out.println("a is greater number.");
			} else {
				System.out.println("c is greater number.");
			}
		} else if (b > c) {
			System.out.println("b is greater number.");
		} else {
			System.out.println("c is greater number");
		}

	}

}
