package com.australianopen.android.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;

import com.australianopen.android.locators.OrderPageAndroidLocators;
import com.australianopen.utils.LoggerHelper;
import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;

public class OrderPage {
	
	private AndroidDriver<WebElement> driver;
	ExtentTest testLog;
	public static long DYNAMIC_WAIT=40;
	private Logger log = LoggerHelper.getLogger(MorePage.class);
	
	public OrderPage(AndroidDriver<WebElement> driver,ExtentTest testLog)  {
		this.driver = driver;
		this.testLog=testLog;
	}
	
	public void enterEmail() {
		driver.findElement(OrderPageAndroidLocators.ORDER_EMAIL_TXTBOX).sendKeys("tester@gmail.com");
		
	}
	
	public void enterShippingDetails() {
		driver.findElement(OrderPageAndroidLocators.ORDER_FIRSTNAME_TXTBOX).sendKeys("Tester");
		driver.findElement(OrderPageAndroidLocators.ORDER_LASTNAME_TXTBOX).sendKeys("Testerton");
	}
	
	public void clickReturnToCartLink() {
		String s = "Last name";
		String uiSelector = "new UiSelector().textMatches(\""+s+"\")";
        String command = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView("+ uiSelector + ");";
        driver.findElementByAndroidUIAutomator(command);
        
	}
	
	public void scrollIntoViewAndClick(String st, Boolean r) {
		String uiSelector = "new UiSelector().textMatches(\""+st+"\")";
        String command = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView("+ uiSelector + ");";
        
        if(r==true) {
        	driver.findElementByAndroidUIAutomator(command).click();
        }
        else {
        	driver.findElementByAndroidUIAutomator(command);
        }
	}
	

}
