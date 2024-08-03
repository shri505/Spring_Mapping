package com.example.Spring_mapping_Eg.repository;

import com.example.Spring_mapping_Eg.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}