package com.cucumberFramework.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * 
 * @author VIkas Kumar
 *
 */
public class Organizations {
	
	private WebDriver driver;
	
	public Organizations(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
