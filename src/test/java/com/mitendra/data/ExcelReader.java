package com.mitendra.data;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import com.mitendra.model.Issue;


public class ExcelReader 
{
    private File filePath;
	public ExcelReader(String s)
	{
		
		filePath = new File(s);
	}

public Issue[] Read() throws IOException
{
	FileInputStream fis = new FileInputStream(filePath);
	XSSFWorkbook workbook = new XSSFWorkbook(fis);
	XSSFSheet sheet = workbook.getSheetAt(0);
	Issue[] issuearr = new Issue[sheet.getLastRowNum()];
	for (int i=1;i<=sheet.getLastRowNum();i++)
	{
	  
	issuearr[i-1] = new Issue((int)sheet.getRow(i).getCell(0).getNumericCellValue(),
				(int)sheet.getRow(i).getCell(1).getNumericCellValue(),
				(int)sheet.getRow(i).getCell(2).getNumericCellValue(),
				(int)sheet.getRow(i).getCell(3).getNumericCellValue(),
				sheet.getRow(i).getCell(4).getStringCellValue(),
				sheet.getRow(i).getCell(5).getStringCellValue(),
				(int)sheet.getRow(i).getCell(6).getNumericCellValue(),
				(int)sheet.getRow(i).getCell(7).getNumericCellValue());
	  
	}
	fis.close();
	System.out.println(issuearr);
	return issuearr;
	
}


}
