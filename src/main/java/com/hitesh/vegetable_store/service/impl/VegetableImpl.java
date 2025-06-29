package com.hitesh.vegetable_store.service.impl;

import com.hitesh.vegetable_store.entity.Vegetable;
import com.hitesh.vegetable_store.repository.VegetableRepository;
import com.hitesh.vegetable_store.service.VegetableService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
@Slf4j

public class VegetableImpl implements VegetableService {

    private final VegetableRepository vegetableRepository;

    @Override
    public List<Vegetable> getAllVegetables() {
        return vegetableRepository.findAll();
    }

    @Override
    public List<Vegetable> getVegetablesBySupplier(Long supplierId) {

        return vegetableRepository.findByVegetableSupplierId(supplierId);

    }


}
