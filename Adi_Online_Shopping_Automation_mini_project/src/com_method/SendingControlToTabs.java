package com_method;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class SendingControlToTabs {
	
	

	public static void fromTabs(WebDriver driver, int i) {
			Set<String> allWindows = driver.getWindowHandles();
			ArrayList<String> tabs= new ArrayList<>(allWindows);   
			driver.switchTo().window(tabs.get(i));
			
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e4) {
				// TODO Auto-generated catch block
				e4.printStackTrace();
			}
		// TODO Auto-generated method stub
		
	}
}
