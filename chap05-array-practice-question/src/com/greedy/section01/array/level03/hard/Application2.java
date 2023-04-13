package com.greedy.section01.array.level03.hard;

public class Application2 {

	public static void main(String[] args) {
		/* 로또번호 생성기 
		 * 6칸 짜리 정수 배열을 하나 생성하고
		 * 1부터 45까지의 중복되지 않는 난수를 발생시켜 각 인덱스에 대입한 뒤
		 * 오름차순 정렬하여 출력하세요
		 * */
		
//		TODO 2023.04.06 과제 강서연
		
//		1단계 for에서 random 변수는 선언되면서 0값으로 할당된다.
//		lotteNums 배열은 값을 할당하기 전이기 때문에 기본값이 들어가 있다. 
//		lotteNums는 int 배열이기 때문에 들어가 있는 기본값은 0이다.
//		그래서 최초의 순간에는 random 0 값과 기본값 0을 비교하기 때문에
//		if문 내부에 진입해서 Math.random()으로 값을 생성하게 된다.
//		생성된 랜덤 값이 lotteNums에 할당된 값들과 중복되는지 비교해야 하므로
//		j를 0으로 초기화해서 2단계 for문을 빠져나가지 못하게 했다.
//		이렇게 하면 중복값이 없어야만 정상적으로 j가 증가하고 2단계 for를 빠져나가게 된다.
		
		int[] lottoNums = new int[6];

		// 1단계 for문 int i 사용
		for(int i=0; i<lottoNums.length; i++) {
			int random = 0;
//			2단계 for문 int j 사용 
			for(int j=0; j<=i; j++) {

				if (random == lottoNums[j]) {
					random = (int)((java.lang.Math.random() * 45) + 1);
					j=-1;
				}
			}
			lottoNums[i] = random;
		}
		
		int temp;
//		선택정렬
		for(int i=1; i<lottoNums.length; i++) {
			for (int j=0; j<i; j++) {
				//j가 i보다 index가 앞에서 시작하는데 크다는건 치환해야 한다는 뜻이다.
				if (lottoNums[j] > lottoNums[i]) { 
					temp = lottoNums[j];
					lottoNums[j] = lottoNums[i];
					lottoNums[i] = temp;
				}
			}
		}
		
//		배열 값 전체 출력하기
		for(int i : lottoNums) {
			System.out.print(i + " ");
		}
	}
}