package com.bookstore.springboot.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookstore.springboot.model.User;


public interface UserRepository extends JpaRepository<User, Long> {

}
