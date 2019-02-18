package com.shoppingcart.shoppingcart.repository;

import com.shoppingcart.shoppingcart.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
    public List<Product> findAllByName(String name);
    public List<Product> findAllByTypeAndName(String type, String name);
 }
