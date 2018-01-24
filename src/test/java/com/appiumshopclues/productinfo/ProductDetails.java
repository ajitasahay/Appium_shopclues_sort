package com.appiumshopclues.productinfo;

import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebComponent;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class ProductDetails extends QAFWebComponent {

	public ProductDetails(String locator) {
		super(locator);
	}
	
	@FindBy(locator = "lbl.productname.productpage")
	private QAFWebElement lblProductnameProductpage;
	@FindBy(locator = "lbl.productprice.productpage")
	private QAFWebElement lblProductpriceProductpage;

	public QAFWebElement getLblProductnameProductpage() {
		return lblProductnameProductpage;
	}

	public QAFWebElement getLblProductpriceProductpage() {
		return lblProductpriceProductpage;
	}
}
