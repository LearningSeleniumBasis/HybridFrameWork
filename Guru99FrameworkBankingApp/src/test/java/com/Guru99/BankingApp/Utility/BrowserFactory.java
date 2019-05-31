package com.Guru99.BankingApp.Utility;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {
	
	//this will return the driver for the Test class and will lunch the Application in Browser
	public static WebDriver lunchApplication(WebDriver driver, String browserName, String url)
	{
		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("profile.default_content_setting_values.notifications", 2);
			
			ChromeOptions ops = new ChromeOptions();
			//this will disable developer mode extension.
			ops.addArguments("--disable-extensions");
			//this will disable chrome notifications.
			ops.setExperimentalOption("prefs", map);
			
			driver= new ChromeDriver(ops);
		}
		
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
			
			driver= new FirefoxDriver();
		}
		
		else if(browserName.equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.ie.driver", "./Drivers/IEDriverServer.exe");
			
			driver= new InternetExplorerDriver();
		}
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
	}
	
	// this will qiut the driver
	public static void quitBrowser(WebDriver driver)
	{
		driver.quit();
	}

}
