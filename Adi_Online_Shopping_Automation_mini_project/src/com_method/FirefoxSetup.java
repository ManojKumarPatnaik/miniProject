package com_method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxSetup {
	public static  WebDriver getFirefox() {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Windows10\\workspace\\Adi_Online_Shopping_Automation_mini_project\\Firefoxdriver\\geckodriver.exe");  
		WebDriver driver = new FirefoxDriver();
		return driver; 
		
		}

}
