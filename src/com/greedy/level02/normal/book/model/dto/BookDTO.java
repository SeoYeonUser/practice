package com.greedy.level02.normal.book.model.dto;

public class BookDTO {
	private String title;
	private String publisher;
	private String author;
	private int price;
	private double discountRate;
	
	//기본생성자
	public BookDTO() {
		
	}
	//생성자 오버로딩 필드 3개 초기화
	public BookDTO(String title, String publisher, String author) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
	}
	//생성자 오버로딩 모든 필드 초기화
	public BookDTO(String title, String publisher, String author
							, int price, double discountRate) {
		//this 생성자 사용함
		this(title, publisher, author);
//		this.title = title;
//		this.publisher = publisher;
//		this.author = author;
		this.price = price;
		this.discountRate = discountRate;
	}
	
	//필드값 출력용 메서드
	public void printInformation() {
		System.out.print(title + ", " + publisher + ", "
						+ author + ", " + price + ", " + discountRate);
		System.out.println();
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
}
