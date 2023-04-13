package com.ohgiraffers.hw2.model.dto;

public class StudentDTO {
	private int grade; //학년
	private int classroom; //반
	private String name; //이름
	private int kor; //국어점수
	private int eng; //영어점수
	private int math; //수학점수
	
//	기본생성자
	public StudentDTO() {}

	public StudentDTO(int grade, int classroom, String name, int kor, int eng, int math) {
		super();
		this.grade = grade;
		this.classroom = classroom;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public String information() {
		
		return "학년 : " + grade //학년
				+ ", 반 : " + classroom  //반
				+ ", 이름 : " + name//이름
				+ ", 국어점수 : " + kor //국어점수
				+ ", 영어점수 : " + eng  //영어점수
				+ ", 수학점수 : " + math  //수학점수
				+ ", 평균 : " + ((kor+eng+math)/3); //평균
	}
}
