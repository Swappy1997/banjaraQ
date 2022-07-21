package com.banjaravivahapis.banjaravivahspringapis.controller;

import com.banjaravivahapis.banjaravivahspringapis.entity.Product;
import com.banjaravivahapis.banjaravivahspringapis.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product){
        return productService.saveProduct(product);
    }
    @PostMapping("/addProducts")
    public List<Product> addProduct(@RequestBody List<Product> products){
        return  productService.saveProducts(products);
    }
        @GetMapping("/products")
    public List<Product> findAllProduct(){
        return productService.getProducts();
    }
    @GetMapping("/productBy/{id}")
    public Product findById(@PathVariable int id){
        return productService.getProductsById(id);
    }
    @GetMapping("/product/{name}")
    public Product findByName(@ PathVariable String name){
        return  productService.getProductsByname(name);
    }
    @PutMapping("/update")
    public Product updateProduct(@RequestBody Product product){
        return productService.updateProduct(product);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id){
        return productService.deleteProduct(id);
    }
}
