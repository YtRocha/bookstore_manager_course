package com.ytrocha.bookstoremanager.controller;

import com.ytrocha.bookstoremanager.dto.MessageResponseDTO;
import com.ytrocha.bookstoremanager.entity.Book;
import com.ytrocha.bookstoremanager.repository.BookRepository;
import com.ytrocha.bookstoremanager.service.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/books")
public class BookControler {

    private BookService bookService;

    @Autowired
    public BookController(BookService bookService){
        this.bookService = bookService;
    }

    @PostMapping
    public MessageResponseDTO creat(@RequestBody Book book){
        return bookService.create(book);
    }
}
