package com.example.javapackageversion1.repo;

import com.example.javapackageversion1.entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepo extends MongoRepository<Product,Integer> {
}
