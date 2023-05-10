package com.products.service.impl;

import org.springframework.stereotype.Service;

import com.products.entity.Product;
import com.products.payload.ProductDto;
import com.products.repository.ProductRepository;
import com.products.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{

    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    @Override
    public ProductDto createProduct(ProductDto productDto) {

        Product product = matToEntity(productDto);

        Product newProduct = productRepository.save(product);

        return mapToDto(newProduct);
    }

    private Product matToEntity(ProductDto productDto){
        
        Product product = new Product();

        product.setId(productDto.getId());
        product.setName(productDto.getName());
        product.setPrice(productDto.getPrice());

        return product;
    }

    private ProductDto mapToDto(Product product){

        ProductDto productDto = new ProductDto();

        productDto.setId(product.getId());
        productDto.setName(product.getName());
        productDto.setPrice(product.getPrice());

        return productDto;
    }
    
}
