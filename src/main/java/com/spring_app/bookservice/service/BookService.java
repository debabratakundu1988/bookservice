package com.spring_app.bookservice.service;

import com.spring_app.bookservice.model.Book;
import com.spring_app.bookservice.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author debabrata
 */
@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;

    public List<Book> getAll() { return bookRepository.findAll(); }
    public Book getById(Long id) { return bookRepository.findById(id).orElse(null); }
    public List<Book> getByCategory(String cat) { return bookRepository.findByCategory(cat); }
    public Book save(Book book) { return bookRepository.save(book); }
    public void delete(Long id) { bookRepository.deleteById(id); }
}
