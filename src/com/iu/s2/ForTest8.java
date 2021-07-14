package com.iu.s2;

import java.util.Scanner;

public class ForTest8 {
	
	public static void main(String[] args) {
		System.out.println("ForTest8 Start");
		// 분초 출력
		//0분0초
		//0분1초
		//0분2초
		//...
		//0분 59초
		//1분 0초
		//1분 1초
		//1분 2초
		//1분 59초
		//2분 0초
		//...
		//59분 59초
		//분, 초를 입력 1, 10
		Scanner sc = new Scanner(System.in);
		System.out.println("분 입력");
		int m = sc.nextInt();//1
		System.out.println("초 입력");
		int s = sc.nextInt();//5
		boolean flag = false;
		for(int min=0;min<60;min++) {
			for(int sec=0;sec<60;sec++) {
				System.out.println(min+"분 : "+sec+"초");
				if(m==min && s==sec) {
					System.out.println("종료");
					flag=true;
					
					min=60;
					break;
				}
			}//안쪽 for
			
			if(flag) {
				break;
			}
		}
		
		
		
		
		System.out.println("ForTest8 Finish");
	}

}
