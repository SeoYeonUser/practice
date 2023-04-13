package com.ohgiraffers.hw3.model.vo;

import com.ohgiraffers.hw3.controller.ProductController;

public class ProductDTO {
	
	private int pId; //제품번호
	private String pName; //제품명
	private int price; //제품가격
	private double tax; //제품세금
	
	public ProductDTO() {
		ProductController.count++;
	}

	public ProductDTO(int pId, String pName, int price, double tax) {
		this.pId = pId;
		this.pName = pName;
		this.price = price;
		this.tax = tax;
		ProductController.count++;
	}
	
	public String information() {
		return "제품번호 : " + pId + ", "
				+ "제품명 : " + pName + ", "
				+ "제품가격 : " + price + ", "
				+ "제품세금 : " + tax;
	}
}
