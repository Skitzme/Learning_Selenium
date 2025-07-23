package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestDataFromExcel1 {

	public static List<Map<String, String>> readExcelData(String path, String sheetName) throws IOException {
        List<Map<String, String>> allData = new ArrayList<>();
        DataFormatter formatter = new DataFormatter();

        FileInputStream ip = new FileInputStream(path);
        XSSFWorkbook workbook = new XSSFWorkbook(ip);
        XSSFSheet sheet = workbook.getSheet(sheetName);

        int lastRowIndex = sheet.getLastRowNum();  // last row index (0-based)
        int totalCols = sheet.getRow(0).getLastCellNum();  // total columns

        // Read header row (Row 0)
        XSSFRow headerRow = sheet.getRow(0);
        String[] headers = new String[totalCols];
        for (int c = 0; c < totalCols; c++) {
            headers[c] = formatter.formatCellValue(headerRow.getCell(c));
        }

        // Read data rows
        for (int r = 1; r <= lastRowIndex; r++) {  // start from row 1 (skip header)
            XSSFRow row = sheet.getRow(r);
            Map<String, String> rowData = new HashMap<>();
            for (int c = 0; c < totalCols; c++) {
                String cellValue = formatter.formatCellValue(row.getCell(c));
                rowData.put(headers[c], cellValue);
            }
            allData.add(rowData);
        }

        workbook.close();
        ip.close();

        return allData;
    }

    public static void main(String[] args) throws IOException {
        String path = "./TestData/Book1.xlsx";
        List<Map<String, String>> excelData = readExcelData(path, "Sheet1");

        // Print data
        for (Map<String, String> row : excelData) {
            System.out.println(row);
        }
    }

}
