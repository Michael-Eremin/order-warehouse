package com.example.orderwarehouse.data.entity;

import com.example.orderwarehouse.data.entity.id.ShippingOrdersPk;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "stock", schema = "orders")
@NoArgsConstructor
@Getter
@Setter
public class Stock {
    @Id
    @Column(name="stock_id")
    private Integer stockId;
    @Column(name="stock_name")
    private String StockName;
    @Column(name="stock_address")
    private String stockAddress;
    @Column(name="stock_capacity")
    private Integer StockCapacity;
    @Column(name="stock_balance")
    private Integer stockBalance;
}
