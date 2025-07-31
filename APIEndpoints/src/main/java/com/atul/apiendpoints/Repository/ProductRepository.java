package com.atul.apiendpoints.Repository;

import com.atul.apiendpoints.Entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Products, Long> {
}
