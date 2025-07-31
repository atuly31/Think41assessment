package com.atul.apiendpoints.Service;

import com.atul.apiendpoints.Entity.Department;
import com.atul.apiendpoints.Entity.Products;
import com.atul.apiendpoints.Repository.DepartmentRepository;
import com.atul.apiendpoints.Repository.ProductRepository;
import com.atul.apiendpoints.exception.ResourceNotFoundExpection;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;
    @Autowired
    private ProductRepository productRepository;

    public List<Department> getAllDepartment() {
        return departmentRepository.findAll();
    }
    public Department getDepartmentById(Integer id) {
        return departmentRepository.findById(id)
                .orElseThrow(
                        () -> new ResourceNotFoundExpection("Department with id: " + id + " not found!"));

    }
    public List<Products> getProductsByDepartmentId(Integer id) {
        Department department = getDepartmentById(id);
        return productRepository.findByDepartment(department);

    }
}
