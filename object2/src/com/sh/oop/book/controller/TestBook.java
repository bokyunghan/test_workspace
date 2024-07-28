package com.sh.oop.book.controller;

import com.sh.oop.book.model.Book;

public class TestBook {
	public static void main(String[] args) {
		Book book = new Book(); // null
//		book.bookInformation();
//		
		Book book1 = new Book("뇌를 자극하는 JAVA", 20000, 0.2, "김윤영");
//		book1.bookInformation();
//		
		book.setTitle("자바의 정석");
		book.setPrice(35000);
		book.setDiscountRate(0.1);
//		book.setAuthor("윤상섭");
//		
//		System.out.print(book.getTitle()+"\s");
//		System.out.print(book.getPrice()+"\s");
//		System.out.print(book.getDiscountRate()+"\s");
//		System.out.print(book.getAuthor());
		
		System.out.printf("도서명 : %s%n", book.getTitle());
		System.out.printf("할인된 가격 : %.0f원%n", book.getPrice()-(book.getPrice()*book.getDiscountRate()));
		
		System.out.printf("도서명 : %s%n", book1.getTitle());
		System.out.printf("할인된 가격 : %.0f원", book1.getPrice()-(book1.getPrice()*book1.getDiscountRate()));
	}
}

