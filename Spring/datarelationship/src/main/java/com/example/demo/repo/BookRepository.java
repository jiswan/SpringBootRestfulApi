package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Book;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{


    List<Book> findByBookName(String bookname);
}
