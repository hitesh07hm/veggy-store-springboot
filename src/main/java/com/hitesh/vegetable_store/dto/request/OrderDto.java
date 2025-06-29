package com.hitesh.vegetable_store.dto.request;

import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDto {
    private Long customerId;
    private List<OrderItemDto> orderItems;
}
