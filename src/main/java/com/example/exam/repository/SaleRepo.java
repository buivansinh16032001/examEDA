package com.example.exam.repository;

import com.example.exam.entity.ProductEntity;
import com.example.exam.entity.SaleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepo extends JpaRepository<SaleEntity, Integer> {
}
