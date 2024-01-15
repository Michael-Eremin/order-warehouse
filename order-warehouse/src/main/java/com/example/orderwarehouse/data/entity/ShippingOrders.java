package com.example.orderwarehouse.data.entity;

import com.example.orderwarehouse.data.entity.id.OrderPk;
import com.example.orderwarehouse.data.entity.id.ShippingOrdersPk;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "shipping_order", schema = "orders")
@IdClass(ShippingOrdersPk.class)
@NoArgsConstructor
@Getter
@Setter
public class ShippingOrders {
    @Id
    @Column(name="order_id")
    private Long orderId;
    @Id
    @Column(name="order_line_id")
    private Integer orderLineId;
    @Id
    @Column(name="stock_id")
    private Integer stockId;
    @Column(name="stock_name")
    private String StockName;
    @Column(name="stock_capacity")
    private Integer StockCapacity;
    @Column(name="customer_name")
    private String customerName;
    @Column(name="customer_id")
    private Integer customerId;
    @Column(name="delivery_address")
    private String deliveryAddress;
    @Column(name="packed_weight")
    private Integer packedWeight;
    @Column(name="order_date", columnDefinition = "timestamp with time zone")
    private Date orderDate;
    @Column(name="delivery_date", columnDefinition = "timestamp with time zone")
    private Date deliveryDate;
}
