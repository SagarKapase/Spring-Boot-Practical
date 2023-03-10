package com.api.book.services;

import com.api.book.models.Book;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Component
public class BookService {

    private static List<Book> list=new ArrayList<>();

    static {
        list.add(new Book(101,"HPC","Samarth Jedage"));
        list.add(new Book(102,"SDN","Vinayak Jalan"));
        list.add(new Book(103,"BI","Sagar Kapase"));
    }

    //get all books
    public List<Book> getAllBooks(){
        return list;
    }

    //get book by id
    public Book getBookById(int id){
        Book book=null;
        book=list.stream().filter(e->e.getId()==id).findFirst().get();
        return book;
    }
}
