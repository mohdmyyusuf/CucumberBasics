package com.ecom.test.base;

import org.openqa.selenium.WebDriver;

public class TestBase {
	
	public static WebDriver driver; 
	
	public void initialization(String browserName){
		
		
		
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.driver.chrome", "dgddg");
			
			
		}
		
		
	}

}
