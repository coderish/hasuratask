package com.rish.tutorial.demo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rish.tutorial.demo.models.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

	List<Book> findByName(String name);
}
