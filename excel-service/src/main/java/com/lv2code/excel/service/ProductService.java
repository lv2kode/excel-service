package com.lv2code.excel.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.lv2code.excel.entity.Product;
import com.lv2code.excel.helper.ExcelHelper;
import com.lv2code.excel.repository.ProductRepo;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepo productRepo;
	
	public void save(MultipartFile file) {
		try {
			List<Product> products = ExcelHelper.convertExcelToListOfProduct(file.getInputStream());
			productRepo.saveAll(products);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public List<Product> getAllProducts() {
		return productRepo.findAll();
	}
}
