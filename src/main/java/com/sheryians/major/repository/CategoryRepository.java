package com.sheryians.major.repository;

import com.sheryians.major.model.Category;

import com.springframework.data.jpa.repository.JpaResitory;
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
