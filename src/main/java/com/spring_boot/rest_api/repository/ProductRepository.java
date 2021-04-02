package com.spring_boot.rest_api.repository;

import com.spring_boot.rest_api.models.Product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
  
}
