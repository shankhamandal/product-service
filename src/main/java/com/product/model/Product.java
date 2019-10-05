package com.product.model;

public class Product {

	private String productName;

	private String productId;
	
	private Location location;


	public Product(String productName, String productId, Location location) {
		super();
		this.productName = productName;
		this.productId = productId;
		this.location = location;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

}
