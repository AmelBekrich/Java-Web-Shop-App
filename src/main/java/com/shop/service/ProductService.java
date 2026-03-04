package com.shop.service;

import com.shop.Product;
import com.shop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    public void saveProduct(Product product) {
        productRepository.save(product);
    }

    public Product getProductsById(Long id) {
        return productRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Wrong id! " +id));
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }

}
