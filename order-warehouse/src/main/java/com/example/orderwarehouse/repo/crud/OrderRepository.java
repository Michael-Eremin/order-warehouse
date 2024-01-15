package com.example.orderwarehouse.repo.crud;

import com.example.orderwarehouse.data.entity.Order;
import com.example.orderwarehouse.data.entity.id.OrderPk;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends CrudRepository <Order, OrderPk> {
}
