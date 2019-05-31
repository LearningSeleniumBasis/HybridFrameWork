package com.learnautomation.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.ReportAggregates;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.learnautomation.utility.BrowserFactory;
import com.learnautomation.utility.ConfigDataProvider;
import com.learnautomation.utility.ExcelDataProvider;
import com.learnautomation.utility.Helper;

public class BaseTestClass {
	
	public WebDriver driver;
	public ExcelDataProvider edp;
	public ConfigDataProvider cdp;
	public ExtentReports report;
	public ExtentTest log;
	
	
	@BeforeSuite	
	public void setUpSuite(){
		
		Reporter.log("Preparing to Start Test", true);
		
	 edp = new ExcelDataProvider();
	 cdp = new ConfigDataProvider();
	 
	   ExtentHtmlReporter reporter = new ExtentHtmlReporter("./Reports/Facebook"+Helper.getCurrentDateTime()+".html");
	   
	   report= new ExtentReports();
	   report.attachReporter(reporter);
	   
	   Reporter.log("Preparation is done", true);
	}
	
	@BeforeClass
	public void setUp(){
		
	Reporter.log("Lunching the Browser", true);
	driver = BrowserFactory.lunchApplication(driver, cdp.getBrowser(), cdp.getURL());
	Reporter.log("Browser is up and running.......started Facebook", true);
	}
	
	@AfterClass
	public void closeBrowser(){
	Reporter.log("", true);	
	BrowserFactory.quitBrowser(driver);
	Reporter.log("", true);
	}
	
	@AfterMethod
	public void tearDownMethod(ITestResult result) throws IOException{
		
		Reporter.log("Test is about to End", true);
		
		if(result.getStatus()== ITestResult.FAILURE){
		Helper.captureScreenshot(driver);
		
		log.fail("Test has Failed", MediaEntityBuilder.createScreenCaptureFromPath(Helper.captureScreenshot(driver)).build());
		Reporter.log("--------------------------------TEST FAILED !--------------------------------------------", true);
		}
		
		else if(result.getStatus()== ITestResult.SUCCESS){
			
			Helper.captureScreenshot(driver);
			
			log.pass("Test has Passed", MediaEntityBuilder.createScreenCaptureFromPath(Helper.captureScreenshot(driver)).build());
			Reporter.log("--------------------------------TEST PASSED--------------------------------------------", true);
			}
		
		report.flush();
		Reporter.log("**********************Final Report created***********************", true);
	}
	

}
