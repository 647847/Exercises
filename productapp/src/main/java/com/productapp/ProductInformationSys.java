package com.productapp;

public class ProductInformationSys {
	
		ProductDB productDB;
		public ProductInformationSys(ProductDB productDB)
		{
			this.productDB=productDB;
		}
		public Product getProductInfo(int productId)
		{
			return productDB.getProduct(productId);
		}

	}


