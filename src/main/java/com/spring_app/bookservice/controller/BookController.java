package com.spring_app.bookservice.controller;

import com.spring_app.bookservice.model.Book;
import com.spring_app.bookservice.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author debabrata
 */
@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    BookService bookService;

    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.getAll();
    }
    @PostMapping
    public Book addBook(@RequestBody Book book) {
        return bookService.save(book);
    }
    @GetMapping("/{id}") public Book getBook(@PathVariable Long id) {
        return bookService.getById(id);
    }
    @DeleteMapping("/{id}") public void delete(@PathVariable Long id) {
        bookService.delete(id);
    }
}
