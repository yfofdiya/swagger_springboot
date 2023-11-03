package com.example.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product_details")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    private String productId;
    private String productName;
}
