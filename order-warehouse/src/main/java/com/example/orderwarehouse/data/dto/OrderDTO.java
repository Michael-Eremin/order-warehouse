package com.example.orderwarehouse.data.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
@NoArgsConstructor
@Getter
@Setter
public class OrderDTO {
    @JsonProperty("orderId")
    private Long orderId;
    @JsonProperty("orderLineId")
    private Integer orderLineId;
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
