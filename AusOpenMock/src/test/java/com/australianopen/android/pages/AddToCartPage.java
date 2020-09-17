package com.australianopen.android.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;

import com.australianopen.android.locators.AddToCartAndroidLocators;
import com.australianopen.utils.LoggerHelper;
import com.relevantcodes.extentreports.ExtentTest;

import android.hardware.tetheroffload.control.V1_0.IOffloadControl.addDownstreamCallback;
import io.appium.java_client.android.AndroidDriver;

public class AddToCartPage {
	
	private AndroidDriver<WebElement> driver;
	ExtentTest testLog;
	public static long DYNAMIC_WAIT=40;
	private Logger log = LoggerHelper.getLogger(MorePage.class);
	
	public AddToCartPage(AndroidDriver<WebElement> driver,ExtentTest testLog)  {
		this.driver = driver;
		this.testLog=testLog;
	}
	
	public void clickAddToCart() {
		
		String uiSelector = "new UiSelector().textMatches(\"ADD TO CART\")";
        String command = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView("+ uiSelector + ");";
        driver.findElementByAndroidUIAutomator(command).click();
        
	}
	public OrderPage clickCheckOut() {
		driver.findElement(AddToCartAndroidLocators.PRODUCT_CHECKOUT_BTN).click();
		return new OrderPage(driver, testLog);
	}

}
