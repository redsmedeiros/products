package com.products.payload;

import lombok.Data;

@Data
public class ProductDto {
    private long id;
    private String name;
    private double price;
}
