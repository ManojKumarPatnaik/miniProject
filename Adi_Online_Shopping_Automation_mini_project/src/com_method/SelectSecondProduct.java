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

public class SelectSecondProduct {
	public static void fromLivingRoom(WebDriver driver) throws Exception{
		Properties prop =new Properties();
		InputStream input= new FileInputStream("C:\\Users\\Windows10\\workspace\\Adi_Online_Shopping_Automation_mini_project\\src\\com_method\\config.properties");
		prop.load(input);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		Actions actions = new Actions(driver);
		
		WebElement target1 = driver.findElement(By.xpath(prop.getProperty("menu")));
		actions.moveToElement(target1).perform();
		
		WebElement target_home = driver.findElement(By.xpath(prop.getProperty("home")));
		actions.moveToElement(target_home).perform();
		driver.findElement(By.xpath(prop.getProperty("sofa"))).click();
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e5) {
			
			e5.printStackTrace();
		}
		
		
		WebElement Element_two=driver.findElement(By.xpath(prop.getProperty("secondproduct")));
		js.executeScript("arguments[0].scrollIntoView();", Element_two);
		Element_two.click();
		
		SendingControlToTabs.fromTabs(driver,2);// Sending control to another tab (window handling)
    	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);//adding timeout to synchronize the code

       }
}