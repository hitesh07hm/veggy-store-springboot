package com.hitesh.vegetable_store.repository;

import com.hitesh.vegetable_store.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {

    List<Order> findByCustomerId(Long customerId);

    @Query("SELECT SUM(oi.totalPrice) FROM OrderItem oi WHERE oi.vegetable.id = :vegetableId")
    Double calculateTotalSalesByVegetableId(@Param("vegetableId") Long vegetableId);
}
