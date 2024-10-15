package com.example.crud.service;

import com.example.crud.model.Product;
import com.example.crud.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    /**
     *
     */
    @Autowired
    private ProductRepository productRepository;

    // Create or Update Product
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    // Read Product by ID
    public Optional<Product> getProductById(Integer id) {
        return productRepository.findById(id);
    }

    // Get all Products
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    // Delete Product by ID
    public void deleteProduct(Integer id) {
        productRepository.deleteById(id);
    }
}
