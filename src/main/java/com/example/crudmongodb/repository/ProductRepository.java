package com.example.crudmongodb.repository;

import com.example.crudmongodb.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {
    
    List<Product> findByCategory(String category);
    
    List<Product> findByNameContainingIgnoreCase(String name);
}
