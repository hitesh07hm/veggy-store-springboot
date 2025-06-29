package com.hitesh.vegetable_store.service;

import com.hitesh.vegetable_store.dto.request.OrderDto;
import com.hitesh.vegetable_store.entity.Order;
import com.hitesh.vegetable_store.entity.OrderItem;

import java.util.List;

public interface OrderService {
//    List<Order> getAllOrders(Long customerId);
    Order createOrder(OrderDto orderDto);

}
