package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestDataFromExcel {
	public static void main(String[] args) throws IOException {
		String Path = "./TestData/testData.xlsx";

		FileInputStream ip = new FileInputStream(Path);
		XSSFWorkbook workbook = new XSSFWorkbook(ip);
		XSSFSheet sheet = workbook.getSheetAt(0);

		int lastRowIndex = sheet.getLastRowNum();   // Index of last row
		int totalCols = sheet.getRow(0).getLastCellNum();  // Total columns

		DataFormatter formatter = new DataFormatter();

		// Start from row 1 if header is in row 0
		for (int r = 1; r <= lastRowIndex; r++) {
			XSSFRow row = sheet.getRow(r);
			for (int c = 0; c < totalCols; c++) {
				XSSFCell cell = row.getCell(c);
				String value = formatter.formatCellValue(cell);
				System.out.print(value + " | ");
			}
			System.out.println();
		}

		workbook.close();
		ip.close();
	}


}
