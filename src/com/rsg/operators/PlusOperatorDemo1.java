package com.rsg.operators;

public class PlusOperatorDemo1 {

	public static void main(String[] args) {
		
		int a=10, b=20, c=30;
		
		String d = "Shanth";
		
		
		System.out.println(a+b+c+d);//60Shanth
		
		System.out.println(a+b+d+c);//30Shanth30
		
		System.out.println(d+a+b+c);//Shanth102030
		
		System.out.println(a+d+b+c);//10Shanth2030
		

	}

}
