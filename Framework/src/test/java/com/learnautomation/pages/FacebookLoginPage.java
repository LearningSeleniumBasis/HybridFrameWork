package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FacebookLoginPage {
	
	WebDriver driver;
	
	public FacebookLoginPage(WebDriver ldriver)
	{
		this.driver= ldriver;
	}
	
	@FindBy(how=How.ID, using="email")
	WebElement email_or_phone;
	
	@FindBy(how=How.ID, using="pass")
	WebElement password;
	
	@FindBy(how=How.XPATH, using="//*[@type='submit'][@value='Log In']")
	WebElement login_button;
	
	public void loginToFacebook(String id, String pswd)
	{
		email_or_phone.sendKeys(id);
		password.sendKeys(pswd);
		login_button.click();
	    System.out.println("Page Title: "+driver.getTitle());
	}
}
