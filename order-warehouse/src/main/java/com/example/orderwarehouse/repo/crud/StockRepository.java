package com.example.orderwarehouse.repo.crud;

import com.example.orderwarehouse.data.entity.StockEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepository extends CrudRepository<StockEntity, Integer> {
}
