package com.appiumshopclues.pages;

import org.hamcrest.Matchers;

import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebElement;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Validator;

public class HomePage
		extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "btn.cancelaccess.homepage")
	private QAFWebElement btnCancelaccessHomepage;
	@FindBy(locator = "lbl.menu.homepage")
	private QAFWebElement lblMenuHomepage;
	@FindBy(locator = "lbl.submenu.homepage")
	private QAFWebElement lblSubmenuHomepage;
	@FindBy(locator = "lbl.icon.homepage")
	private QAFWebElement lblIconHomepage;
	@FindBy(locator = "txtbx.searchproduct.homepage")
	private QAFWebElement txtbxSearchproductHomepage;

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public QAFWebElement getBtnCancelaccessHomepage() {
		return btnCancelaccessHomepage;
	}

	public QAFWebElement getLblMenuHomepage() {
		return lblMenuHomepage;
	}

	public QAFWebElement getLblSubmenuHomepage() {
		return lblSubmenuHomepage;
	}
	
	public QAFWebElement getLblIconHomepage() {
		return lblIconHomepage;
	}
	
	public QAFWebElement getTxtbxSearchproductHomepage() {
		return txtbxSearchproductHomepage;
	}
	
	public void selectMenu(String submenu)
	{
		QAFExtendedWebElement selectcatogory=new QAFExtendedWebElement(String.format(ConfigurationManager.getBundle().getString("lbl.submenu.homepage"), submenu));
		selectcatogory.waitForVisible(12000);
		selectcatogory.isPresent();
		selectcatogory.click();
		
		
	}
	public void verifyHomePage()
	{
		Validator.verifyThat(getTxtbxSearchproductHomepage().getText(), Matchers.containsString("What are you looking for?"));

	}
	
	

}
