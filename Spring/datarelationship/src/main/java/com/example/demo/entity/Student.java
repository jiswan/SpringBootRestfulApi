package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;


@Entity

public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@NotBlank(message = "Student Name cannot be blank")
	@Size(min = 1,max = 50 , message = "Student name must be between 1 and 50 characters")
	private String name;
	
	@ManyToOne
	@JoinColumn(name = "book_id")
	private Book book;

	public Student(long id, String name, Book book) {
		
		this.id = id;
		this.name = name;
		this.book = book;
	}

	public Student() {
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}
	
	

	
	
	




	
	

}
