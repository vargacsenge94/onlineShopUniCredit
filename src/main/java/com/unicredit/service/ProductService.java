package com.unicredit.service;

import com.unicredit.model.entity.Product;
import com.unicredit.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private ProductRepository productRepository;

    public Product insertProduct(Product product) {
        return productRepository.save(product);
    }

    public List<Product> getAllProducts () {
        return productRepository.findAll();
    }

    public Product getProduct(Long id) {
        Optional<Product> productOptional =productRepository.findById(id);
        // todo define some other exception instead of this general one
        return productOptional.orElseThrow(() -> new RuntimeException("Product not found"));
    }
    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
}
