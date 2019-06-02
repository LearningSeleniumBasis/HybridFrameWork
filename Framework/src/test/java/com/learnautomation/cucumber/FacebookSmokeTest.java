package com.learnautomation.cucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FacebookSmokeTest {
   WebDriver driver;
   
   @Given("^Open Chrome, start the \"([^\"]*)\" application\\.$")
   public void open_Chrome_start_the(String app) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(app);
	   
	}
	
   @When("^User enters valid username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_enters_valid_username_and_password(String uname, String pswd) throws Throwable {
		
	   driver.findElement(By.id("email")).sendKeys(uname);
	   driver.findElement(By.id("pass")).sendKeys(pswd);
	   
	}
	
	@Then("^User should be able to login$")
	public void user_should_be_able_to_login() throws Throwable {
		
		driver.findElement(By.xpath("//*[@type='submit'][@value='Log In']")).click();
		driver.quit();
	}
}
