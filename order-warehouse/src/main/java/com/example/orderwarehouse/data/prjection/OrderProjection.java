package com.example.orderwarehouse.data.prjection;

public interface OrderProjection {
    Integer getOrderId();
    Integer getOrderLineId();
    String getCustomerName();
    String getDeliveryAddress();
}
