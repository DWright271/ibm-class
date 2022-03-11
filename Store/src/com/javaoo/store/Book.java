package com.javaoo.store;

public class Book extends Item{

	private String author;
	private String publisher;
	private String category;
	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}
	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	/**
	 * @return the publisher
	 */
	public String getPublisher() {
		return publisher;
	}
	/**
	 * @param publisher the publisher to set
	 */
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}
	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}
	/**
	 * @param title
	 * @param price
	 * @param quantity
	 * @param author
	 * @param publisher
	 * @param category
	 */
	public Book(String title, double price, int quantity, String author, String publisher, String category) {
		super(title, price, quantity);
		this.author = author;
		this.publisher = publisher;
		this.category = category;
	}
	
	
	
}
