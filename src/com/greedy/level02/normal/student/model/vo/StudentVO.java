package com.greedy.level02.normal.student.model.vo;

public class StudentVO {
	private int grade; //학년
	private int classroom; //반
	private String name; //이름
	private double height; //키
	private char gender; //성별
	
	//기본생성자
	public StudentVO() {
		
	}
	//전체 초기화 생성자
	public StudentVO(int grade, int classroom
				, String name, double height, char gender) {
		this.grade = grade;
		this.classroom = classroom;
		this.name = name;
		this.height = height;
		this.gender = gender;
	}
	
	//출력 메서드
	public void printInformation() {		
		System.out.println("학년 : " + grade);
		System.out.println("반 : " + classroom);
		System.out.println("이름 : " + name);
		System.out.println("키 : " + height);
		System.out.println("성별 : " + gender);
	}
	
	//아래부터 getter, setter
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getClassroom() {
		return classroom;
	}
	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
}
