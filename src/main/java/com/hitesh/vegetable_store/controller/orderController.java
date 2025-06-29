package com.hitesh.vegetable_store.controller;


import com.hitesh.vegetable_store.dto.request.OrderDto;
import com.hitesh.vegetable_store.entity.Order;
import com.hitesh.vegetable_store.service.OrderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
@Slf4j
public class orderController {
    private final OrderService orderService;

    @PostMapping("/create-order")
    public ResponseEntity<Order> createOrder(@RequestBody OrderDto orderDto){
        Order order = orderService.createOrder(orderDto);
        return new ResponseEntity<>(order, HttpStatus.CREATED);
    }

}
