package com.greedy.level02.normal.student.run;

import java.util.Scanner;

import com.greedy.level02.normal.student.model.vo.StudentVO;

public class Application {

	public static void main(String[] args) {
		// TODO 20223.04.10 과제 강서연
		
		Scanner sc = new Scanner(System.in);
		int grade; //학년
		int classroom; //반
		String name; //이름
		double height; //키
		char gender; //성별
		
		System.out.print("학년 입력 : ");
		grade = sc.nextInt();
		
		System.out.print("반 입력 : ");
		classroom = sc.nextInt();
		
		// 정수, 실수, 논리값 다음에 nextLine 쓰면 
		// 버퍼에 남은 값 때문에 오류생길 수 있어서 버퍼를 비워줬음.
		sc.nextLine();  
		
		System.out.print("이름 입력 : ");
		name = sc.nextLine();
		
		System.out.print("키 입력 : ");
		height = sc.nextDouble();
		
		//버퍼 비움
		sc.nextLine();
		
		System.out.print("성별 입력 : ");
		gender = sc.nextLine().charAt(0);
		
		//모든생성자로 필드 초기화 및 인스턴스 생성함
		StudentVO svo = new StudentVO(grade, classroom
										, name, height
										, gender);
		
		System.out.println("=====");
		
		svo.printInformation();

	}

}
