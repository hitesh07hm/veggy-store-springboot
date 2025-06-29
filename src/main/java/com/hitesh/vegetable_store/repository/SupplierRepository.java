package com.hitesh.vegetable_store.repository;

import com.hitesh.vegetable_store.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {
}
