package com.rand.pizzasystem.service;

import com.rand.pizzasystem.persistence.entity.OrderEntity;
import com.rand.pizzasystem.persistence.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public List<OrderEntity> getAllOrders(){
        return orderRepository.findAll();
    }
}
