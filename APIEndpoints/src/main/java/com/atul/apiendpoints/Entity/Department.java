package com.atul.apiendpoints.Entity;

import jakarta.persistence.*;
import jdk.jfr.Enabled;
import lombok.Data;

@Entity
@Table(name = "departments")
@Data
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    String name;
}
