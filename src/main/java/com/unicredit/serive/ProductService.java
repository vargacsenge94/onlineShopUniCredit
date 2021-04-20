package com.unicredit.serive;

import com.unicredit.entity.Product;
import com.unicredit.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private ProductRepository productRepository;

    public Product insertProduct(Product product) {
        return productRepository.save(product);
    }
    public List<Product> getAllProducts () {
        return productRepository.findAll();
    }
    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
}
