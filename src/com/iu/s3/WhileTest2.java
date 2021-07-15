package com.iu.s3;

import java.util.Scanner;

public class WhileTest2 {
	
	public static void main(String[] args) {
		System.out.println("WhileTest2 Start");
		Scanner sc = new Scanner(System.in);
		int id = 1234;
		int pw = 5678;
		
		boolean flag = true;
		//1. 로그인
		//   - id, pw 입력
		//   - 로그인 판단
		//2. 종  료
		
		while(flag) {
			System.out.println("1.로그인  2.종료");
			int select = sc.nextInt();
			
			if(select==1) {
				System.out.println("ID 입력");
				int yId = sc.nextInt();
				System.out.println("PW 입력");
				int yPw = sc.nextInt();
				
				if(yId == id && yPw == pw) {
					System.out.println("로그인 성공");
					flag=false;
				}else {
					System.out.println("로그인 실패");
				}
				
			}else {
				System.out.println("종료");
				break;
				//flag=false;
			}
			
		}
		// 로그인 판단
		//끝날 때 꼭 삭제 ㅜ!!!!!!!!!!!!!!!!!!!!!!!
		flag=false;
		if(!flag) {
			System.out.println("로그인 성공 했을 때 실행");
			
			int level= 1;
			int gold = 0;
			
			for(level=1;level<15;level++) {
				//Gold 지급
				if(level%5==0) {
					//level*200
					gold = gold + level/5*1000;
					System.out.println(level/5*1000+" gold 지급");
				}
				
				System.out.println("현재레벨 : "+level);
				
				//사냥
				for(int mon=0;mon<level*3;mon++) {
					System.out.println(mon+1+ " 마리 사냥 성공");//3
				}
				System.out.println("==== 축 레벨업 ====");
			}
			System.out.println("최종 레벨 : "+level);
			gold = gold + level/5*1000;
			System.out.println("최종 Gold : "+gold);
		}
		
		
		//로그인성공, 로그인안됐거나
		//로그인이 성공했으면 게임을 시작
		//rpg 게임
		//최초레벨은 1, 만랩 15
		//최초gold 0
		//레벨 5를 달성시 1000gold 지급
		//레벨 10을 달성시 2000gold 지급
		//레벨 15랩을 당설시 3000gold 지급
		
		//모든 몬스터의 경험치는 동일
		// 1 -> 2 : 3
		// 몬스턴 1마리 사냥
		// 몬스턴 2마리 사냥
		// 몬스턴 3마리 사냥
		// 레벨업
		// 2 -> 3 : 6
		// 몬스턴 1마리 사냥
		// 몬스턴 2마리 사냥
		// 몬스턴 3마리 사냥
		// 몬스턴 4마리 사냥
		// 몬스턴 5마리 사냥
		// 몬스턴 6마리 사냥
		// 레벨업
		// 3 -> 4 : 9
		// 4 -> 5 : 12
		// 5 -> 6 : 15
		//...
		// 14 -> 15 : 42
		// 최종레벨 출력
		// 최종 Gold 출력
		
		
		System.out.println("WhileTest2 Finish");
	}

}
