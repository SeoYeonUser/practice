package com.greedy.level03.hard.emp.run;

import java.util.Scanner;

import com.greedy.level03.hard.emp.model.dto.EmployeeDTO;

public class Application {

	public static void main(String[] args) {
		// TODO 2023.04.10 과제 강서연
		
		//기본 생성자로 객체 생성
		EmployeeDTO em = new EmployeeDTO();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("number 입력하세요 ");
		em.setNumber(sc.nextInt());
		
		sc.nextLine(); //버퍼비움
		System.out.print("name 입력하세요 ");
		em.setName(sc.nextLine());
		
		System.out.print("dept 입력하세요 ");
		em.setDept(sc.nextLine());
		
		System.out.print("job 입력하세요 ");
		em.setJob(sc.nextLine());
		
		System.out.print("age 입력하세요 ");
		em.setAge(sc.nextInt());
		
		sc.nextLine(); //버퍼비움
		
		System.out.print("gender 입력하세요 ");
		em.setGender(sc.nextLine().charAt(0));
		
		System.out.print("salary 입력하세요 ");
		em.setSalary(sc.nextInt());
		
		System.out.print("bonusPoint 입력하세요 ");
		em.setBonusPoint(sc.nextDouble());
		
		sc.nextLine(); //버퍼비움
		
		System.out.print("phone 입력하세요 ");
		em.setPhone(sc.nextLine());
		
		System.out.print("address 입력하세요 ");
		em.setAddress(sc.nextLine());

		System.out.println("===== 실행결과 ======");
		//출력함
		System.out.print("number : ");
		System.out.println(em.getNumber());
		
		System.out.print("name : ");
		System.out.println(em.getName());
		
		System.out.print("dept : ");
		System.out.println(em.getDept());
		
		System.out.print("job : ");
		System.out.println(em.getJob());
		
		System.out.print("age : ");
		System.out.println(em.getAge());
		
		System.out.print("gender : ");
		System.out.println(em.getGender());
		
		System.out.print("salary : ");
		System.out.println(em.getSalary());
		
		System.out.print("bonusPoint : ");
		System.out.println(em.getBonusPoint());
		
		System.out.print("phone : ");
		System.out.println(em.getPhone());
		
		System.out.print("address : ");
		System.out.println(em.getAddress());

	}

}
