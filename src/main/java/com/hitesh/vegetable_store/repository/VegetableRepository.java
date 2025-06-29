package com.hitesh.vegetable_store.repository;

import com.hitesh.vegetable_store.entity.Vegetable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;



public interface VegetableRepository extends JpaRepository<Vegetable, Long> {

    @Query("SELECT v FROM Vegetable v JOIN v.suppliers s WHERE s.id = :supplierId")
    List<Vegetable> findByVegetableSupplierId(@Param("supplierId") Long supplierId);
}
