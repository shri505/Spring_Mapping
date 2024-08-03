package com.example.Spring_mapping_Eg.dto;

import com.example.Spring_mapping_Eg.entity.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderRequest {
    private Customer customer;


    public Customer getCustomer() {
        // Custom logic here
        return customer;
    }
}
