package com_method;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class BaseUrl {
	public static void website(WebDriver driver) throws Exception{
	Properties prop =new Properties();
	InputStream input= new FileInputStream("C:\\Users\\Windows10\\workspace\\Adi_Online_Shopping_Automation_mini_project\\src\\com_method\\config.properties");
	prop.load(input);
    driver.get(prop.getProperty("baseurl"));

    }
}