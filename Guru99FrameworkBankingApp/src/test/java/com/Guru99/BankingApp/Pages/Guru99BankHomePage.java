package com.Guru99.BankingApp.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Guru99BankHomePage {
	public WebDriver driver;
	
	public Guru99BankHomePage(WebDriver ldriver)
	{
		this.driver= ldriver;
	}
	
	@FindBy(how=How.XPATH, using= "//*[contains(text(), 'Manager Id')]")
	WebElement managerID;
	
	public void checkManagerID(){
		System.out.println("Your "+managerID.getText());
	}

}
