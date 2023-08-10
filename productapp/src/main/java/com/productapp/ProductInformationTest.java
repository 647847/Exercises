package com.productapp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.productapp.Product;
import com.productapp.ProductDB;
import com.productapp.ProductInformationSys;

import static org.mockito.Mockito.*;

//import org.junit.Test;

public class ProductInformationTest {

	@Test
	public void testGetProductInfo() {
		ProductDB productDB = mock(ProductDB.class);
		Product obj=new Product(1,"coffee",23);
		Product obj1=new Product(2,"tea",100);
		when(productDB.getProduct(1)).thenReturn(obj);
		when(productDB.getProduct(2)).thenReturn(obj1);
		
		ProductInformationSys prSystem=new ProductInformationSys(productDB);
		Product product=prSystem.getProductInfo(2);
		String productName=product.getProductname();
		float price=product.getPrice();
		assertEquals("tea",productName);
	}

	public void test() {
		fail("Not yet implemented");
	}

}
