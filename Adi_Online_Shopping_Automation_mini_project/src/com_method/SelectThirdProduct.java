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

public class SelectThirdProduct {
	public static void fromElectrical(WebDriver driver) throws Exception{
		Properties prop =new Properties();
		InputStream input= new FileInputStream("C:\\Users\\Windows10\\workspace\\Adi_Online_Shopping_Automation_mini_project\\src\\com_method\\config.properties");
		prop.load(input);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		Actions actions = new Actions(driver);
		WebElement target2 = driver.findElement(By.xpath(prop.getProperty("menu")));
		actions.moveToElement(target2).perform();
		
		WebElement target_electrical = driver.findElement(By.xpath(prop.getProperty("home")));
		actions.moveToElement(target_electrical).perform();
		driver.findElement(By.xpath(prop.getProperty("electrical"))).click();
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e5) {
			
			e5.printStackTrace();
		}
		
		
		WebElement Element_three=driver.findElement(By.xpath(prop.getProperty("thirdproduct")));
		js.executeScript("arguments[0].scrollIntoView();", Element_three);
		Element_three.click();
		
		SendingControlToTabs.fromTabs(driver,3);// Sending control to another tab (window handling)
    	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);//adding timeout to synchronize the code
		
	}

}
