package demo;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class readingdatafromdata {
	@Test
	public void test() throws Exception {

		FileInputStream fis = new FileInputStream("C:\\Users\\senth\\OneDrive\\vaccan.xlsx");

		Workbook workbook = WorkbookFactory.create(fis);
         
		Sheet sheet = workbook.getSheet("Sheet1"); // safest
		for(int i =1;i<sheet.getLastRowNum();i++) {
		 String VaccanyNmae=	sheet.getRow(i).getCell(1).getStringCellValue();
		 System.out.println(VaccanyNmae);
		}

		
//		Row row = sheet.getRow(1);
//
//		Cell cell = row.getCell(1);
//
//		String vacancyName = cell.getStringCellValue();
//
//		System.out.println(vacancyName);

		workbook.close();
	}
}