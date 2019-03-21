package com.learnautomation.utility;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helper {
	
	public static String captureScreenshot(WebDriver driver)
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File des = new File("./ScreenShots/Facebook" +getCurrentDateTime()+".png");
		
		String scrnshtPath ="./ScreenShots/Facebook" +getCurrentDateTime()+".png";
		
		try {
			FileHandler.copy(src,des);
			System.out.println("--------Screenshot Captured--------");
		} catch (IOException e) {
			
			System.out.println("Unable to capture Screenshot: "+e.getMessage());
		}
		
		return scrnshtPath;
				
	}
	
	
	public static String getCurrentDateTime(){
		
		DateFormat customFormat= new SimpleDateFormat("MM_dd_yy_HH_mm_ss");
		Date currentDate = new Date();
		
		return customFormat.format(currentDate);
		
	}

}
