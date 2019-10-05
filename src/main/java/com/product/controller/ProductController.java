package com.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.model.Location;
import com.product.model.Product;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {

	@Autowired
	private LocationServiceProxy locationServiceProxy;

	@GetMapping(produces = "application/json")
	public Product getProduct() {
		Location location = locationServiceProxy.getLocation();
		return new Product("Product 1", "PROD-001", location);
	}

}
