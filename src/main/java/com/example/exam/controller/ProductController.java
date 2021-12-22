package com.example.exam.controller;

import com.example.exam.entity.ProductEntity;
import com.example.exam.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("Product")
    public String Product(Model model){
        List<ProductEntity> products = productService.getAllProduct();
        model.addAttribute("products", products);
        return "Product";
    }
}
