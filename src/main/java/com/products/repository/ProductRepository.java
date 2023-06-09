package com.products.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.products.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
    
}
