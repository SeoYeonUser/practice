package com.ohgiraffers.hw3.run;

import com.ohgiraffers.hw3.controller.ProductController;
import com.ohgiraffers.hw3.model.vo.ProductDTO;

public class Application {

	public static void main(String[] args) {
		// TODO 2023.04.11 과제 강서연
		
		ProductController pc = new ProductController();
		
		pc.mainMenu();
		
//		ProductDTO test1 = new ProductDTO();
//		ProductDTO test2 = new ProductDTO();
//		ProductDTO test3 = new ProductDTO();
//		ProductDTO test4 = new ProductDTO();
//		System.out.println(test1.information());
	}

}
