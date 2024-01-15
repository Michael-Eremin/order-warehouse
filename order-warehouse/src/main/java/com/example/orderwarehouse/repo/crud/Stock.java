package com.example.orderwarehouse.repo.crud;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Stock extends CrudRepository<Stock, Integer> {
}
