package com.iu.s2;

import java.util.Scanner;

public class ForTest6 {
	
	public static void main(String [] args) {
		System.out.println("ForTest6 Start");
		Scanner sc = new Scanner(System.in);
		//회원가입시 입력한 ID
		int id = 1234;
		//회원가입시 입력한 PW
		int pw = 5678;
		
		boolean flag=false;
		
		//최대 5번 기회
		//1. 최대 5번 로그인 시도
		
		for(int i=0;i<5;i++) {
			if(i != 0) {
				System.out.println(i+1+"번째 시도");
			}
			System.out.println("Id를 입력");
			int yId = sc.nextInt();
			System.out.println("Pw를 입력");
			int ypw = sc.nextInt();
			
			if(yId==id && ypw==pw) {
				flag = !flag;
				//flag = true;
				break;
				
			}
			System.out.println(i+1+"번째 로그인 실패");
			
		}//for 끝
		
		//
		
		//2. for 종료 조건 로그인성공 과 5번 모두 실패
		//flag 가 true면 로그인 성공 false면 모두 실패
		if(flag) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패 은행에 방문");
		}
		
		
		
		System.out.println("ForTest6 Finish");
	}

}
