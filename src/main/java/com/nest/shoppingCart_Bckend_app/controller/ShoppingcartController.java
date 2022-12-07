package com.nest.shoppingCart_Bckend_app.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShoppingcartController {



    @PostMapping("/add")
    public String AddProduct()
    {
        return "added";
    }

}
