package com_method;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class WriteToExcelSheet {
	public static void result(WebDriver driver) throws Exception{
		Properties prop =new Properties();
		InputStream input= new FileInputStream("C:\\Users\\Windows10\\workspace\\Adi_Online_Shopping_Automation_mini_project\\src\\com_method\\config.properties");
		prop.load(input);
		
		String amount= prop.getProperty("Price_of_two_product");
		String amount1=prop.getProperty("Price_of_all_product");
		
		
		XSSFWorkbook workbook = new XSSFWorkbook(); 
		  
	    // Create a blank sheet 
	    XSSFSheet sheet = workbook.createSheet("Product Details"); 

	    // This data needs to be written (Object[]) 
	   
	    TreeMap<String, Object[]> data = new TreeMap<String, Object[]>(); 
	    data.put("1", new Object[]{ "No. of Product ", "Price" }); 
	    data.put("2", new Object[]{ 2, amount }); 
	    data.put("3", new Object[]{ 3, amount1 }); 
	   

	    // Iterate over data and write to sheet 
	    Set<String> keyset = data.keySet(); 
	    int rownum = 0; 
	    for (String key : keyset) { 
	        // this creates a new row in the sheet 
	        XSSFRow row = sheet.createRow(rownum++); 
	        Object[] objArr = data.get(key); 
	        int cellnum = 0; 
	        for (Object obj : objArr) { 
	            // this line creates a cell in the next column of that row 
	            XSSFCell cell = row.createCell(cellnum++); 
	            if (obj instanceof String) 
	                cell.setCellValue((String)obj); 
	            else if (obj instanceof Integer) 
	                cell.setCellValue((Integer)obj); 
	        } 
	    } 
	    try { 
	        // this Writes the workbook
	        FileOutputStream out = new FileOutputStream(new File("ResultOfOnlineShoppingAutomation.xlsx")); 
	        workbook.write(out); 
	        out.close(); 
	        System.out.println("ResultOfOnlineShoppingAutomation.xlsx written successfully on disk."); 
	    } 
	    catch (Exception e) { 
	        e.printStackTrace(); 
	    } 

	}

}
