package com.rsg.flowconntrol;

public class StarPyramidUsiingForLoop {

	public static void main(String[] args) {
		
		for(int i=0; i<5; i++) { 
			
			for(int j=0; j<=i; j++) {   
				
				System.out.print("*");
			}
			System.out.println();
		}


	}

}
