package com.rsg.flowconntrol;

public class TableUsingForLoop {
	
	public static void main(String[] args) {
		
		
		int temp = 4;
		
		int table = 0;
		
		for (int i = 1; i <= 10; i++) {  //i=11
			
			table = temp*i;    // 2*10=20       table = 18
			System.out.println(table); // 2 4 6 8 10 12 14 16 18 20
		}
		
		
	}

}
