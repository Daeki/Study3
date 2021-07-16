package com.iu.s4;

import java.util.Scanner;

public class Array_5 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		int [] ar = {45, 52, 76};
		//int [] ar = new int[3];
		//ar[0]=45;
		//ar[1]=52;
		//ar[2]=76;
		
		while(flag) {
			//1. 정보출력
			//2. 정보추가
			//3. 정보삭제
			//4. 종   료
			System.out.println("1. 정보출력");
			System.out.println("2. 정보추가");
			System.out.println("3. 정보삭제");
			System.out.println("4. 종   료");
			int select = sc.nextInt();
			
			switch(select) {
			case 1:
				
				if(ar.length>0) {
					for(int i=0;i<ar.length;i++) {
						System.out.println(ar[i]);
					}
				}else {
					System.out.println("data가 없어요");
				}
				
				break;
			case 2:
				System.out.println("추가할 정보 입력");
				int num = sc.nextInt();
				
				int [] ar2 = new int [ar.length+1];
				//copy
				for(int i=0;i<ar.length;i++) {
					ar2[i]=ar[i];
				}
				
				ar2[ar.length]=num;
				
				ar = ar2;
				break;
			case 3:
				System.out.println("정보를 삭제 합니다");
				
				if(ar.length==0) {
					System.out.println("더이상 삭제할 데이터가 없어요");
					continue;
				}
				
				int [] ar3 = new int[ar.length-1];
				
				for(int i=0;i<ar3.length;i++) {
					ar3[i]=ar[i];
				}
				
				ar = ar3;
				
				break;
			default:
				System.out.println("프로그램을 종료 합니다");
				flag = false;
			}
			
		}
		
		
		
	}

}
