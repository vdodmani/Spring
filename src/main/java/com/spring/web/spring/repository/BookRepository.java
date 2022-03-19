package com.spring.web.spring.repository;

import com.spring.web.spring.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}
