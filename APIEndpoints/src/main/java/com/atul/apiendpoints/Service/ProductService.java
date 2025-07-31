package com.atul.apiendpoints.Service;

import com.atul.apiendpoints.Entity.Products;
import com.atul.apiendpoints.Repository.ProductRepository;
import com.atul.apiendpoints.exception.ResourceNotFoundExpection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Products> getAllProducts(int page, int size ) {
        Pageable pageable = PageRequest.of(page, size);
        return productRepository.findAll(pageable).getContent();
    }

    public Products getProductsById(Long id) {
        return productRepository.findById(id)
                .orElseThrow(()->new
                        ResourceNotFoundExpection("Product Not Found with id: " + id));

    }
}
