package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.openqa.selenium.WebDriver;


public class ExcelUtils {
	
	
	public static String getLoginCredentials(String sheetName,int rowNumber)
	{
		String username = null;
		String password = null;
		try
		{
			String projectpath = System.getProperty("user.dir");
			XSSFWorkbook workbook = new XSSFWorkbook(projectpath +"\\Excel\\LoginDetails.xlsx");
			XSSFSheet sheet = workbook.getSheet(sheetName);
			
			for(int j=0;j<1;) 
			{
			
				username= sheet.getRow(rowNumber).getCell(j++).getStringCellValue();
			
				password= sheet.getRow(rowNumber).getCell(j).getStringCellValue();
			
				System.out.println("username: "+username);		
				System.out.println("Password: "+password);	
			}
			
		}catch (IOException e) {
			System.out.println(e.getMessage());
			e.getCause();
			e.printStackTrace();
		}
		return username+"-"+password;
	}
}
