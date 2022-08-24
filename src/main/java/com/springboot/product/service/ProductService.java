package com.springboot.product.service;

import com.springboot.product.entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> getAllProduct();
    Product getProductById(Long id);
    Product addProduct(Product product);
    Product updateProduct(Long id, Product product);
    Product deleteProductById(Long id);
}
