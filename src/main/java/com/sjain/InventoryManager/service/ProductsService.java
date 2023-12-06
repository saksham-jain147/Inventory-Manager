package com.sjain.InventoryManager.service;

import com.sjain.InventoryManager.entities.Product;

import java.util.List;

public interface ProductsService {
    public List<Product> getProducts();
    public Product getProduct(int product_id);
    public Product addProduct(Product product);
    public Product updateProduct(Product product);
    public void deleteProduct(int product_id);
}
