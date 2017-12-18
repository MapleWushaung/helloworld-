package com.wushuang.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import com.wushuang.dao.ProductDAO;
import com.wushuang.entity.Product;
import com.wushuang.mapper.ProductMapper;
@Repository(value = "productDao")
public class ProductDaoImpl implements ProductDAO {
	@Autowired
	private ProductMapper productMapper;
	public List<Product> selectProductList() {
		List<Product> products = new ArrayList<Product>();
			products = productMapper.selectProductList();
		return products;
	}

	public void deleteProductById(Product product) {
		productMapper.deleteProductById(product);
	}

	
	public void insertProduct(Product product) {
		productMapper.insertProduct(product);
	};
}
