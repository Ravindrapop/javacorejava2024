package com.rsg.flowconntrol;

public class RecursionDemo1 {
	
	public void p() {
		System.out.println("Hello");
		p();
	}

	public static void main(String[] args) {
		RecursionDemo1 recursionDemo1 = new RecursionDemo1();
		recursionDemo1.p();
		
	}

}
