package com.banjaravivahapis.banjaravivahspringapis.repository;

import com.banjaravivahapis.banjaravivahspringapis.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    Product findByName(String name);
}
