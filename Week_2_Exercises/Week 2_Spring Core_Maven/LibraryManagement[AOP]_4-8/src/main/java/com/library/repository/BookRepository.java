package com.library.repository;

public class BookRepository {
    public  BookRepository(){
        System.out.println("Book repository class object is created using spring in IOC container");
    }
    public  void success(){
        System.out.println("Success!!");
    }
}
