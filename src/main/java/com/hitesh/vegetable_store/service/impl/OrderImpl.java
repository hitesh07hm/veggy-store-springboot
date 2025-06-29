package com.hitesh.vegetable_store.service.impl;


import com.hitesh.vegetable_store.dto.request.OrderDto;
import com.hitesh.vegetable_store.dto.request.OrderItemDto;
import com.hitesh.vegetable_store.entity.Customer;
import com.hitesh.vegetable_store.entity.Order;
import com.hitesh.vegetable_store.entity.OrderItem;
import com.hitesh.vegetable_store.entity.Vegetable;
import com.hitesh.vegetable_store.repository.CustomerRepository;
import com.hitesh.vegetable_store.repository.OrderItemRepository;
import com.hitesh.vegetable_store.repository.OrderRepository;
import com.hitesh.vegetable_store.repository.VegetableRepository;
import com.hitesh.vegetable_store.service.OrderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class OrderImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private VegetableRepository vegetableRepository;

    @Autowired
    private OrderItemRepository orderItemRepository;



//    @Override
    public Order createOrder(OrderDto orderDto) {
        double orderTotalPrice =0.0;

        Customer customer= customerRepository.findById(orderDto.getCustomerId())
                .orElseThrow(( )-> new RuntimeException("customer does not exists"));

        Order order =new Order();
        order.setOrderDate(LocalDate.now());
        order.setCustomer(customer);

        order=orderRepository.save(order);

        List<OrderItem> orderItemList =new ArrayList<>();
        for(OrderItemDto itemDto : orderDto.getOrderItems()){
            Vegetable vegetable =vegetableRepository.findById(itemDto.getVegetableId())
                    .orElseThrow(() -> new RuntimeException("Vegetable not found") );


            OrderItem orderItem= new OrderItem();
            orderItem.setOrder(order);
            orderItem.setVegetable(vegetable);
            orderItem.setQuantity(itemDto.getQuantity());
            orderItem.setTotalPrice(itemDto.getQuantity() * vegetable.getPrice());

            orderItemList.add(orderItem);
            orderTotalPrice += orderItem.getTotalPrice();
        }

        orderItemRepository.saveAll(orderItemList);
        order.setOrderItems(orderItemList);

        return orderRepository.save(order);
    }


}
