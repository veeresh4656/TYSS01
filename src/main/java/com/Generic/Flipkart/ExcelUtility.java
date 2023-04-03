package com.Generic.Flipkart;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.HashMap;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {

	public String readDataFromExcelFile(String SheetName,int Row,int cell) throws Throwable
	{
		FileInputStream fis=new FileInputStream(IPathConstants.FilePath);
		Workbook wb = WorkbookFactory.create(fis);
		String data=wb.getSheet(SheetName).getRow(Row).getCell(cell).getStringCellValue();
	return data;
	}
	
	public void setDataIntoExcelFile(String SheetName,int Row,int cell,String value) throws Throwable
	{
		FileInputStream fis=new FileInputStream(IPathConstants.ExcelPath);
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sh = wb.getSheet(SheetName);
	sh.getRow(Row).createCell(cell).setCellValue(value);
	FileOutputStream fos= new FileOutputStream(IPathConstants.ExcelPath);
	wb.write(fos);
	wb.close();
	}
	
	public HashMap<String, String> readMultipleDataFromExcel(String SheetName) throws Throwable {
		FileInputStream fis=new FileInputStream(IPathConstants.ExcelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(SheetName);
		HashMap<String,String> hm=new HashMap<String,String>();
		for(int i=0;i<=sh.getLastRowNum();i++) {
			String key=sh.getRow(i).getCell(0).getStringCellValue();
			String value=sh.getRow(i).getCell(1).getStringCellValue();
			hm.put(key, value);
		}
		return hm;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
