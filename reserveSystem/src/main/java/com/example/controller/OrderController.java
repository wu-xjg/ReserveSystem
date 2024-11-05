package com.example.controller;


import com.example.entity.Order;
import com.example.service.OrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/order")
@CrossOrigin(origins = "http://localhost:9528", maxAge = 3600)
public class OrderController {
    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }

    @GetMapping("/{oId}/{uId}/{jId}/{hId}")
    public Order getOrderByIds(@PathVariable String oId, @PathVariable String uId, @PathVariable String jId, @PathVariable String hId) {
        return orderService.getOrderByIds(oId, uId, jId, hId);
    }

    @PostMapping
    public void saveOrder(@RequestBody Order order) {
        orderService.saveOrder(order);
    }

    @DeleteMapping("/{oId}/{uId}/{jId}/{hId}")
    public void deleteOrder(@PathVariable String oId, @PathVariable String uId, @PathVariable String jId, @PathVariable String hId) {
        orderService.deleteOrder(oId, uId, jId, hId);
    }

}
