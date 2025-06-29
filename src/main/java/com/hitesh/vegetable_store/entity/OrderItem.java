package com.hitesh.vegetable_store.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "order_items")
@Setter
@Getter
public class OrderItem {

//    Fields: id, order, vegetable, quantity, totalPrice
//    Many-to-One relationship with Order
//    Many-to-One relationship with Vegetable

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(nullable = false)
    private long quantity;

    @Column(name = "total_price", nullable = false)
    private double totalPrice;

    @ManyToOne
    @JoinColumn(name = "order_id", nullable = false)
    @JsonBackReference
    private Order order;

    @ManyToOne
    @JoinColumn(name = "vegetable_id", nullable = false)
    @JsonBackReference
    private Vegetable vegetable;


}
