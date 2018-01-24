package com.appiumshopclues.pages;

import java.util.List;

import org.hamcrest.Matchers;

import com.qmetry.qaf.automation.core.QAFTestBase;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.util.Reporter;
import com.qmetry.qaf.automation.util.Validator;
import com.appiumshopclues.bean.ProductInfoBean;
import com.appiumshopclues.productinfo.ProductDetails;

public class ProductList extends WebDriverBaseTestPage<WebDriverTestPage> {
	
	@FindBy(locator = "lbl.productdetails.productpage")
	private List<ProductDetails> lblProductdetailsProductpage;
	
	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public List<ProductDetails> getLblProductdetailsProductpage() {
		return lblProductdetailsProductpage;
	}

	public void productList()
	{
		getLblProductdetailsProductpage().get(0).waitForPresent();
		
		Validator.verifyThat(getLblProductdetailsProductpage().size(), Matchers.greaterThan(0));
		//getLblProductdetailsProductpage().get(0).getLblProductnameProductpage().waitForVisible();
		
		for(ProductDetails p:getLblProductdetailsProductpage())
		{
			Reporter.log("ProductName is : "+p.getLblProductnameProductpage().getText());
			Reporter.log("ProductPrice is : "+p.getLblProductpriceProductpage().getText());
		}
	}
	
	public void selectProduct(int index)
	{
		
		ProductInfoBean.setProductName(getLblProductdetailsProductpage().get(index).getLblProductnameProductpage().getText());
		ProductInfoBean.setProductPrice(getLblProductdetailsProductpage().get(index).getLblProductpriceProductpage().getText());
		getLblProductdetailsProductpage().get(index).click();
		QAFTestBase.pause(9000);
	}
	
}

