package com.iu.s1;

public class Test14 {
	public static void main(String [] args) {
		System.out.println("Test14 Start");
		
		//평균을 이용해서 A,B,C,D,F
		//
		int avg = 100;
		
		switch(avg/10) {
		case 10, 9:
		
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default :
			System.out.println("F");
		
		}
		
		
		
		
		System.out.println("Test14 Finish");
	}

}
