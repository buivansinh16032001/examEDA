package com.example.exam.service;

import com.example.exam.entity.ProductEntity;
import com.example.exam.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    ProductRepo productRepo;

    @Override
    public List<ProductEntity> getAllProduct() {
        return productRepo.findAll();
    }
}
