package com.example.foodhubapplicationspring.repository;

import com.example.foodhubapplicationspring.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findAllByCategoryId(int id);

}
