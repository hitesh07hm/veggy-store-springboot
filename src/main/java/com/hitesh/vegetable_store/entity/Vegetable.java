package com.hitesh.vegetable_store.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
@Table(name = "vegetables")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Vegetable {

//    Fields: id, name, price, stockQuantity
//    Many-to-Many relationship with Suppliers

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(name = "price", nullable = false)
    private double price;

    @Column(name = "stock_qty",nullable = false)
    private long stockQuantity;


    @ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    @JoinTable(
            name = "vegetable_suppliers",
            joinColumns = @JoinColumn(name = "vegetable_id"),
            inverseJoinColumns = @JoinColumn(name = "supplier_id")
    )
    @JsonManagedReference
    private Set<Supplier> suppliers = new HashSet<>();

}
