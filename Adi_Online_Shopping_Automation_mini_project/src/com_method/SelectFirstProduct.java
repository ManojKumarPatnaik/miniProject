package com_method;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SelectFirstProduct {
	public static void fromKitechen(WebDriver driver) throws Exception{
		Properties prop =new Properties();
		InputStream input= new FileInputStream("C:\\Users\\Windows10\\workspace\\Adi_Online_Shopping_Automation_mini_project\\src\\com_method\\config.properties");
		prop.load(input);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		Actions actions = new Actions(driver);
		
		WebElement target = driver.findElement(By.xpath(prop.getProperty("home")));
		actions.moveToElement(target).perform();
		
		WebElement target_kitechen = driver.findElement(By.xpath(prop.getProperty("mixer")));
		actions.moveToElement(target_kitechen).perform();
		driver.findElement(By.xpath(prop.getProperty("mixer"))).click();
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e5) {
			
			e5.printStackTrace();
		}
		
		WebElement Element_one = driver.findElement(By.xpath(prop.getProperty("firstproduct")));
		js.executeScript("arguments[0].scrollIntoView();", Element_one);
		Element_one.click();
		
		SendingControlToTabs.fromTabs(driver,1);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		

	}
	
}
