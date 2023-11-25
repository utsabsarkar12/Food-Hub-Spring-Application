package com.example.foodhubapplicationspring.repository;

import com.example.foodhubapplicationspring.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
