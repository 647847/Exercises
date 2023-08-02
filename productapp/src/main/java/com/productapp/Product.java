package com.productapp;

public class Product {
	private int roductid;
	private String productname;
	private float price;
	public Product()
	{
		super();
	}
	public Product(int roductid, String productname, float price) {
		super();
		this.roductid = roductid;
		this.productname = productname;
		this.price = price;
	}
	public int getRoductid() {
		return roductid;
	}
	public void setRoductid(int roductid) {
		this.roductid = roductid;
	}
	public String getProductname() {
		return productname;
	}
	public void setsProductname(String productname) {
		this.productname = productname;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [roductid=" + roductid + ", productname=" + productname + ", price=" + price + "]";
	}
	

}
