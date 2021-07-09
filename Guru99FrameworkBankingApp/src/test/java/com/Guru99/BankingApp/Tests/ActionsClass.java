package com.Guru99.BankingApp.Tests;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		Map<String, Object> pref= new HashMap<String, Object>();
		pref.put("Profile.default_content_setting_values.notifications", 2);
		
		ChromeOptions ops= new ChromeOptions();
		ops.addArguments("--disable-extensions");
		ops.setExperimentalOption("prefs", pref);
		
		WebDriver driver = new ChromeDriver(ops);
		
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		Actions act= new Actions(driver);
		
		act.moveByOffset(100, 50).contextClick().build().perform();
		
		

	}

}
