package com.ohgiraffers.hw2.run;

import java.util.Scanner;

import com.ohgiraffers.hw2.model.dto.StudentDTO;

public class Application {

	public static void main(String[] args) {
		// TODO 2023.04.11 과제 강서연
		
//		10명의 학생 정보를 기록 객체 배열 할당
		
		StudentDTO[] st = new StudentDTO[10];
		Scanner sc = new Scanner(System.in);
		
		
		
		int grade; //학년
		int classroom; //반
		String name; //이름
		int kor; //국어점수
		int eng; //영어점수
		int math; //수학점수
		
		int cnt = 0;
		
		loop:
		while(true) {			
			System.out.print("학생 정보 입력 계속하려면 y : ");			
			char menu = sc.nextLine().charAt(0);
			
			switch(menu) {
				case 'y' : 
				case 'Y' :
					System.out.print("학년 입력 : ");
					grade = sc.nextInt();
					
					System.out.print("반 입력 : ");
					classroom = sc.nextInt();
					
					sc.nextLine(); //버퍼 비움
					System.out.print("이름 입력 : ");
					name = sc.nextLine();
					
					System.out.print("국어점수 입력 : ");
					kor = sc.nextInt();
					
					System.out.print("영어점수 입력 : ");
					eng = sc.nextInt();
					
					System.out.print("수학점수 입력 : ");
					math = sc.nextInt();
					sc.nextLine(); //버퍼비움
					
					st[cnt] = new StudentDTO(grade, classroom, name
								, kor, eng, math);
					//등록한 수를 카운트함
					cnt++;
					System.out.println("현재 " + cnt + "명이 등록되었습니다.");
					break;
				default:break loop;
			}
		}
		System.out.println();
		System.out.println("모두 " + cnt + "명 등록되어 있습니다. 등록된 학생 리스트 입니다.");
		//등록된 수 만큼 반복
		for(int i=0; i < cnt; i++) {
			System.out.println(st[i].information());
		}
//		System.out.println("i값은 " + i);
		
//		System.out.println((st[0]==null)?"널이다":"널아니다");
//		System.out.println(st[0]);
//		System.out.println((st[1]==null)?"널이다":"널아니다");
//		
		System.out.println("종료한다.");
	}
}
