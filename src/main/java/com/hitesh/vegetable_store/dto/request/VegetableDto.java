package com.hitesh.vegetable_store.dto.request;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VegetableDto {

    private Long vegetableId;
    private String name;
    private double price;
    private long stockQuantity;
    private List<SupplierDto> suppliers;

}
