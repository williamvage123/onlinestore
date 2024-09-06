package com.example.onlinestore.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
public class Product{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;

    private Double price;

    private Integer stockQuantity;

}