package com.greedy.section01.array.level02.normal;

public class Application6 {

	public static void main(String[] args) {
		
		/* 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
		 * 1 ~ 10 사이의 난수를 발생시켜 배열에 초기화 후
		 * 배열 전체 값과 그 값 중에서 최대값과 최소값을 찾아서 출력하세요.
		 * 
		 * =========== 출력 ============
		 * 2 10 5 2 3 7 3 7 9 7
		 * 최대값 : 10
		 * 최소값 : 2
		 * */
		
//		TODO 2023.04.06 과제 강서연
		int[] iArr = new int[10];
		
		for(int i = 0; i < iArr.length; i++) {
			iArr[i] = (int) ((java.lang.Math.random() * 10) + 1);
		}
		
		//우선, 배열의 처음 값을 min과 max의 기준으로 잡음.
		int min = iArr[0];
		int max = iArr[0];
		
		for(int i : iArr) {
			min = (min > i)? i : min;
			max = (max < i)? i : max;
			
			System.out.print(i +  " ");
		}
		
		System.out.println();
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
		for(int i : iArr) {
			min = java.lang.Math.min(min, i);
			max = java.lang.Math.max(max, i);
			System.out.print(i +  " ");
		}
		System.out.println();
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}
}