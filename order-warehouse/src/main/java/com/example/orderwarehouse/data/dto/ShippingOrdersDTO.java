package com.example.orderwarehouse.data.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
@NoArgsConstructor
@Getter
@Setter
public class ShippingOrdersDTO {
    @JsonProperty("orderId")
    private Long orderId;
    @JsonProperty("orderLineId")
    private Integer orderLineId;
    @JsonProperty("stockId")
    private Integer stockId;
    @JsonProperty("StockName")
    private String StockName;
    @JsonProperty("StockCapacity")
    private Integer StockCapacity;
    @JsonProperty("customerName")
    private String customerName;
    @JsonProperty("customerId")
    private Integer customerId;
    @JsonProperty("deliveryAddress")
    private String deliveryAddress;
    @JsonProperty("packedWeight")
    private Integer packedWeight;
    @JsonProperty("orderDate")
    private Date orderDate;
    @JsonProperty("deliveryDate")
    private Date deliveryDate;
}
