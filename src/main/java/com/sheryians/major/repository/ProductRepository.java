package com.sheryians.major.repository;
import com.sheryians.major.model.Product;

import com.springframework.data.jpa.repository.JpaResitory;
import java.util.List;
public interface ProductRepository entends JpaRepository <Product, Long> {
    List<Product> findAllByCategoryId_Id(int id);
}
