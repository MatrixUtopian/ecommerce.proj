package com.example.ecommerce.proj.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int stockQuantity;
    private BigDecimal price;
    private Date releaseDate;
    private Boolean productAvailable;
    private String name;
    private String description;
    private String brand;
    private String category;

    private String imageName;
    private String imageType;

    @Lob
    private byte[] imageDate;

}
