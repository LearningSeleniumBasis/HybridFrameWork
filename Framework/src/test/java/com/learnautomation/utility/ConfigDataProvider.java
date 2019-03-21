package com.learnautomation.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataProvider {
	
	public Properties pro;
	
	public ConfigDataProvider()
	{
		File file= new File("./config/config.properties");
		
		try {
			FileInputStream fis = new FileInputStream(file);
			
			pro= new Properties();
			
			pro.load(fis);
			
		} catch (Exception e) {
			
			System.out.println("unable to load config file: "+e.getMessage());
		} 
	}
	
	public String getBrowser()
	{
		return pro.getProperty("Browser");
	}

	public String getURL()
	{
		return pro.getProperty("TESTAppUrl");
	}
	
	public String getUser()
	{
		return pro.getProperty("User");
	}
}
