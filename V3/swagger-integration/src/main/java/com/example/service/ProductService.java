package com.example.service;

import com.example.entity.Product;

import java.util.List;

public interface ProductService {

    Product createProduct(Product product);
    List<Product> getAllProducts();
    Product getProductByProductId(String productId);
}
