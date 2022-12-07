package com.nest.shoppingCart_Bckend_app.dao;

import com.nest.shoppingCart_Bckend_app.model.Products;
import org.springframework.data.repository.CrudRepository;

public interface ProductDao extends CrudRepository<Products,Integer> {
}
