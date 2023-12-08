package com.BB.test;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.BB.utils.BBWrappers;
import com.BB.utils.Reports;
import com.BB.utils.SeWrappers;

public class LogInTest_Nive extends SeWrappers{

	SeWrappers se = new SeWrappers();
	BBWrappers bb = new BBWrappers();
	Reports repo = new Reports();

	@DataProvider(name="XLData")
	public Object[][] readExcel() throws IOException{
		Object[][] data=null;
		XSSFWorkbook workbook=null;
		try{
			workbook= new XSSFWorkbook(new FileInputStream("D:\\EclipseIDE\\BB_framework\\BBLoginXL.xlsx"));
			XSSFSheet sheet= workbook.getSheet("LoginInValid");
			XSSFRow row= sheet.getRow(0);

			int noOfRows=sheet.getPhysicalNumberOfRows();
			int noOfCells= row.getPhysicalNumberOfCells();

			data= new Object[noOfRows-1][noOfCells];

			for(int i=1; i<noOfRows;i++){
				
				for(int j=0; j<noOfCells;j++){
					String cellValue=sheet.getRow(i).getCell(j).getStringCellValue();
					data[i-1][j]=cellValue; 
				}
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			workbook.close();
		}

		return data;
	}
	@Test(dataProvider="XLData")
	public void LogIn_InValid(String mailid, String pwd){
		try{
			Reports.setTCDesc("Login of BestBuy functionality with Invalid credentials");
			//launchBrowser();
			bb.LogInwrappers(mailid, pwd);
			se.screenshot("LogIn_InValid");
			Assert.assertFalse(false);
		}

		catch(Exception ex){
			ex.printStackTrace();
			System.out.println("Fail to Login with InValid Credentials");
			Reports.reportStep("FAIL", "Problem while Login with Invalid Credentials");
		}
	}

	@AfterMethod
	public void closeBrowser(){
		try{
			driver.close();
			Reports.reportStep("PASS", "Browser closed successfully");
		}
		catch(Exception e){
			System.out.println("Problem in closing the browser");
			Reports.reportStep("FAIL", "Problem in closing the browser");
			e.printStackTrace();
		}
	}
}