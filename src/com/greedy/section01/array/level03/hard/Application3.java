package com.greedy.section01.array.level03.hard;

import java.util.Scanner;

public class Application3 {

	public static void main(String[] args) {
		
		/* 숫자 야구게임 만들기 
		 * 길이 4의 정수 배열을 만들고 각 인덱스에는 0 ~ 9까지의 중복되지 않는 난수를 저장한다.
		 * 4자리 숫자를 입력받아 스트라이크, 볼 등의 힌트를 주며 4자리 난수 숫자를 맞추는 게임이다.
		 * 숫자와 자리가 모두 맞는 경우 스트라이크, 숫자는 맞지만 자리는 맞지 않는 경우는 볼 이다.
		 * 예) 9183 으로 난수가 발생하면 9356 입력 시 1S 1B이다.
		 * 
		 * 단, 기회는 총 10번이며, 10번 이내에 맞추는 경우 "정답입니다." 출력 후 게임 종료
		 * 10번의 기회가 모두 소진 되면 "10번의 기회를 모두 소진하셨습니다. 프로그램을 종료합니다." 출력 후 종료
		 * 
		 * 또한 4자리의 정수를 입력하지 않은 경우에는 "4자리의 정수를 입력해야 합니다." 출력 후 입력을 다시 받을 수 있되
		 * 횟수는 차감하지 않는다.
		 * 
		 * -- 프로그램 예시 (난수 7416 의 경우) --
		 *
		 * 10회 남으셨습니다.
		 * 4자리 숫자를 입력하세요 : 1234
		 * 아쉽네요 0S 2B 입니다.
		 * 9회 남으셨습니다.
		 * 4자리 숫자를 입력하세요 : 5678
		 * 아쉽네요 0S 2B 입니다.
		 * 8회 남으셨습니다.
		 * 4자리 숫자를 입력하세요 : 7416
		 * 정답입니다.
		 * */
		
		int[] ranNums = new int[4];

		// 1단계 for문 int i 사용
		for(int i=0; i<ranNums.length; i++) {
			ranNums[i] = -1; // 랜덤값이 0부터 시작하기 때문에 -1로 초기화
			int random = -1;
//			2단계 for문 int j 사용 
//			중복값이 없어야만 for j 문을 빠져나올 수 있다.
			for(int j=0; j<=i; j++) {
				if (random == ranNums[j]) {
					random = (int)(java.lang.Math.random() * 10);
					j=-1; //for에서 j++ 만나면 0되도록 하기 위함
				}
			}
			ranNums[i] = random;
		}
		
		String inputData;
		Scanner sc = new Scanner(System.in);
		
		int gameOver = 10;
		
		while (gameOver>0) {
			System.out.println((gameOver--) + "회 남았습니다.");
			label1:
			for(;;){
				
				System.out.print("4자리 숫자를 입력하세요 : ");
				inputData = sc.nextLine();
				
				if(inputData.length() == 4) {
					label2:
					for(int i=0; i<=inputData.length()-2; i++) {
						for(int j=i+1; j <= inputData.length()-1; j++) {
							
							if (inputData.charAt(i) == inputData.charAt(j)) {
								//중복됨
								System.out.println("중복된 값은 입력하실 수 없습니다.");
								break label2;
							} else {
								// 값이 다를 경우 index 값이 마지막 값이 아니면 증가시켜서  
								// 다른 방에도 중복값이 있는지 체크해야 함.
								// 그래서 조건문으로 index가 마지막 방까지 순환했는지를 체크해야 한다.
								
								if(i == inputData.length()-2) {
									// 마지막 방까지 순환했다면 중복 값이 없다는 뜻이다.
									break label1;
								}
							}
						}
					}
					
				} else {
					System.out.println("4자리 숫자가 아닙니다.");
				}
			}
			
//			System.out.print("사용자가 입력한 숫자는 " + inputData);
			int bCnt=0;
			int sCnt=0;
			
			for(int i = 0; i < inputData.length(); i++) {
				for(int j = 0; j < ranNums.length; j++) {
					if(((int)inputData.charAt(i))-48 == ranNums[j]) {
						if(i == j) {
							sCnt++;
						} else {
							bCnt++;
						}
					}
				}
			}
//			System.out.print("랜덤 값 : ");
//			for(int i : ranNums) {
//				System.out.print(i);
//			}
			System.out.println();
//			System.out.println("bcnt" + bCnt);
//			System.out.println("scnt" + sCnt);
			
			if(sCnt == ranNums.length) {
				System.out.println("축하합니다. 정답입니다.");
				break;
			} else {
				System.out.println("아쉽네요. " + sCnt + "S, " + bCnt + "B 입니다.");
				sCnt = 0;
				bCnt = 0;
				System.out.println();
			}
		} //최상위 while 종료
		System.out.println("게임이 끝났습니다.");
	}
}