package com.neo.spring_boot_elasticsearch.controller;

import com.neo.spring_boot_elasticsearch.models.Product;
import com.neo.spring_boot_elasticsearch.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {


    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/findByProductName/{name}")
    public List<Product> findByProductName(@RequestParam String name)
    {
        return productService.findByProductName(name);

    }
}
