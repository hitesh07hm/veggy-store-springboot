package com.hitesh.vegetable_store.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "customers")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Customer {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;


    private String address;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, fetch= FetchType.LAZY)
    @JsonManagedReference
    private List<Order> orders = new ArrayList<>();


}
