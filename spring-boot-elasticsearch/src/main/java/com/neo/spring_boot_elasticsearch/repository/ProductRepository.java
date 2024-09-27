package com.neo.spring_boot_elasticsearch.repository;

import com.neo.spring_boot_elasticsearch.models.Product;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface ProductRepository extends ElasticsearchRepository<Product,Integer> {

    @Query("{\"wildcard\": {\"name\": \"*?0*\"}}")
    List<Product> findByNameWildcard(String name);
}
