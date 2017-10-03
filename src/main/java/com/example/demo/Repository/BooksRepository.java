package com.example.demo.Repository;

import com.example.demo.model.Book;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.Id;

public interface BooksRepository extends CrudRepository<Book, Long>{


}
