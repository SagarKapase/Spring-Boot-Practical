package com.crudoperation.service;

import com.crudoperation.model.Books;
import com.crudoperation.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

//defining a business logic
@Service
public class BooksServices {

    @Autowired
    BooksRepository booksRepository;
    //getting all the books record by using the method findAll() of CrudRepository

    public List<Books> getAllBooks(){
        List<Books> books=new ArrayList<Books>();
        booksRepository.findAll().forEach(books1 -> books.add(books1));
        return books;
    }

    //getting a specific record by using the method findById() of CrudRepository
    public Books getBooksById(int id){
        return booksRepository.findById(id).get();
    }

    //saving a specific record by using method save() of CrudRepository
    public void saveOrUpdate(Books books){
        booksRepository.save(books);
    }

    //deleting a specific record by using the method deleteById() of CrudRepository
    public void delete(int id){
        booksRepository.deleteById(id);
    }

    //updating record
    public void update(Books books, int bookId){
        booksRepository.save(books);
    }
}
