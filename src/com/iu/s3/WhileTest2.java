package com.iu.s3;

public class WhileTest2 {
	
	public static void main(String[] args) {
		System.out.println("WhileTest2 Start");
		
		int id = 1234;
		int pw = 5678;
		
		//1. 로그인
		//   - id, pw 입력
		//   - 로그인 판단
		//2. 종  료
		
		
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
