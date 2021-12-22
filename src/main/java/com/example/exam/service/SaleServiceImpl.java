package com.example.exam.service;

import com.example.exam.entity.SaleEntity;
import com.example.exam.repository.SaleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleServiceImpl implements SaleService {

    @Autowired
    SaleRepo saleRepo;

    @Override
    public List<SaleEntity> getAllSale() {
        return saleRepo.findAll();
    }
}
