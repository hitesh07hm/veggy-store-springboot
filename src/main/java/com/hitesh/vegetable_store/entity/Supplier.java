package com.hitesh.vegetable_store.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
@Table(name = "suppliers")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Supplier {
//    Fields: id, name, contact
//    Many-to-Many relationship with Vegetables

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column
    private String contact;

    @ManyToMany(mappedBy = "suppliers", fetch = FetchType.LAZY)
    @JsonBackReference
    private Set<Vegetable> vegetables = new HashSet<>();




}

