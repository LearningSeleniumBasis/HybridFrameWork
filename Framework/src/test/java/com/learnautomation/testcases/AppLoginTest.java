package com.learnautomation.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.learnautomation.pages.BaseTestClass;
import com.learnautomation.pages.FacebookLoginPage;

public class AppLoginTest extends BaseTestClass{
		
	@Test	
	void loginToApp()
	{
		
		log = report.createTest("LoginToAppTest");
		
		FacebookLoginPage fbLP= PageFactory.initElements(driver, FacebookLoginPage.class);
		
		log.info("Lunched Facebook App");
		
		fbLP.loginToFacebook(edp.getStringData("login",0,0), edp.getStringData("login",0,1));	
		
		log.info("logged in to Facebook");
	}

}
