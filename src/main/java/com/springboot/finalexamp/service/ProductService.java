package com.springboot.finalexamp.service;

import com.springboot.finalexamp.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    List<Product> getAllProduct();
    Optional<Product> getProductById(Long id);
    Product addProduct(Product product);
    Optional<Product> deleteProductById(Long id);
}
