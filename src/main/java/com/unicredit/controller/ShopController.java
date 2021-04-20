package com.unicredit.controller;

import com.unicredit.entity.Product;
import com.unicredit.entity.dto.SaveProductDTO;
import com.unicredit.serive.ProductService;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ShopController {

    private ProductService productService;
    private DozerBeanMapper mapper;

    @PostMapping
    public @ResponseBody Product saveProduct(@RequestBody SaveProductDTO product) {

        return productService.insertProduct(mapper.map(product, Product.class));
    }

    @GetMapping
    public @ResponseBody
    List<Product> getAllProducts () {
        return productService.getAllProducts();
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
