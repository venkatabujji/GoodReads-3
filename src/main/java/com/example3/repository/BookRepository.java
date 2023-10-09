package com.example3.repository;

import java.util.ArrayList;

import com.example3.model.Book;

public interface BookRepository
{
ArrayList<Book>getBooks();
Book addBook(Book book);
Book getBookById(int bookId);
Book updateBook(int bookId, Book book);
void deleteBook(int bookId);
}
