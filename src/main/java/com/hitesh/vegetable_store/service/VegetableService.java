package com.hitesh.vegetable_store.service;

import com.hitesh.vegetable_store.entity.Vegetable;

import java.util.List;

public interface VegetableService {
    List<Vegetable> getAllVegetables();
    List<Vegetable> getVegetablesBySupplier(Long supplierId);
}
