package com.wushuang.service;

import java.util.List;


import com.wushuang.entity.Product;

public interface ProductService {
	public List<Product> selectProductList();
	
	public void deleteProductById(Product product);
	
	public void insertProduct(Product product);
}
