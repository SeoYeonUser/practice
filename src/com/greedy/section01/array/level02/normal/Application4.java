package com.greedy.section01.array.level02.normal;

import java.util.Scanner;

public class Application4 {

	public static void main(String[] args) {
		
		/* 사용자가 입력한 배열의 길이만큼의 정수형 배열을 선언 및 할당하고
		 * 배열 인덱스 넣을 값 역시 사용자가 입력하여 배열을 초기화히세요.
		 * 
		 * 그리고 배열 전체 값과 각 인덱스에 저장된 값들의 합을 출력핫헤요.
		 * 
		 * ========= 출력 ===========
		 * 정수를 입력하세요 : 3
		 * 배열 0번째 인덱스에 넣을 값 : 1
		 * 배열 1번째 인덱스에 넣을 값 : 2
		 * 배열 2번째 인덱스에 넣을 값 : 3
		 * 
		 * 1 2 3 
		 * 총합 : 6
		 * 
		 * */
		
//		TODO 2023.04.06 과제 강서연
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int scNum = sc.nextInt();
		
		//리턴받은 값이 false라면 종료
		if(!chkNum(scNum)) {
			return;
		}
		
		int[] iArrs = new int[scNum];
		int sum = 0;
		for(int i = 0; i < iArrs.length; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			iArrs[i] = sc.nextInt();
			sum+=iArrs[i];
		}
		
		for(int i : iArrs) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("총합 : " + sum);
		
	}
	
	public static boolean chkNum(int chkNum) {
		if(chkNum < 1) {
			System.out.println("1이상의 정수만 입력해주세요. 종료.");
			return false;
		}
		return true;
	}
}