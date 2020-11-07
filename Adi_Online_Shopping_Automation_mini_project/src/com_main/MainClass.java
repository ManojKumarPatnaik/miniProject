package com_main;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class MainClass  {
	@Test()
	public static void online_shopping_automation() throws Exception{
	Properties prop =new Properties();
	InputStream input= new FileInputStream("C:\\Users\\Windows10\\workspace\\Adi_Online_Shopping_Automation_mini_project\\src\\com_method\\config.properties");
	prop.load(input);
	System.out.println(prop.getProperty("browser"));
	 
	   // public static void StartChrome() throws Exception {
		        if(prop.getProperty("browser").equalsIgnoreCase("chrome")){
		        WebDriver driver = com_method.ChromeSetup.getChrome(); //setup driver
		        
		        
		        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);  //adding timeout to synchronize the code
		        driver.manage().window().maximize(); // Maximizes the window
		        driver.manage().deleteAllCookies(); // Delete all the cookies
		    	
		    	com_method.BaseUrl.website(driver); // Opening the website www.snapdeal.com 
		    	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS); //adding timeout to synchronize the code
		    	
		    	com_method.SelectFirstProduct.fromKitechen(driver); // Select the First product from kitchen subsection from Home and Kitchen section
		    	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);//adding timeout to synchronize the code
		    	
		    	com_method.AddToCart.products(driver);// Proceed to add to cart
		    	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);// adding timeout to synchronize the code
		    	
		    	com_method.SelectSecondProduct.fromLivingRoom(driver);//Select the Second product from Living room subsection from Home and Kitchen section
		    	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);//adding timeout to synchronize the code
		    	
		    	com_method.AddToCart.products(driver);// Proceed to add to cart
		    	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);//adding timeout to synchronize the code
		    	
		    	com_method.ShowPrice.items(driver);// Show the price of the two products which are added in the cart. 
		    	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);//adding timeout to synchronize the code
		    	
		    	com_method.SelectThirdProduct.fromElectrical(driver);// Select the third product from Electrical subsection from Home and Kitchen section
		    	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);//adding timeout to synchronize the code
		    	
		    	com_method.AddToCart.products(driver);// Proceed to add to cart
		    	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);//adding timeout to synchronize the code
		    	
		    	com_method.ShowUpdatedAmount.items(driver);// Show the price of all the products which are added in the cart.
		    	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);//adding timeout to synchronize the code
		    	
		    	driver.quit();// close the browser
		    	
		    	com_method.WriteToExcelSheet.result(driver);// write the result in the excel sheet
		    	
		    	
		        }
		        
		        else if(prop.getProperty("browser").equalsIgnoreCase("opera")){
			        WebDriver driver = com_method.OperaSetup.getOpera(); //setup driver
			        
			        
			        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);  //adding timeout to synchronize the code
			        driver.manage().window().maximize(); // Maximizes the window
			        driver.manage().deleteAllCookies(); // Delete all the cookies
			    	
			    	com_method.BaseUrl.website(driver); // Opening the website www.snapdeal.com 
			    	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS); //adding timeout to synchronize the code
			    	
			    	com_method.SelectFirstProduct.fromKitechen(driver); // Select the First product from kitchen subsection from Home and Kitchen section
			    	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);//adding timeout to synchronize the code
			    	
			    	com_method.AddToCart.products(driver);// Proceed to add to cart
			    	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);// adding timeout to synchronize the code
			    	
			    	com_method.SelectSecondProduct.fromLivingRoom(driver);//Select the Second product from Living room subsection from Home and Kitchen section
			    	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);//adding timeout to synchronize the code
			    	
			    	com_method.AddToCart.products(driver);// Proceed to add to cart
			    	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);//adding timeout to synchronize the code
			    	
			    	com_method.ShowPrice.items(driver);// Show the price of the two products which are added in the cart. 
			    	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);//adding timeout to synchronize the code
			    	
			    	com_method.SelectThirdProduct.fromElectrical(driver);// Select the third product from Electrical subsection from Home and Kitchen section
			    	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);//adding timeout to synchronize the code
			    	
			    	com_method.AddToCart.products(driver);// Proceed to add to cart
			    	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);//adding timeout to synchronize the code
			    	
			    	com_method.ShowUpdatedAmount.items(driver);// Show the price of all the products which are added in the cart.
			    	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);//adding timeout to synchronize the code
			    	
			    	driver.quit();// close the browser
			    	
			    	com_method.WriteToExcelSheet.result(driver);// write the result in the excel sheet
			        }
		        else{ 	
		        	WebDriver driver = com_method.FirefoxSetup.getFirefox(); //setup driver
		        	
		        	 driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);//adding timeout to synchronize the code
		 	        driver.manage().window().maximize();// Maximizes the window
		 	    	driver.manage().deleteAllCookies();// Delete all the cookies
		 	    	
		 	    	com_method.BaseUrl.website(driver);// Opening the website www.snapdeal.com 
		 	    	driver.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);//adding timeout to synchronize the code
		 	    	
		 	    	com_method.SelectFirstProduct.fromKitechen(driver);//Select the First product from Kitchen subsection from Home and Kitchen section
		 	    	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);//adding timeout to synchronize the code
		 	    	
		 	    	com_method.AddToCart.products(driver);// Proceed to add to cart
		 	    	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);//adding timeout to synchronize the code
		 	    	
		 	    	com_method.SelectSecondProduct.fromLivingRoom(driver);//Select the Second product from Living room subsection from Home and Kitchen section
		 	    	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);//adding timeout to synchronize the code
		 	    	
		 	    	com_method.AddToCart.products(driver);// Proceed to add to cart
		 	    	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);//adding timeout to synchronize the code
		 	    	
		 	    	com_method.ShowPrice.items(driver);// Show the price of the two products which are added in the cart.
		 	    	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);//adding timeout to synchronize the code
		 	    	
		 	    	com_method.SelectThirdProduct.fromElectrical(driver);// Select the third product from Electrical subsection from Home and Kitchen section
		 	    	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);//adding timeout to synchronize the code
		 	    	
		 	    	com_method.AddToCart.products(driver);// Proceed to add to cart
		 	    	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);//adding timeout to synchronize the code
		 	    	
		 	    	com_method.ShowUpdatedAmount.items(driver);// Show the price of all the products which are added in the cart.
		 	    	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);//adding timeout to synchronize the code
		 	    	
		 	    	driver.quit();// close the browser
		 	    	
		 	    	com_method.WriteToExcelSheet.result(driver);// write the result in the excel sheet
		 	   
		 	    	
		 	    	
		        }
       }
	 
}

