package com.sheryians.major.service;

import com.sheryians.major.model.Product;
import com.sheryians.major.repository.ProductRepository;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;
    public List<Product> getProduct(){ return productRepository.findAll();}
}
