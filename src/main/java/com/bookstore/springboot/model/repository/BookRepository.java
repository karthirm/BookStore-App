package com.bookstore.springboot.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookstore.springboot.model.Book;


public interface BookRepository extends JpaRepository<Book, Long> {

}
