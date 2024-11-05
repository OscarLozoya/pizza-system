package com.rand.pizzasystem.web.controller;

import com.rand.pizzasystem.persistence.entity.OrderEntity;
import com.rand.pizzasystem.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/api/order")
public class OrderController {
    @Autowired
    OrderService orderService;

    @GetMapping("/all")
    public ResponseEntity<List<OrderEntity>> getAllOrders(){
        return ResponseEntity.ok(orderService.getAllOrders());
    }
}
