package com.rsg.flowconntrol;

public class AddFiveInteger {

	public static void main(String[] args) {

		int[] num = new int[5];
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		num[3] = 40;
		num[4] = 50;
		int sum = 0;

		for (int i = 0; i < num.length; i++) {  

			sum = sum + num[i];      

		}
		System.out.println(sum);

	}

}