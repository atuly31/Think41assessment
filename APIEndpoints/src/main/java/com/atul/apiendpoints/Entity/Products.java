package com.atul.apiendpoints.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Data
@Table(name = "products")
public class Products {
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "cost", precision = 10, scale = 5)
    private BigDecimal cost;

    @Column(name = "retail_price", precision = 10, scale = 2)
    private BigDecimal retailPrice;

    @Column(name = "category", length = 100)
    private String category;

    @Column(name = "name", length = 255)
    private String name;

    @Column(name = "brand", length = 255)
    private String brand;



    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "department_id")
    private Department department;

    @Column(name = "sku", length = 50)
    private String sku;

    @Column(name = "distribution_center_id")
    private Integer distributionCenterId;

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }



    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public Integer getDistributionCenterId() {
        return distributionCenterId;
    }

    public void setDistributionCenterId(Integer distributionCenterId) {
        this.distributionCenterId = distributionCenterId;
    }
}
