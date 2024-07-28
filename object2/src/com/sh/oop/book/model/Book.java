package com.sh.oop.book.model;

public class Book {
	private String title;
	private String author;
	private int price;
	private double discountRate; //할인율
	
	public Book() {}

	public Book(String title, int price,double discountRate,String author) {
		super();
		this.title = title;
		this.price = price;
		this.discountRate = discountRate;
		this.author = author;
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
	
	public void bookInformation() {
		System.out.println(title + ", " + price + ", "  + discountRate + ", " + author);
	}
	
}
