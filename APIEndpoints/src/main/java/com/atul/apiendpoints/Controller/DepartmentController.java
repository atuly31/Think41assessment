package com.atul.apiendpoints.Controller;

import com.atul.apiendpoints.Entity.Department;
import com.atul.apiendpoints.Entity.Products;
import com.atul.apiendpoints.Service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/department")
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;
    @GetMapping
    public ResponseEntity<List<Department>> getAllDepartments() {
        return ResponseEntity.ok(departmentService.getAllDepartment());
    }
    @GetMapping({"/id"})
    public ResponseEntity<Department> getDepartmentsById(@PathVariable Long id) {
        return ResponseEntity.ok(departmentService.getDepartmentById(id));
    }

    @GetMapping("/{id}/products")
    public ResponseEntity<List<Products>> getProductByDepartmentsId(@PathVariable Long id) {
        return ResponseEntity.ok(departmentService.getProductsByDepartmentId(id));
    }



}
