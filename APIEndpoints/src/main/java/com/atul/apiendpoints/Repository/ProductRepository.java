package com.atul.apiendpoints.Repository;

import com.atul.apiendpoints.Entity.Department;
import com.atul.apiendpoints.Entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Products, Long> {
    List<Products> findByDepartment(Department department);

}
