package com.iu.s2;

import java.util.Scanner;

public class ForTest9 {

	public static void main(String[] args) {
		System.out.println("ForTest9 start");
		
		//FPS 
		// 탄창 3개
		// 한 탄창에 30발
		// 단발모드 1발, 점사모드 3발
		// 1.단발 2.점사?
		// 1- 탕 30번
		// 2 - 타타탕 10번
		Scanner sc = new Scanner(System.in);
		
		for(int tan=0;tan<3;tan++) {
			System.out.println("1. 단발 : 2. 점사");
			int select = sc.nextInt();
			String sound="탕";
			//int count = 30;
			int num=1;
			if(select != 1) {
				sound="타타탕";
				//count=10;
				num=3;
			}
			
			for(int i=0;i<30;i=i+num) {
				System.out.println(sound);
			}
			
		}
		
		
		System.out.println("ForTest9 finish");
	}

}


//for(int t=3;t>0;t--) {
//	System.out.println("1.단발 2.점사");
//	int shot = sc.nextInt();
//	for(int b=30;b>0;b--) {
//		if(shot==1) {
//			System.out.println("탕");
//		}else if(shot != 1){
//			System.out.println("타타탕");
//			b=b-2;
//		}
//	}
//}


//for(int tan=0;tan<3;tan++) {
//	System.out.println("1. 단발 : 2. 점사");
//	int select = sc.nextInt();
//	
//	for(int i=0;i<30;i++) {
//		if(select==1) {
//			System.out.println("탕!");
//		} else {
//			i=i+2;
//			System.out.println("타타탕!");
//		}
//	}
//}




//if(select==1) {
//	for(int i=0;i<30;i++) {
//		System.out.println("탕");
//	}
//}else {
//	for(int i=0;i<10;i++) {
//		System.out.println("타타탕");
//	}
//}