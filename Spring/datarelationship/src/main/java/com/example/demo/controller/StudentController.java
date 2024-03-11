package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entity.Book;
import com.example.demo.entity.Student;
import com.example.demo.repo.BookRepository;
import com.example.demo.repo.StudentRepository;
@Controller
public class StudentController {

	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private BookRepository bookRepository;
	
	@PostMapping("/add/book")
	public ResponseEntity<Book> addBook(@RequestBody Book book)
	{
		Book savedBook = bookRepository.save(book);
		return new ResponseEntity<>(savedBook,HttpStatus.CREATED);
	}
	@PostMapping("/add/student")
	public ResponseEntity<Student> addStudent(@RequestBody Student student)
	{
		
		if(student.getBook()==null|| student.getBook().getId()==0)
		{
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		
		Book book = bookRepository.findById(student.getBook().getId()).orElse(null);
		if(book==null)
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		student.setBook(book);
		Student savedStudent = studentRepository.save(student);
		
		return new ResponseEntity<Student>(savedStudent,HttpStatus.CREATED);
		
	}
}
