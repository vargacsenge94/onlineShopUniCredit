package com.unicredit.controller;

import com.unicredit.model.entity.Product;
import com.unicredit.model.dto.SaveProductDTO;
import com.unicredit.service.ProductService;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    private ProductService productService;
    private DozerBeanMapper mapper;

    @GetMapping("/id")
    public Product getProduct(@PathVariable Long id) {
        return productService.getProduct(id);
    }

    @GetMapping
    public List<Product> getProducts() {
        return productService.getAllProducts();
    }

    @PostMapping
    public Product addProduct(@RequestBody SaveProductDTO product) {
        //todo add validations for product
        return productService.insertProduct(mapper.map(product, Product.class));
    }


    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @Autowired
    public void setMapper(DozerBeanMapper mapper) {
        this.mapper = mapper;
    }
}
