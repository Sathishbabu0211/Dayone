package org.autamationtesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RowsandCells {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\vigensh\\eclipse-workspace\\FrameWork\\Excel sheet\\Sample workspace.xlsx");

		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet("Sheet");
	/*	Row row = sheet.getRow(2);
		Cell cell = row.getCell(4);
*/
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row2 = sheet.getRow(i);
			//System.out.println(row2);
			for (int j = 0; j < row2.getPhysicalNumberOfCells(); j++) {
				Cell cell2 = row2.getCell(j);
				System.out.println(cell2);
				System.out.println("All row");
			}
			
		}		
			}
		
		
			}

		