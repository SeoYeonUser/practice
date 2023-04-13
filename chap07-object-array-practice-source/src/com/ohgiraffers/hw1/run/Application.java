package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.EmployeeDTO;

public class Application {

	public static void main(String[] args) {
		// TODO 2023.04.11 과제 강서연
		
//		3개 생성자 사용하여 3명의 사원정보를 배열로 생성
//		출력해보고 값이 없는 필드에 값을 입력해서 출력
//		직원 각각의 보너스가 적용된 연봉을 계산해서 출력
//		총 직원 연봉의 평균 구하여 출력
		
//		객체배열 크기를 3으로 할당
		EmployeeDTO[] emp = new EmployeeDTO[3];
		
//		생성자를 이용해서 객체 생성
		emp[0] = new EmployeeDTO();
		System.out.println("emp[0] : " + emp[0].information());
		
		emp[1] = new EmployeeDTO(1, "홍길동", 19, 'M'
								, "01022223333", "서울 잠실");
		System.out.println("emp[1] : " + emp[1].information());
		
		emp[2] = new EmployeeDTO(2, "강말순", "교육부", "강사", 20, 'F'
				, 1000000, 0.01, "01011112222", "서울 마곡");
		System.out.println("emp[2] : " + emp[2].information());

//		3개의 객체 중 값이 없는 필드에 각각 값을 넣은 뒤 출력
		emp[0].setEmpName("김말똥");
		emp[0].setDept("영업부");
		emp[0].setJob("팀장");
		emp[0].setAge(30);
		emp[0].setGender('M');
		emp[0].setSalary(3000000);
		emp[0].setBonusPoint(0.2);
		emp[0].setPhone("01055559999");
		emp[0].setAddress("전라도 광주");
		System.out.println("emp[0] : " + emp[0].information());
		
		emp[1].setDept("기획부");
		emp[1].setJob("부장");
		emp[1].setSalary(4000000);
		emp[1].setBonusPoint(0.3);
		System.out.println("emp[1] : " + emp[1].information());
		
//		직원 각각의 보너스가 적용된 1년 연봉 출력
//		연봉 = (급여 + (급여 * 보너스포인트)) * 12
//		   (salary + (salary * bonusPoint)) * 12
		
		int result1 = (emp[0].getSalary() + 
				(int)(emp[0].getSalary() * emp[0].getBonusPoint()))
				* 12;
		
		int result2 = (emp[1].getSalary()
				+ (int)(emp[1].getSalary() * emp[1].getBonusPoint()))
				* 12;
		
		int result3 = (emp[2].getSalary()
				+ (int)(emp[2].getSalary() * emp[2].getBonusPoint()))
				* 12;
		
		System.out.println(emp[0].getEmpName() + "의 연봉 : "
						+ result1 + "원");
		
		System.out.println(emp[1].getEmpName() + "의 연봉 : "
						+ result2 + "원");		
		
		System.out.println(emp[2].getEmpName() + "의 연봉 : "
						+ result3 + "원");
		
		System.out.println("직원들의 연봉의 평균 : "
				+ (result1 + result2 + result3)/3 + "원");
	}

}
