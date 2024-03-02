package com.example.orderwarehouse.service;

import com.example.orderwarehouse.data.dto.OrderDTO;
import com.example.orderwarehouse.data.resp.CreationResponse;

import java.util.List;

public interface OrderService {
    /**
     * Returns the list of all orders
     * @return list of object
     */
    List<OrderDTO> getOrders();

    /**
     * @param req a request object
     * @return a creation response indicator
     */
    CreationResponse saveOrder(OrderDTO req);
}
