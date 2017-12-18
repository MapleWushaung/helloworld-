package com.wushuang.test;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wushuang.service.ProductService;

public class TestProduct {
	@Test
	public void testProduct() {

		ClassPathXmlApplicationContext cx = new ClassPathXmlApplicationContext("applicationContext.xml");
		ProductService producttService = (ProductService) cx.getBean("productService");
		producttService.selectProductList();
	}
}
