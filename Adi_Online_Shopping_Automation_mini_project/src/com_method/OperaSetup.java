package com_method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class OperaSetup {
	public static  WebDriver getOpera() {
		System.setProperty("webdriver.opera.driver","C:\\Users\\Windows10\\workspace\\Adi_Online_Shopping_Automation_mini_project\\operadriver\\operadriver.exe");  
		WebDriver driver = new OperaDriver();
		return driver; 
		
		}

}
