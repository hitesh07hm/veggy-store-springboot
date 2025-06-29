package com.hitesh.vegetable_store.dto.request;


import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderItemDto {
    private Long vegetableId;
    private Long quantity;
}
