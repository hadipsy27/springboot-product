package com.springboot.finalexamp.service.impl;

import com.springboot.finalexamp.entity.Product;
import com.springboot.finalexamp.repository.ProductRepository;
import com.springboot.finalexamp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Override
    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(Long id) {
        return productRepository.findById(id).orElseThrow(() -> {
            throw new Error("Product not found");
        });
    }

    @Override
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product updateProduct(Long id, Product product) {
        Product productById = this.getProductById(id);
//        productById.setId(product.getId());
        productById.setName(product.getName());
        productById.setPrice(product.getPrice());
        product.setName(product.getName());
        return productRepository.save(productById);
    }

    @Override
    public Product deleteProductById(Long id) {
        Product product = this.getProductById(id);
        productRepository.deleteById(id);
        return product;
    }
}
