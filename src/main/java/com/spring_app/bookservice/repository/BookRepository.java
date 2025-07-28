package com.spring_app.bookservice.repository;

import com.spring_app.bookservice.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author debabrata
 */
public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByCategory(String category);
}
