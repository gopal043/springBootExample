package com.springboot.springbootrestexample;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	@Autowired
	private IProductService productService;

	@GetMapping("/")
	public String homePage(){
		System.out.println("index()");
		return "index";
	}
	
	// mapping the getProduct() method to /product
	@GetMapping(value = "/product")
	public List<Product> getProduct() {
		// finds all the products
		List<Product> products = productService.findAll();
		// returns the product list
		return products;
	}
}