package com.hitesh.vegetable_store.repository;

import com.hitesh.vegetable_store.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
