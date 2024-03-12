package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entity.Book;
import com.example.demo.entity.Student;
import com.example.demo.repo.BookRepository;
import com.example.demo.repo.StudentRepository;

import java.util.Iterator;

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

	@GetMapping("/students")
	public ResponseEntity<Iterable<Student>> allStudents()
	{
		Iterable<Student> listStudents = studentRepository.findAll();
		return new ResponseEntity<>(listStudents,HttpStatus.OK);
	}
	@GetMapping("/books")
	public ResponseEntity<Iterable<Book>> allBooks()
	{
		Iterable<Book> listBooks= bookRepository.findAll();
		return new ResponseEntity<>(listBooks,HttpStatus.OK);
	}

	@PostMapping("/update/student/{id}")
	public ResponseEntity<Student> updateStudent(@RequestBody Student updateStudent, @PathVariable long id)
	{
		Student exsistingStudent = studentRepository.findById(id).orElse(null);
		if(exsistingStudent==null)
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		exsistingStudent.setName(updateStudent.getName());


		Student saveStudent = studentRepository.save(exsistingStudent);
		return new ResponseEntity<>(saveStudent,HttpStatus.OK);
	}

	@PostMapping("/update/book/{id}")
	public ResponseEntity<Book> updateBook(@PathVariable long id ,@RequestBody Book book)
	{
		Book existingBook = bookRepository.findById(id).orElse(null);
		if (existingBook==null)
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		existingBook.setBookName(book.getBookName());
		Book savedBook = bookRepository.save(existingBook);
		return new ResponseEntity<>(savedBook,HttpStatus.OK);
	}
}
