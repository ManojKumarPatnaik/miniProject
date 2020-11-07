package com_method;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddToCart {
	public static void products(WebDriver driver) throws Exception{
		Properties prop =new Properties();
		InputStream input= new FileInputStream("C:\\Users\\Windows10\\workspace\\Adi_Online_Shopping_Automation_mini_project\\src\\com_method\\config.properties");
		prop.load(input);
		
		WebElement addtocartbutton =driver.findElement(By.id(prop.getProperty("cart")));
		addtocartbutton.click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e3) {
			
			e3.printStackTrace();
		}
	}

}
