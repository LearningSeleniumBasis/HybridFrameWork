package com.Guru99.BankingApp.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Guru99BankHomePage {
	
	WebDriver driver;
	
	public Guru99BankHomePage(WebDriver ldriver)
	{
		this.driver = ldriver;
	}
	
	@FindBy(how= How.XPATH, using= "//input[@name='uid']")
	WebElement userID; 
	
	@FindBy(how= How.XPATH, using="//*[@type='password']")
	WebElement pswd;
	
	@FindBy(how=How.XPATH, using= "//*[@type='submit']")
	WebElement submitButton;
	
	@FindBy(how= How.NAME, using="btnReset")
	WebElement resetButton;
	
	public void LoginToGuru99Bank(String userName, String password){
		
		userID.sendKeys(userName);
		pswd.sendKeys(password);
		submitButton.click();
		try{
		System.out.println("Page Title: "+driver.getTitle());}
		catch(Exception e){
		String message = driver.switchTo().alert().getText();
		System.out.println("Invalid login entered: "+ message);
		driver.switchTo().alert().dismiss();
		}
	}
	

}
