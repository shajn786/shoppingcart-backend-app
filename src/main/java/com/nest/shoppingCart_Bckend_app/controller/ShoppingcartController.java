package com.nest.shoppingCart_Bckend_app.controller;


import com.nest.shoppingCart_Bckend_app.dao.ProductDao;
import com.nest.shoppingCart_Bckend_app.model.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShoppingcartController {

     @Autowired
     private ProductDao dao;

    @GetMapping("/viewall")
    public String Viewall()
    {
        return "viewall";
    }


    @PostMapping(path="/add",consumes = "application/json", produces = "application/json")
    public String AddProduct(@RequestBody Products p)
    {
        System.out.println(p.getPname());
        dao.save(p);
        return "added";
    }

}
