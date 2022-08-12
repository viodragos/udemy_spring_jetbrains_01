package com.vio.udemy1.repositories;

import com.vio.udemy1.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
