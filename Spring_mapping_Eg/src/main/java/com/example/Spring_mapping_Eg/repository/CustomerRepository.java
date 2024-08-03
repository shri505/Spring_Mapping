package com.example.Spring_mapping_Eg.repository;

import com.example.Spring_mapping_Eg.dto.OrderResponse;
import com.example.Spring_mapping_Eg.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {

    @Query("SELECT new com.example.Spring_mapping_Eg.dto.OrderResponse(c.name , p.productName) FROM Customer c JOIN c.products p")
    public List<OrderResponse> getJoinInformation();
}