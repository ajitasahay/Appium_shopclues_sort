package com.appiumshopclues.pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.appiumshopclues.productComponent.ProductNameRating;

public class ProductDetailsSort extends WebDriverBaseTestPage<WebDriverTestPage> {
	
	@FindBy(locator = "lbl.productdetails.productpage")
	private List<ProductNameRating> lblProductdetailsProductpage;

	
	public  List<ProductNameRating> getLblProductdetailsProductpage() {
		return lblProductdetailsProductpage;
	}

	@Override
	protected void openPage(PageLocator locator, Object... args) {
		// TODO Auto-generated method stub
		
	}
	
	public void testSort()
	{
		ArrayList<String> a=new ArrayList<String>();
		getLblProductdetailsProductpage().get(0).waitForPresent();
		System.out.println(getLblProductdetailsProductpage().size());
		for(ProductNameRating ajita:getLblProductdetailsProductpage())
		{
			a.add(ajita.getLblProductpriceProductpage().getText());
		}
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
			
		}
		Collections.sort(a);		
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
			
		}
		
	}
	

}
