package com.project.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.demo.models.Book;
import com.project.demo.repositories.BookRepo;

@RestController
@RequestMapping("/book")
public class BookController {

	
	@Autowired
	private BookRepo repo;
	
	
	
	@GetMapping("/getBooks")
	public List<Book> getBooks() {
		return repo.findAll();
	}
	
	@PostMapping("/addBook")
	public Book addBook( @RequestBody Book book) {
		return repo.save(book);
	}
	
}
