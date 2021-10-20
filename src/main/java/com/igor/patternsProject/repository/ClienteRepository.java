package com.igor.patternsProject.repository;

import com.igor.patternsProject.model.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {
}
