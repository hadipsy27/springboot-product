package com.springboot.finalexamp.controller;


import com.springboot.finalexamp.entity.Product;
import com.springboot.finalexamp.handler.ResponseHandler;
import com.springboot.finalexamp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping
    public List<Product> getAllProduct(){
        return productService.getAllProduct();

    }

    @GetMapping("/{id}")
    public Optional<Product> getById(@PathVariable("id") Long id){
        return productService.getProductById(id);
    }

    @PostMapping
    public Product create(@RequestBody Product product){
        return productService.addProduct(product);
    }

    @DeleteMapping("/{id}")
    public Optional<Product> delete(@PathVariable("id") Long id){
        return productService.deleteProductById(id);
    }
}
