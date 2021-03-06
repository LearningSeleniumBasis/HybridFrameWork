package com.Guru99.BankingApp.Tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Guru99.BankingApp.Pages.BaseTestClass;
import com.Guru99.BankingApp.Pages.Guru99BankLoginPage;

public class Guru99BankLoginTest extends BaseTestClass {
  @Test
  public void verifyLogin() {
	  
	    logger = report.createTest("LoginToGuru99BankTest");
		
		Guru99BankLoginPage g99Bank= PageFactory.initElements(driver, Guru99BankLoginPage.class);
		
		logger.info("Lunched Guru99Bank App");
		
		g99Bank.LoginToGuru99Bank(edp.getStringData("login", 0, 0), edp.getStringData("login", 0, 1));;	
		
		logger.info("logged in to Guru99Bank App");
  }
}
