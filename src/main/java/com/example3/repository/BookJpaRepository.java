package com.example3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example3.model.Book;

public interface BookJpaRepository extends JpaRepository<Book, Integer>
{

}
