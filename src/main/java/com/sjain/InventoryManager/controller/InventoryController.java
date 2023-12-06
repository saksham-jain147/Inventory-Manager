package com.sjain.InventoryManager.controller;

import com.sjain.InventoryManager.entities.Product;
import com.sjain.InventoryManager.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InventoryController {

    @Autowired
    private ProductsService productService;
    
    //Get a list of all products.
    @GetMapping("/products")
    public List<Product> getProducts(){
        return this.productService.getProducts();
    }

    //Get a product by its ID.
    @GetMapping("/products/{product_id}")
    public Product getProduct(@PathVariable int product_id){
        return this.productService.getProduct(product_id);
    }

    //Add a new product.
    @PostMapping("/products")
    public Product addProduct(@RequestBody Product product){
        return this.productService.addProduct(product);
    }

    //Update an existing product.
    @PutMapping("/products")
    public Product updateProduct(@RequestBody Product product){
        return this.productService.updateProduct(product);
    }

    //Delete a product by its ID.
    @DeleteMapping("/products/{product_id}")
    public ResponseEntity<HttpStatus> deleteProduct(@PathVariable int product_id){
        try{
            this.productService.deleteProduct(product_id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
