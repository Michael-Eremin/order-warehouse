package com.example.orderwarehouse.service;

import com.example.orderwarehouse.data.dto.OrderDTO;
import com.example.orderwarehouse.data.entity.OrderEntity;
import com.example.orderwarehouse.data.resp.CreationResponse;
import com.example.orderwarehouse.repo.crud.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;

    public OrderServiceImpl(
            @Autowired OrderRepository orderRepository
    ) {
        this.orderRepository = orderRepository;
    }

    @Override
    public List<OrderDTO> getOrders() {
        List<OrderEntity> loe = orderRepository.findAll();
        List<OrderDTO> lod = fromEntity(loe);
        return lod;
    }

    private List<OrderDTO> fromEntity(List<OrderEntity> loe) {
        List<OrderDTO> lod = loe.stream().map(oe -> {
            OrderDTO od = new OrderDTO();
            od.setOrderId(oe.getOrderId());
            od.setOrderLineId(oe.getOrderLineId());
            od.setCustomerName(oe.getCustomerName());
            od.setCustomerId(oe.getCustomerId());
            od.setDeliveryAddress(oe.getDeliveryAddress());
            od.setPackedWeight(oe.getPackedWeight());
            od.setOrderDate(oe.getOrderDate());
            od.setDeliveryDate(oe.getDeliveryDate());
            return od;
        }).toList();
        return lod;
        }

    @Override
    public CreationResponse saveOrder(OrderDTO req){
        OrderEntity loe = toEntity (req);
        orderRepository.save(loe);
        Date ts = new Date();
        String description = "New order created";
        CreationResponse creationResponse = new CreationResponse(ts, description);
        return creationResponse;
    }

    private OrderEntity toEntity (OrderDTO req) {
        OrderEntity oe = new OrderEntity();
        oe.setOrderId(req.getOrderId());
        oe.setOrderLineId(req.getOrderLineId());
        oe.setCustomerName(req.getCustomerName());
        oe.setCustomerId(req.getCustomerId());
        oe.setDeliveryAddress(req.getDeliveryAddress());
        oe.setPackedWeight(req.getPackedWeight());
        oe.setOrderDate(req.getOrderDate());
        oe.setDeliveryDate(req.getDeliveryDate());
//        oe.setStockId(req.getSto);
        return oe;
    }
}
