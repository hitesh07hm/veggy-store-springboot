package com.hitesh.vegetable_store.repository;

import com.hitesh.vegetable_store.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
