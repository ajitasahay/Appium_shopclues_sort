package com.appiumshopclues.pages;

import org.hamcrest.Matchers;

import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Validator;
import com.appiumshopclues.bean.ProductInfoBean;

public class CartTestPage extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "btn.buynow.productpage")
	private QAFWebElement btnBuynowProductpage;
	@FindBy(locator = "lbl.productname.cartpage")
	private QAFWebElement lblProductnameCartpage;
	@FindBy(locator = "btn.cart.productpage")
	private QAFWebElement lblcartCartpage;

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public QAFWebElement getBtnBuynowProductpage() {
		return btnBuynowProductpage;
	}
	
	public QAFWebElement getLblProductnameCartpage() {
		return lblProductnameCartpage;
	}
	
	public QAFWebElement getLblCartCartpage() {
		return lblcartCartpage;
	}
	
	public void verifyCart()
	{
		getLblCartCartpage().click();
		getLblProductnameCartpage().waitForPresent();
		Validator.verifyThat(getLblProductnameCartpage().getText(), Matchers.containsString(ProductInfoBean.getProductName()));
	}
	
}
