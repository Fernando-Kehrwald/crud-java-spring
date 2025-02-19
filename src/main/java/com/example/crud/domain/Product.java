package com.example.crud.domain;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Table(name = "product")
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String name;
    private BigDecimal price;
    private Boolean active;

    public Product() {
    }

    public Product(String id, String name, BigDecimal price, Boolean active) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.active = active;
    }

    public Product(ProductDTO productDTO){
        this.id = productDTO.id();
        this.name = productDTO.name();
        this.price = productDTO.price();
        this.active = true;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Boolean isActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
