package com.vio.udemy1.repositories;

import com.vio.udemy1.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
