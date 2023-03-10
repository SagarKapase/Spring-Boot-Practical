package com.crudoperation.controller;

import com.crudoperation.model.Books;
import com.crudoperation.service.BooksServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//mark class as a RestController which handles the client Request
@RestController
public class BooksController {
    @Autowired
    BooksServices booksServices;

    //creating a getMapping that retrives all the books detail from the database
    @GetMapping("/books")
    private List<Books> getAllBooks(){
        return booksServices.getAllBooks();
    }

    //creating a deleteMapping that deletes a specific book
    @DeleteMapping("/books/{bookId}")
    private void deleteBook(@PathVariable("bookId")int bookId){
        booksServices.delete(bookId);
    }

    //creating a postMapping that post the book detail in the database
    @PostMapping("/storebook")
    private int saveBook(@RequestBody Books books){
        booksServices.saveOrUpdate(books);
        return books.getBookId();
    }

    //creating a put mapping that updates the book detail
    @PutMapping("/storebook")
    private Books update(@RequestBody Books books){
        booksServices.saveOrUpdate(books);
        return books;
    }
}
