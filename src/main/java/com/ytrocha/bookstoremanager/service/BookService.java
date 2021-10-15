package com.ytrocha.bookstoremanager.service;

import com.ytrocha.bookstoremanager.dto.MessageResponseDTO;
import com.ytrocha.bookstoremanager.entity.Book;
import com.ytrocha.bookstoremanager.repository.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    
    private BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    
    public MessageResponseDTO creat(Book book){
        Book savedBook = bookRepository.save(book);
        return MessageResponseDTO.builder()
        .message("Book created with Id" + savedBook.getId())
        .build();
    }
}
