package com.wushuang.mapper;

import java.util.List;

import com.wushuang.entity.Product;

public interface ProductMapper {
	public List<Product> selectProductList();
	
	public void deleteProductById(Product product);
	
	public void insertProduct(Product product);
}
