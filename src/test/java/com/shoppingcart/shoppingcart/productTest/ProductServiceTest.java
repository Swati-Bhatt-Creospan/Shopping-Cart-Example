package com.shoppingcart.shoppingcart.productTest;

import com.shoppingcart.shoppingcart.model.Product;
import com.shoppingcart.shoppingcart.service.ProductService;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ProductServiceTest {
    @Autowired
    private ProductService productService;

    private Product product= new Product("Adidas","Shirt",20.5,1);


//    @Test
    public void testProductServiceNotNull(){
        Assert.assertNotNull(productService);
    }
//    @Test
    public void testCreateProduct(){
        Product returnProduct=productService.createProduct(product);
        Assert.assertNotNull(returnProduct);
        Assert.assertTrue(returnProduct.getId()>0);
    }

//    @Test
    public void testFindById(){
        Product findProduct = productService.findById(product.getId());
        Assert.assertNotNull(findProduct);
    }

//    @Test
    public void testFindAllProducts(){
        List<Product> productList = productService.findAllProducts();
        Assert.assertNotNull(productList);
        Assert.assertTrue(productList.size()>0);
    }

//    @Test
    public void testFindAllByName(){
        List<Product> productList = productService.findAllByName(product.getName());
        Assert.assertNotNull(productList);
        Assert.assertTrue(productList.size()>0);
    }

//    @Test
    public void testFindAllByTypeAndName(){
        List<Product> productList = productService.findAllByTypeAndName(product.getType(),product.getName());
        Assert.assertNotNull(productList);
        Assert.assertTrue(productList.size()>0);
    }

//    @Test
    public void testUpdateProduct(){
//        Product newProduct=new Product("Puma","Shirt",25.5,1);
        product.setName("Puma");
        product=productService.updateProduct(product);
        Assert.assertNotNull(product);
        Assert.assertEquals(product.getName(),"Puma");
    }

//    @Test
    public void testDeleteProduct(){
        Product deleteProduct=productService.findById(product.getId());
        Assert.assertNotNull(deleteProduct);
        productService.deleteProduct(deleteProduct.getId());
        Product deletedProduct=productService.findById(product.getId());
        Assert.assertNull(deletedProduct);
    }

    @Test
    public void runTest(){
        testProductServiceNotNull();
        testCreateProduct();
        testFindById();
        testFindAllProducts();
        testFindAllByName();
        testFindAllByTypeAndName();
        testUpdateProduct();
        testDeleteProduct();
    }
}
