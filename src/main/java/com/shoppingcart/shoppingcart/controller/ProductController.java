package com.shoppingcart.shoppingcart.controller;

import com.shoppingcart.shoppingcart.model.Product;
import com.shoppingcart.shoppingcart.service.ProductService;
import com.shoppingcart.shoppingcart.service.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {
    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService){
        this.productService=productService;
    }

    public ResponseEntity<?> isExist(@PathVariable String name) {
        return new ResponseEntity<>(productService.isExist(name), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Product> createProduct(@Valid @RequestBody Product product){

        return null;
    }
}
