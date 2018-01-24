package com.appiumshopclues.pages;

import org.hamcrest.Matchers;

import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.core.QAFTestBase;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebElement;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Validator;

public class CatogoryPage extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "txtbx.searchproduct.homepage")
	private QAFWebElement txtbxSearchproductHomepage;
	@FindBy(locator = "lbl.sortoption.productpage")
	private QAFWebElement lblSortoptionProductpage;
	@FindBy(locator = "btn.sort.productpage")
	private QAFWebElement btnSortProductpage;
	@FindBy(locator = "txtbox.productname.productpage")
	private QAFWebElement txtboxProductnameProductpage;
	@FindBy(locator = "suggestion.productname.productpage")
	private QAFWebElement suggestionProductnameProductpage;
	
	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public QAFWebElement getTxtbxSearchproductHomepage() {
		return txtbxSearchproductHomepage;
	}

	public QAFWebElement getLblSortoptionProductpage() {
		return lblSortoptionProductpage;
	}

	public QAFWebElement getBtnSortProductpage() {
		return btnSortProductpage;
	}

	public QAFWebElement getTxtboxProductnameProductpage() {
		return txtboxProductnameProductpage;
	}
	public QAFWebElement getSuggestionProductnameProductpage() {
		return suggestionProductnameProductpage;
	}
	
	public void selectCatogory()
	{
		txtboxProductnameProductpage.sendKeys("oats");
		QAFTestBase.pause(5000);
		getSuggestionProductnameProductpage().waitForPresent();
		Validator.verifyThat(getSuggestionProductnameProductpage().getText(), Matchers.containsString("oats in Breakfast & Diet Foods"));
		getSuggestionProductnameProductpage().click();
		btnSortProductpage.waitForPresent();
	}

	public void productSort(String choose) {
		QAFExtendedWebElement sort=new QAFExtendedWebElement(String.format(ConfigurationManager.getBundle().getString("lbl.sortoption.productpage"),choose));
		sort.click();	
	}
	
	

}
