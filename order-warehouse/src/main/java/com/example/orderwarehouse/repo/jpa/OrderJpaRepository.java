package com.example.orderwarehouse.repo.jpa;

import com.example.orderwarehouse.data.entity.OrderEntity;
import com.example.orderwarehouse.data.entity.id.OrderPk;
import com.example.orderwarehouse.data.prjection.OrderProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.relational.core.sql.In;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderJpaRepository extends JpaRepository<OrderEntity, OrderPk> {
    List<OrderEntity> findAll();
    List<OrderProjection> findAllProjectedBy();
    OrderProjection findOrderProjectionByOrderIdAndOrderLineId(Long orderId, Integer orderLineId);
}
