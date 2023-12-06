package com.sjain.InventoryManager.service;

import com.sjain.InventoryManager.dao.ProductDao;
import com.sjain.InventoryManager.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductsServiceImpl implements ProductsService{

    @Autowired
    private ProductDao productDao;

//    List<Product> products;

//    public ProductsServiceImpl(){
//        products = new ArrayList<>();
//        products.add(new Product(1001, "iPhone 14 Pro", "iPhone 14 Pro - 128 GB", 130000.00, 40));
//        products.add(new Product(1002, "iPhone 14 Pro Max", "iPhone 14 Pro Max - 128 GB", 160000.00, 10));
//    }

    @Override
    public List<Product> getProducts() {
        return productDao.findAll();
//        return products;
    }

    @Override
    public Product getProduct(int product_id) {
        return productDao.getOne(product_id);

//        Product p = null;
//
//        for(Product product : products){
//            if(product.getId() == product_id){
//                p = product;
//                break;
//            }
//        }
//        return p;
    }

    @Override
    public Product addProduct(Product product) {
        productDao.save(product);
//        products.add(product);
        return product;
    }

    @Override
    public Product updateProduct(Product product) {

        productDao.save(product);

//        for(Product p : products){
//            if(product.getId() == p.getId()){
//                p.setName(product.getName());
//                p.setDescription(product.getDescription());
//                p.setPrice(product.getPrice());
//                p.setQuantity(product.getQuantity());
//            }
//        }
        return product;
    }

    @Override
    public void deleteProduct(int product_id) {
        Product entity = productDao.getOne(product_id);
        productDao.delete(entity);
//        products = this.products.stream().filter(p->p.getId()!=product_id).collect(Collectors.toList());
    }
}
