package com.example.javapackageversion1.service;

import com.example.javapackageversion1.entity.Product;

import java.util.List;

public interface ProductService {

    public List<Product> getProducts();
    public Product AddProduct(Product product);
    public Product deleteProduct(int id );
    public Product updateProduct(int id, Product product);
}
