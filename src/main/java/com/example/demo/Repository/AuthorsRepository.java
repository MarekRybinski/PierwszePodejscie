package com.example.demo.Repository;

import com.example.demo.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorsRepository extends CrudRepository<Author, Long> {


}
