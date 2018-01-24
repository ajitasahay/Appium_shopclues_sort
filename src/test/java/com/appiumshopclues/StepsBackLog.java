/**
 * 
 */
package com.appiumshopclues;

import com.qmetry.qaf.automation.step.QAFTestStep;
import com.appiumshopclues.pages.Addtocartpage;
import com.appiumshopclues.pages.CartTestPage;
import com.appiumshopclues.pages.CatogoryPage;
import com.appiumshopclues.pages.HomePage;
import com.appiumshopclues.pages.ProductList;
import com.appiumshopclues.pages.ProductdetailsPage;

/**
 * @author Ajita.Sahay
 */
public class StepsBackLog {

	HomePage homepage = new HomePage();
	CatogoryPage catogorypage = new CatogoryPage();
	ProductdetailsPage productdetails = new ProductdetailsPage();
	Addtocartpage addtocartpage = new Addtocartpage();
	CartTestPage cartpage = new CartTestPage();
	ProductList list = new ProductList();

	@QAFTestStep(description = "user is on shopclues application")
	public void userIsOnShopcluesApplication() {
		homepage.getBtnCancelaccessHomepage().click();
	}

	@QAFTestStep(description = "user verify the homepage")
	public void userVerifyTheHomepage() {
		homepage.verifyHomePage();
	}

	@QAFTestStep(description = "user inputs {0} in search box")
	public void userInputsInSearchBox(String str0) {
		catogorypage.getTxtbxSearchproductHomepage().waitForPresent();
		catogorypage.getTxtbxSearchproductHomepage().click();

	}

	@QAFTestStep(description = "user should see the result of oats")
	public void userShouldSeeTheResultOfOats() {
		catogorypage.selectCatogory();
	}

	@QAFTestStep(description = "user select {0} sorting")
	public void userSelectSorting(String str0) {
		catogorypage.getBtnSortProductpage().click();
		catogorypage.productSort("Price Low to High");
	}

	@QAFTestStep(description = "user should see result based on sorting")
	public void userShouldSeeResultBasedOnSorting() {

		productdetails.verifyProduct();
		list.productList();
	}

	@QAFTestStep(description = "user selects {0} product from result")
	public void userSelectsProductFromResult(String str0) {
		list.selectProduct(1);
	}

	@QAFTestStep(description = "user add the product to cart")
	public void userAddTheProductToCart() {
		addtocartpage.getBtnAddtocartProductpage().click();
	}

	@QAFTestStep(description = "user verify product should be added to cart")
	public void userVerifyProductShouldBeAddedToCart() {
		cartpage.verifyCart();
	}
}
