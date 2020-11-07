package com_method;

import java.io.FileInputStream;
import java.io.FileOutputStream;
//import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShowPrice {
	public static void items(WebDriver driver) throws Exception{
		Properties prop =new Properties();
		InputStream input= new FileInputStream("C:\\Users\\Windows10\\workspace\\Adi_Online_Shopping_Automation_mini_project\\src\\com_method\\config.properties");
		prop.load(input);
			
	    String amount_for_product= driver.findElement(By.xpath(prop.getProperty("price"))).getText();
	    System.out.println("Price_of_two_product: "+amount_for_product);
	
	    OutputStream output= new FileOutputStream("C:\\Users\\Windows10\\workspace\\Adi_Online_Shopping_Automation_mini_project\\src\\com_method\\config.properties");
	    prop.setProperty("Price_of_two_product", amount_for_product);
	    prop.store(output, "This is the price of first two products in the cart");
	}

}
