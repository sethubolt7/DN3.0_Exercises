package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    public  void service(){
        System.out.println("Book Service method is called!!");
        bookRepository.success();
    }

    public BookService(){
        System.out.println("Book Service class object is created using spring in IOC container");
    }
}
