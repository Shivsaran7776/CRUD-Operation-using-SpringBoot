package com.example.javapackageversion1.controller;

import com.example.javapackageversion1.entity.Product;
import com.example.javapackageversion1.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@CrossOrigin
public class ProductController {
    @Autowired
    private ProductService productService;
    @GetMapping("/all")
    public List<Product> getProducts(){
        return productService.getProducts();
    }

    @PostMapping("/insert")
    public Product insert(@RequestBody Product product){
        return productService.AddProduct(product);
    }

    @PutMapping("/update/{id}")
    public Product update(@PathVariable int id, @RequestBody Product product){
        return productService.updateProduct(id,product);
    }

    @DeleteMapping("/delete/{id}")
    public Product delete(@PathVariable int id){
        return productService.deleteProduct(id);
    }
}
