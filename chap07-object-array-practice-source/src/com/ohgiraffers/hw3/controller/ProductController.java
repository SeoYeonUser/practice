package com.ohgiraffers.hw3.controller;

import java.util.Scanner;

import com.ohgiraffers.hw3.model.vo.ProductDTO;

public class ProductController {
	private ProductDTO[] pro = new ProductDTO[10];
	
	public static int count; //추가된 객체 수 스태틱변수
	
	Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {

		loop:
		do {
			int menu = 0;
			
			System.out.println("===== 제품 관리 메뉴 =====");
			System.out.println("1. 제품 정보 추가");
			System.out.println("2. 제품 전체 조회");
			System.out.println("9. 프로그램 종료");
			
			System.out.print("입력하세요 : ");
			menu = sc.nextInt();
			
			switch (menu) {
				case 1: productInput(); break;
				case 2: productPrint(); break;
				default : System.out.println("종료합니다.");break loop;
			}
		}while(count < pro.length); //배열 수만큼 반복
		
	}
	
	public void productInput() {
			
		System.out.println("도서 정보를 입력해주세요.");
		System.out.print("제품번호 입력 : " );
		int pId = sc.nextInt();
		
		System.out.print("제품명 입력 : " );
		sc.nextLine(); //버퍼 비움
		String pName = sc.nextLine();
		
		System.out.print("제품가격 입력 : " );
		int price = sc.nextInt();
		
		System.out.print("제품세금 입력 : " );
		double tax = sc.nextDouble();
		pro[count] = new ProductDTO(pId, pName, price, tax);
	}
	
	public void productPrint() {
//		System.out.println("프린트하이");
		
		for(int i = 0; i < count; i++) {
			System.out.println(pro[i].information());
		}
	}
}
