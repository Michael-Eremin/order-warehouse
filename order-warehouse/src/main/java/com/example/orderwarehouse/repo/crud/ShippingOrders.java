package com.example.orderwarehouse.repo.crud;

import com.example.orderwarehouse.data.entity.id.ShippingOrdersPk;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShippingOrders extends CrudRepository<ShippingOrders, ShippingOrdersPk> {
}
