package com.wushuang.dao;

import java.util.List;


import com.wushuang.entity.Product;

public interface ProductDAO {
	public List<Product> selectProductList();
	
	public void deleteProductById(Product product);
	
	public void insertProduct(Product product);
}
