package com.Guru99.BankingApp.Tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Guru99.BankingApp.Pages.BaseTestClass;
import com.Guru99.BankingApp.Pages.Guru99BankHomePage;

public class Guru99BankLoginFailedTest extends BaseTestClass {
	
	@Test
	public void verifyLoginFailure(){
		logger = report.createTest("LoginFailTest");
		Guru99BankHomePage gbh = PageFactory.initElements(driver,Guru99BankHomePage.class);
		
		logger.info("lunched Guru99Bank Application....");
		gbh.LoginToGuru99Bank(edp.getStringData("login", 1, 0), edp.getStringData("login", 1, 1));
		
		logger.info("Login To Guru99Bank App Failed");
	}

}
