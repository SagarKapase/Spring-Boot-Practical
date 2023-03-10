package com.crudoperation.repository;

import com.crudoperation.model.Books;
import org.springframework.data.repository.CrudRepository;

public interface BooksRepository extends CrudRepository<Books,Integer> {
}
