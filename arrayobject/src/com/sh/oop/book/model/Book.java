package com.sh.oop.book.model;

public class Book {
	String title;
	String author;
	int price;
	double discountRate;
	
	public Book() {
		
	}

	public Book(String title, String author, int price, double discountRate) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.discountRate = discountRate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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

	public void bookinformation() {
		System.out.println(title + ", " + price + ", "  + discountRate + ", " + author);
	}

}
