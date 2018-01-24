package com.appiumshopclues.steps;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import com.qmetry.qaf.automation.core.QAFTestBase;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.appiumshopclues.pages.CatogoryPage;
import com.appiumshopclues.pages.HomePage;
import com.appiumshopclues.pages.ProductDetailsSort;

public class ShopCluesTest extends WebDriverBaseTestPage<WebDriverTestPage> {

	@Test
	public void stepsFlow() throws InterruptedException
	{
	
    	HomePage homepage=new HomePage();                                
    	homepage.getBtnCancelaccessHomepage().click();					  //click on cancel button for location access
    	homepage.verifyHomePage();										  //verify whether home page is dispalyed or not
		CatogoryPage catogorypage=new CatogoryPage();					  
        catogorypage.getTxtbxSearchproductHomepage().waitForPresent();    //wait for search text box 
		catogorypage.getTxtbxSearchproductHomepage().click();			  //click on search text box
		catogorypage.selectCatogory();                                    //select the catogory name from suggestion
		//catogorypage.getBtnSortProductpage().click();					  //click on sort button
	    //catogorypage.productSort("Price Low to High");					  //select low to high price option in sort
	    QAFTestBase.pause(7000);
	    ProductDetailsSort sort= new ProductDetailsSort();
	    		sort.testSort();
	    //pause statement
	   /* ProductdetailsPage productdetails=new ProductdetailsPage();	     
	    productdetails.verifyProduct();	         						  //verify the product
	    ProductList list=new ProductList();                               
	    list.productList();              								  //calling productlist method which display all product name with their price
        list.selectProduct(1);											  //calling  selectproduct method for selecting one product 
		Addtocartpage addtocartpage=new Addtocartpage();				 
		addtocartpage.getBtnAddtocartProductpage().click();				  //clicking add to cart button
		CartTestPage cartpage=new CartTestPage();						 
		cartpage.verifyCart();			*/								  //calling verifycart method for verify the product should be added to card
	}

	@Override
	protected void openPage(PageLocator arg0, Object... arg1)
	{
		QAFTestBase.pause(7000);	
		
	}
}
