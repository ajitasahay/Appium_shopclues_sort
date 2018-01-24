package com.appiumshopclues.pages;

import org.hamcrest.Matchers;

import com.qmetry.qaf.automation.core.QAFTestBase;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Validator;

public class ProductdetailsPage extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "lbl.productname.productpage")
	private QAFWebElement lblProductnameProductpage;
	@FindBy(locator = "lbl.productprice.productpage")
	private QAFWebElement lblProductpriceProductpage;
	@FindBy(locator = "lbl.productdetails.productpage")
	private QAFWebElement lblProductdetailsProductpage;

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public QAFWebElement getLblProductnameProductpage() {
		return lblProductnameProductpage;
	}

	public QAFWebElement getLblProductpriceProductpage() {
		return lblProductpriceProductpage;
	}

	public QAFWebElement getLblProductdetailsProductpage() {
		return lblProductdetailsProductpage;
	}

	public void verifyProduct()
	{
		QAFTestBase.pause(5000);
		getLblProductnameProductpage().waitForPresent();
		Validator.verifyThat(getLblProductnameProductpage().isDisplayed()&&getLblProductnameProductpage().isPresent(), Matchers.equalTo(true));
			
	}
	
	
}
