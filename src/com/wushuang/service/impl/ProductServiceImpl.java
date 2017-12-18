package com.wushuang.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wushuang.dao.ProductDAO;
import com.wushuang.dao.impl.ProductDaoImpl;
import com.wushuang.entity.Product;
import com.wushuang.service.ProductService;
@Service(value = "productService")
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDAO productDao;
	
	public List<Product> selectProductList() {
		List<Product> products = productDao.selectProductList();
		return products;
	}
	public void deleteProductById(Product product) {
		productDao.deleteProductById(product);
		
	}
	
	public void insertProduct(Product product) {
		productDao.insertProduct(product);
	}

}
