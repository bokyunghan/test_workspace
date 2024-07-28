package com.sh.oop.product.controller;

import com.sh.oop.product.model.Product;

public class TestProduct {
	public static void main(String[] args) {
		Product pd = new Product("ssgnote6" , "갤럭시노트6" , "경기도 수원" , 960000 , 10.0);
		pd.information();
		
		Product pd1 = new Product("lgxnote5" , "LG스마트폰5" , "경기도 평택" , 780000 , 0.7);
		pd1.information();
		
		Product pd2 = new Product("ktnorm3" , "KT일반폰3" , "서울시 강남" ,25000, 0.3);
		pd2.information();
		
		pd.setPrice(1200000);
		pd1.setPrice(1200000);
		pd2.setPrice(1200000);
		
		pd.setTex(0.05);
		pd1.setTex(0.05);
		pd2.setTex(0.05);
		
		System.out.printf("상품명 : %s%n부가세 포함 가격 :%.0f원%n", pd.getProductName(),pd.getPrice()+(pd.getPrice() * pd.getTex()));
		System.out.printf("상품명 : %s%n부가세 포함 가격 :%.0f원%n", pd1.getProductName(),pd1.getPrice()+(pd1.getPrice() * pd1.getTex()));
		System.out.printf("상품명 : %s%n부가세 포함 가격 :%.0f원", pd2.getProductName(),pd2.getPrice()+(pd2.getPrice() * pd2.getTex()));
	}
}
