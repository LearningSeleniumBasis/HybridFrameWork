package com.Guru99.BankingApp.Utility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	
	public XSSFWorkbook workbook;
	
	public ExcelDataProvider()
	{
		File file = new File("./TestData/testdataGuru99Bank.xlsx");
		
		try {
			FileInputStream fis = new FileInputStream(file);
			
			workbook = new XSSFWorkbook(fis);
			
		} catch (Exception e) {
			System.out.println("Unable to read Excel file"+e.getMessage());
		} 
		
	}
	
	
	public String getStringData(int indexNo, int row, int column)
	{
		return workbook.getSheetAt(indexNo).getRow(row).getCell(column).getStringCellValue();
	}
	
	public String getStringData(String sheetName, int row, int column)
	{
		return workbook.getSheet(sheetName).getRow(row).getCell(column).getStringCellValue();
	}
	
	public double getNumericData(String sheetName, int row, int column)
	{
		return workbook.getSheet(sheetName).getRow(row).getCell(column).getNumericCellValue();
	}

}
