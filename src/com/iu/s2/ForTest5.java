package com.iu.s2;

import java.util.Scanner;

public class ForTest5 {
	
	public static void main(String [] args) {
		System.out.println("ForTest5 Start");
		Scanner sc = new Scanner(System.in);
		//총점을 담을 변수
		int total=0;
		//평균을 담을 변수
		double avg=0.0;
		//과목 수를 담을 변수
		int count=0;
		
		System.out.println("과목 수 입력");
		count = sc.nextInt(); //2
		System.out.println(count);
		
		
		// 0+30+ 50+ 70
		for(int i=0;i<count;i++) {
			System.out.println(i+1+"번째 점수 입력");
			int point = sc.nextInt();
			total = total+point;
		}
		
		avg = (double)total/(double)count;
		
		//총점 평균 계산 후 출력
		System.out.println("총점 : "+total);
		System.out.println("평균 : "+avg);
		
		
		
		System.out.println("ForTest5 Finish");
	}

}
