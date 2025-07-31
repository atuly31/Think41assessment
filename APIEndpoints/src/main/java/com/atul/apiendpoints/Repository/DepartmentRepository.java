package com.atul.apiendpoints.Repository;

import com.atul.apiendpoints.Entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Integer> {
}
