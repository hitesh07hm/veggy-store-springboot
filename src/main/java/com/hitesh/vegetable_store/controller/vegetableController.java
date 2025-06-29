package com.hitesh.vegetable_store.controller;

import com.hitesh.vegetable_store.entity.Vegetable;
import com.hitesh.vegetable_store.repository.VegetableRepository;
import com.hitesh.vegetable_store.service.VegetableService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/vegetable")
@RequiredArgsConstructor
@Slf4j

public class vegetableController {

    private final VegetableService vegetableService;

    @GetMapping("/all-vegetables")
    public ResponseEntity<List<Vegetable>> getAllVegetables(){
        List<Vegetable> vegetables = vegetableService.getAllVegetables();
        return new ResponseEntity<>(vegetables, HttpStatus.OK);
    }

    @GetMapping("/vegetable-by-supplierId/{supplierId}")
    public ResponseEntity<List<Vegetable>> getVegetablesBySupplier(@PathVariable Long supplierId ){
        List<Vegetable> vegetables = vegetableService.getVegetablesBySupplier(supplierId);
        return new ResponseEntity<>(vegetables, HttpStatus.OK);
    }
}
