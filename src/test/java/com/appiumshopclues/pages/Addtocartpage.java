package com.appiumshopclues.pages;

import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class Addtocartpage extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "btn.addtocart.productpage")
	private QAFWebElement btnAddtocartProductpage;

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public QAFWebElement getBtnAddtocartProductpage() {
		return btnAddtocartProductpage;
	}

}
