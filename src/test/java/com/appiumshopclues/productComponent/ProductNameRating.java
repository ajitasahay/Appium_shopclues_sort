package com.appiumshopclues.productComponent;

import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebComponent;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class ProductNameRating extends QAFWebComponent {

	
	public ProductNameRating(String locator) {
		super(locator);
		// TODO Auto-generated constructor stub
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
