package com.wushuang.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.wushuang.entity.Product;
import com.wushuang.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@RequestMapping("SelectProduct")
	public ModelAndView selectProduct() {
		ModelAndView mav = new ModelAndView("productList");
		List<Product>  products =  productService.selectProductList();
		mav.addObject("products",products);
		return mav;
	}
	
	@RequestMapping("DeleteProduct/{id}")
	public ModelAndView deleteProduct(@PathVariable int id) {
		ModelAndView mav = new ModelAndView("redirect:/SelectProduct");
		Product product = new Product();
		product.setId(id);
		productService.deleteProductById(product);
		System.out.println("delete success");
		return mav;
	}
	
	@RequestMapping("InsertProduct")
	public ModelAndView InsertProduct(Product product) {
		ModelAndView mav = new ModelAndView("redirect:/SelectProduct");
		productService.insertProduct(product);
		System.out.println("insert success");
		return mav;
	}
}
