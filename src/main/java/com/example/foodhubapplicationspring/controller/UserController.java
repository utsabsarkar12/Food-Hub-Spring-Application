package com.example.foodhubapplicationspring.controller;

import com.example.foodhubapplicationspring.grobal_data.GrobalData;
import com.example.foodhubapplicationspring.service.CategoryService;
import com.example.foodhubapplicationspring.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class UserController {
    @Autowired
    private CategoryService categoryService;
    @Autowired
    private ProductService productService;

    @GetMapping( "/shop")
    public String shop(Model model){
        model.addAttribute("categories", categoryService.getAllCategory());
        model.addAttribute("products", productService.getAllProduct());
        model.addAttribute("cartCount", GrobalData.cart.size());
        return "shop";
    }
    @GetMapping( "/shop/category/{id}")
    public String shopByCategory(Model model, @PathVariable int id) {
        model.addAttribute("categories", categoryService.getAllCategory());
        model.addAttribute("products", productService.getAllProductByCategoryId(id));
        model.addAttribute("cartCount", GrobalData.cart.size());
        return "shop";
    }
    @GetMapping( "/shop/viewproduct/{id}")
    public String viewProduct(Model model, @PathVariable int id) {
        model.addAttribute("product", productService.getProductById(id).get());
        model.addAttribute("cartCount", GrobalData.cart.size());
        return "viewProduct";
    }




}
