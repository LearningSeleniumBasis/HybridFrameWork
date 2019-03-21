package com.learnautomation.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.learnautomation.utility.BrowserFactory;

public class AppLunchTest {
	
	WebDriver driver;
	
	@Test
	
	void lunchApp(){
		
	driver = BrowserFactory.lunchApplication(driver, "chrome", "http://facebook.com");
	}

}
