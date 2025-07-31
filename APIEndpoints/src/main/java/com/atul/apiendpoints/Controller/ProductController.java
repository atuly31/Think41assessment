package com.atul.apiendpoints.Controller;

import com.atul.apiendpoints.Entity.Products;
import com.atul.apiendpoints.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("api/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public ResponseEntity<List<Products>> getAllProducts(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size
    ) {
       List <Products> products = productService.getAllProducts(page, size);
       return ResponseEntity.ok(products);
    }
    @GetMapping({"/id"})
    public ResponseEntity<Products> getAllProductsById(Long id){
        Products products = productService.getProductsById(id);
        return ResponseEntity.ok(products);
    }



}
