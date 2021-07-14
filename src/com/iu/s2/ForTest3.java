package com.iu.s2;

import java.util.Scanner;

public class ForTest3 {
	
	public static void main(String [] args) {
		System.out.println("ForTest3 Start");
		Scanner sc = new Scanner(System.in);
		//종료 시간을 입력 받기
		// 35
		// 0초, 1초 ....12초 끝
		// 단 60 상수는 변경 불가능
		System.out.println("종료 시간 입력");
		int cho = sc.nextInt();
		
		for(int sec=0;sec>=0;sec++) {
			System.out.println(sec+"초");
			if(sec == cho) {
				//sec = 59;
				break;
			}
		}
		
		
		System.out.println("ForTest3 Finish");
	}

}
