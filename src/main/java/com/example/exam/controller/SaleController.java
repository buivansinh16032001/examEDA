package com.example.exam.controller;

import com.example.exam.entity.ProductEntity;
import com.example.exam.entity.SaleEntity;
import com.example.exam.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class SaleController {

    @Autowired
    SaleService saleService;

    @GetMapping("Sale")
    public String Sale(Model model){
        List<SaleEntity> sales = saleService.getAllSale();
        model.addAttribute("sales", sales);
        return "Sale";
    }
}
