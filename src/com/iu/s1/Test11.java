package com.iu.s1;

public class Test11 {
	
	public static void main(String [] args) {
		System.out.println("Test11 Start");
		
		//국어, 영어, 수학 입력
		//총점 평균 계산
		
		double avg =32;
		
		if(avg >=90) {
			System.out.println("A");
		}else if(avg >= 80 && avg<90) {
			System.out.println("B");
		}else if(avg >= 70) {
			System.out.println("C");
		}else if(avg >= 60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		
		//평균이 90점 이상이면 A를 출력
		//평균이 80점 이상이면 B를 출력
		//평균이 70점 이상이면 C를 출력
		//평균이 60점 이상이면 D를 출력
		//그외 나머지 F를 출력
		
		
		
		System.out.println("Test11 Finish");
	}

}
