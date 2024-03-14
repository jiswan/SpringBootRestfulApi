package com.example.demo.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;



@Entity

public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotBlank(message = "Book name cannot be blank")
	@Size(min = 1,max = 100,message = "Book name must be between 1 and 100 characters")
	@Column(unique = true)
	private String bookName;
	
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}



	

	public Book(long id, String bookName) {
		
		this.id = id;
		this.bookName = bookName;
		
	}

	public Book() {
		
	}
	
	
	
	

	
	
	
	
}
