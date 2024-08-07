package com.example.orderwarehouse.controller;

import com.example.orderwarehouse.data.dto.OrderDTO;
import com.example.orderwarehouse.data.prjection.OrderProjection;
import com.example.orderwarehouse.data.resp.CreationResponse;
import com.example.orderwarehouse.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/order")
public class OrderController {
    private final OrderService orderService;


    public OrderController(
            @Autowired OrderService orderService
    ) {
        this.orderService = orderService;
    }

    @GetMapping
    List<OrderDTO> getOrders() {return orderService.getOrders();}

    @PostMapping("/new_order")
    CreationResponse saveNewOrder(@RequestBody OrderDTO req) {
        return orderService.saveOrder(req);
    }

    @GetMapping("/projection")
    ResponseEntity<List<OrderProjection>> getOrdersProjection() {
        return ResponseEntity.ok(orderService.getOrdersProjections());
    }



}
