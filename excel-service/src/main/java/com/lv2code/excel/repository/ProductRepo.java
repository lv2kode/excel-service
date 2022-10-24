package com.lv2code.excel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lv2code.excel.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
