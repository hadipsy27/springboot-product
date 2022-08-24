package com.springboot.product.controller;


import com.springboot.product.entity.Product;
import com.springboot.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
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
    public Product getById(@PathVariable("id") Long id){
        return productService.getProductById(id);
    }

    @PostMapping
    public Product create(@RequestBody Product product){
        return productService.addProduct(product);
    }

    @PutMapping("/{id}")
    public Product update(@PathVariable("id") Long id, @RequestBody Product product){
        Product productById = productService.getProductById(id);
        return productService.updateProduct(productById.getId(), product);
    }

    @DeleteMapping("/{id}")
    public Product delete(@PathVariable("id") Long id){
        return productService.deleteProductById(id);
    }
}
