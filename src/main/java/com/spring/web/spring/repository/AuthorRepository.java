package com.spring.web.spring.repository;

import com.spring.web.spring.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
