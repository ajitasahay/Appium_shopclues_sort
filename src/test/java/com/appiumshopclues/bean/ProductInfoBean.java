package com.appiumshopclues.bean;

public class ProductInfoBean {

	public static   String productName1;
	public static String productPrice1;
	
	public static void setProductName(String productName)
	{
		productName1=productName;
	}
	
	public static String getProductName()
	{
		return productName1;
	}
	
	public static void setProductPrice(String productPrice)
	{
		productPrice1=productPrice;
	}
	
	public static String getProductPrice()
	{
		return productPrice1;
	}
	
}

