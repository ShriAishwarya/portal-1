package com.example.demo.Models;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Book {
	@Id
	private int id;
	private String bookName;
	private float price;
	private int quantaty;
	private String authprName;
	public Book(int id, String bookName, float price, int quantaty, String authprName) {
		super();
		this.id = id;
		this.bookName = bookName;
		this.price = price;
		this.quantaty = quantaty;
		this.authprName = authprName;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getQuantaty() {
		return quantaty;
	}
	public void setQuantaty(int quantaty) {
		this.quantaty = quantaty;
	}
	public String getAuthprName() {
		return authprName;
	}
	public void setAuthprName(String authprName) {
		this.authprName = authprName;
	}
	
	

}
