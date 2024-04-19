package com.rsg.flowconntrol;

public class SwitchDemo1 {

	public static void main(String[] args) {
		
		int a = 7;
		
		int b = 100;
		
		switch(a) {
		case 1:
			System.out.println("Entered value is one");
			break;
		case 2:
			System.out.println("Entered nubmber is two");
			break;
		case 3:
			System.out.println("Entered value is three");
			break;
		case 4:
			System.out.println("Entered value is four");
			break;
		case 5:
			System.out.println("Entered value is five");
			break;
		
		default:
			System.out.println("You have entered wrong number.");
		}

	}

}
