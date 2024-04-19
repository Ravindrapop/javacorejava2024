package com.rsg.accessmodifiers;

public class Calculate {

	public static int sum(final int a, int b) {

		b = 100;
		int sum = a + b;

		return sum;
	}

	public static void main(String[] args) {
		
	//	Calculate cal = new Calculate();

	int temp = 	sum(10, 20);
	
	System.out.println(temp);

	}

}
