package com.neo.spring_boot_elasticsearch.service;

import com.neo.spring_boot_elasticsearch.models.Product;
import com.neo.spring_boot_elasticsearch.repository.ProductRepository;

import java.util.List;

public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> findByProductName(String name)
    {
        return productRepository.findByNameWildcard(name);
    }
}
