package com.rsg.flowconntrol;

public class FibonacciSeriesUsingForLoop {
	
	public static void main(String[] args) {
		//fibonacci series : 1,1,2,3,5,8,13,21,34,55,89
		
		int pre = 1;
		
		int next = 1;
		
		int temp = 0;
		
		System.out.print(pre+","+next);
		
		for (int i = 1; i < 10; i++) {
			
			temp = pre+next;
			pre = next;
			next=temp;
			System.out.print(","+temp);
			
		}
		
		
		System.out.println();
		
		
	}

}
