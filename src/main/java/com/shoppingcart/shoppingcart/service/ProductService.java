package com.shoppingcart.shoppingcart.service;

import com.shoppingcart.shoppingcart.model.Product;

import java.util.List;

public interface ProductService  {
    public Product createProduct(Product product);
    public Product findById(long id);
    public List<Product> findAllProducts();
    public List<Product> findAllByName(String name);
    public List<Product> findAllByTypeAndName(String type, String name);
    public Product updateProduct(Product product);
    public void deleteProduct(long id);
    public boolean isExist(String type, String name);
}
