package com.planeSelenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.Guru99.BankingApp.Utility.BrowserFactory;

public class FileUploadTest {
	WebDriver driver;
  @Test
  public void f() throws AWTException, InterruptedException {
	  
	  StringSelection sel= new StringSelection("C:\\Users\\u6044355\\OneDrive - Thomson Reuters Incorporated\\Desktop\\Upload.txt");
	  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel, null);
	  BrowserFactory.lunchApplication(driver, "chrome", "http://my.monsterindia.com/create_account.html");
	  
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//span[contains(text(), 'Choose CV')]")).click();
	  
	  
	  Robot rbt= new Robot();
	  Thread.sleep(1000);
	  
	  // Press Enter
	  rbt.keyPress(KeyEvent.VK_ENTER);
	  
	 // Release Enter
	  rbt.keyRelease(KeyEvent.VK_ENTER);
	  
	   // Press CTRL+V
	  rbt.keyPress(KeyEvent.VK_CONTROL);
	  rbt.keyPress(KeyEvent.VK_V);
	  
	 // Release CTRL+V
	  rbt.keyRelease(KeyEvent.VK_CONTROL);
	  rbt.keyRelease(KeyEvent.VK_V);
	  Thread.sleep(1000);
  }
}
