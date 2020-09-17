package com.australianopen.android.locators;

import org.openqa.selenium.By;

public class OrderPageAndroidLocators {
	
	public static final By ORDER_EMAIL_TXTBOX =By.xpath("//android.widget.EditText[@resource-id='checkout_email']");
	public static final By ORDER_FIRSTNAME_TXTBOX =By.xpath("//android.widget.EditText[@resource-id='checkout_shipping_address_first_name']");
	public static final By ORDER_LASTNAME_TXTBOX =By.xpath("//android.widget.EditText[@resource-id='checkout_shipping_address_last_name']");
	public static final By ORDER_COUNTRY_DRPDWN = By.xpath("//android.widget.Spinner[@resource-id='checkout_shipping_address_country']");

}
