package com.example.BookstoreAPI.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookDTO {

    @JsonProperty("book_id")
    private Long id;

    @JsonProperty("book_title")
    private String title;

    private String author;

    @JsonProperty("book_price")
    private double price;
}

