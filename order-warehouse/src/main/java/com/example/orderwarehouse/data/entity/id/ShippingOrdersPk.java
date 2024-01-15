package com.example.orderwarehouse.data.entity.id;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Id;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
@Embeddable
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class ShippingOrdersPk implements Serializable {
    @Id
    @Column(name="order_id")
    private Long orderId;
    @Id
    @Column(name="order_line_id")
    private Integer orderLineId;
    @Id
    @Column(name="stock_id")
    private Integer stockId;
}
