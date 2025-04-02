package com.example.crudmongodb.service;

import com.example.crudmongodb.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    
    List<Product> findAllProducts();
    
    Optional<Product> findProductById(String id);
    
    Product saveProduct(Product product);
    
    Product updateProduct(String id, Product product);
    
    void deleteProduct(String id);
    
    List<Product> findProductsByCategory(String category);
    
    List<Product> searchProducts(String name);
}
