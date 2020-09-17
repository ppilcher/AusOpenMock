package com.australianopen.android.tests;

import org.apache.log4j.Logger;
import java.lang.reflect.Method;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.australianopen.android.pages.AddToCartPage;
import com.australianopen.android.pages.ConditionsOfUsePage;
import com.australianopen.android.pages.MorePage;
import com.australianopen.android.pages.OrderPage;
import com.australianopen.android.pages.PlayerInformationPage;
import com.australianopen.android.pages.PlayersPage;
import com.australianopen.android.pages.ShopPage;
import com.australianopen.android.pages.WelcomePage;
import com.australianopen.android.pages.WhatsOnPage;
import com.australianopen.android.pages.WomensProductsPage;
import com.australianopen.utils.LoggerHelper;
import com.relevantcodes.extentreports.LogStatus;

public class AndroidPOCTest extends BaseTestSuite {
		
	//private Logger log=LoggerHelper.getLogger(AndroidPOCTest.class);
	
	public static final String EMAIL_IS_REQUIRED_MSG = "Email is required.";
	public static final String CONTACTPHONE_IS_REQUIRED_MSG = "Contact Phone is required.";
	public static final String STATE_IS_REQUIRED_MSG = "State is required.";
	public static final String ENQUIRYTYPE_IS_REQUIRED_MSG = "Enquiry type is required.";
	public static final String MESSAGE_IS_REQUIRED_MSG = "Message is required.";
	
	@Test
	public void TC001_verifyFavouriteFunctionality(Method method) throws Exception{
		testLog=extent.startTest(this.getClass().getSimpleName(), method.getAnnotation(Test.class).description());
		testLog.log(LogStatus.INFO,"Executing verifyFavouriteFunctionality test");
		WelcomePage welcomePage = new WelcomePage(driver,testLog);
		WhatsOnPage whatsOnPage = welcomePage.clickOnSkipAllButton();	
		MorePage morePage = whatsOnPage.clickOnMoreButton();
		morePage.verifyMorePageTitleVisibility();
		Thread.sleep(5000);
		ShopPage shoppage = morePage.clickOnShop();
		WomensProductsPage productpage = shoppage.clickOnWomens();
		AddToCartPage addtocart = productpage.clickOnTshirt();
		addtocart.clickAddToCart();
		OrderPage orderpage = addtocart.clickCheckOut();
		orderpage.enterEmail();//enters email
		orderpage.scrollIntoViewAndClick("Last name", false);//scrolls shipping details into view
		orderpage.enterShippingDetails();//enters shipping details
		orderpage.scrollIntoViewAndClick("Return to cart", true);//scrolls return to cart link into view and clicks
		
		
		
	}
	
	
	
}
