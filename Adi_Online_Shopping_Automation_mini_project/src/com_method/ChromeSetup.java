package com_method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeSetup {
	public static  WebDriver getChrome() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Windows10\\workspace\\Adi_Online_Shopping_Automation_mini_project\\Cromedriver\\chromedriver.exe");  
	WebDriver driver = new ChromeDriver();
	return driver; 
	
	}
}
