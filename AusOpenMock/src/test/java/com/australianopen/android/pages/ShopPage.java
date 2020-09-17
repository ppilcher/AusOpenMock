package com.australianopen.android.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;

import com.australianopen.android.locators.ShopPageAndroidLocators;
import com.australianopen.utils.LoggerHelper;
import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;

public class ShopPage {
	private AndroidDriver<WebElement> driver;
	ExtentTest testLog;
	public static long DYNAMIC_WAIT=40;
	private Logger log = LoggerHelper.getLogger(MorePage.class);

	public ShopPage(AndroidDriver<WebElement> driver,ExtentTest testLog)  {
		this.driver = driver;
		this.testLog=testLog;
	}
	
	public void clickOnMens() {
		driver.findElement(ShopPageAndroidLocators.SHOP_MENS).click();
	}
	
	public WomensProductsPage clickOnWomens() {
		driver.findElement(ShopPageAndroidLocators.SHOP_WOMENS).click();
		return new WomensProductsPage(driver, testLog);
		
	}
	
	

}
