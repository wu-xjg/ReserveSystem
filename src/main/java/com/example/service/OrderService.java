package com.example.service;

import com.example.entity.Order;
import com.example.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    private final OrderMapper orderMapper;

    @Autowired
    public OrderService(OrderMapper orderMapper) {
        this.orderMapper = orderMapper;
    }

    public List<Order> getAllOrders() {
        return orderMapper.getAllOrders();
    }

    public Order getOrderByIds(String oId, String uId, String jId, String hId) {
        return orderMapper.getOrderByIds(oId, uId, jId, hId);
    }

    public void saveOrder(Order order) {
        orderMapper.insertOrder(order);
    }

    public void deleteOrder(String oId, String uId, String jId, String hId) {
        orderMapper.deleteOrderByIds(oId, uId, jId, hId);
    }

}
