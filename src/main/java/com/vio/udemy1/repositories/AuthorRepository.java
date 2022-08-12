package com.vio.udemy1.repositories;

import com.vio.udemy1.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
