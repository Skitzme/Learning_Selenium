package utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestDataFromExcel2 {

	public static List<Map<String, String>> testData(String path, String sheetName) throws IOException
	{
		FileInputStream ip=new FileInputStream(path);
		DataFormatter formatter=new DataFormatter();
		List<Map<String,String>> allDatas=new ArrayList<>();
		 

		XSSFWorkbook workbook=new XSSFWorkbook(ip);
		XSSFSheet sheet=	workbook.getSheet(sheetName);
		int lastRowIndex=	sheet.getLastRowNum();
		int totalCol=		sheet.getRow(0).getLastCellNum();
		
		// Read header row (Row 0)
		
		XSSFRow headerRow	=sheet.getRow(0);
		String[] headers=new String[totalCol];
		for(int c=0;c<totalCol;c++)
		{
		headers[c]	=formatter.formatCellValue(headerRow.getCell(c));
		}
		
		 // Read data rows
		
		for(int r=1;r<=lastRowIndex;r++)
		{
			XSSFRow row=sheet.getRow(r);
			
			 Map<String, String> rowData = new HashMap<>();
				for(int c=0;c<totalCol;c++)
				{
					String cellValue=formatter.formatCellValue(row.getCell(c));
					
					rowData.put(headers[c], cellValue);
				}
			allDatas.add(rowData);
		}
		workbook.close();
		ip.close();

		return allDatas;

	}
	
	public static void writeCell(String path, String sheetName) throws IOException
	{
		FileInputStream ip=new FileInputStream(path);
		XSSFWorkbook workbook=new XSSFWorkbook(ip);
		XSSFSheet sheet=workbook.getSheet(sheetName);
		XSSFRow row=	sheet.createRow(4);
		row.createCell(0).setCellValue("sarath");
		row.createCell(1).setCellValue("33");
		FileOutputStream op=new FileOutputStream(path);
		workbook.write(op);
		workbook.close();
		op.close();
		
	}
	public static void main(String[] args) throws IOException {
		/*
		 * excelData=testData(path, "Sheet1");
		 * for(Map<String,String> data:excelData) { System.out.println(data); }
		 */
		String path = "./TestData/Book1.xlsx"; 
		writeCell(path, "sheet1");
	}

}
