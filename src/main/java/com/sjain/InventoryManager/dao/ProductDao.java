package com.sjain.InventoryManager.dao;

import com.sjain.InventoryManager.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<Product, Integer> {

}
