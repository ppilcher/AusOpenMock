package com.australianopen.android.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;

import com.australianopen.android.locators.MorePageAndroidLocators;
import com.australianopen.android.locators.WomensProductsPageAndroidLocators;
import com.australianopen.utils.LoggerHelper;
import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;

public class WomensProductsPage {
	
	private AndroidDriver<WebElement> driver;
	ExtentTest testLog;
	public static long DYNAMIC_WAIT=40;
	private Logger log = LoggerHelper.getLogger(MorePage.class);

	public WomensProductsPage(AndroidDriver<WebElement> driver,ExtentTest testLog)  {
		this.driver = driver;
		this.testLog=testLog;
	}
	
	public AddToCartPage clickOnTshirt() {
		driver.findElement(WomensProductsPageAndroidLocators.PRODCUTSPAGE_TSHIRTTEXT).click();
		return new AddToCartPage(driver, testLog);
	}
	
	
}
