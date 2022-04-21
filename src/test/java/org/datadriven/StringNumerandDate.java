package org.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class StringNumerandDate {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\vigensh\\eclipse-workspace\\FrameWork\\Excel sheet\\Sample workspace.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);

		Sheet sheet = workbook.getSheet("sheet");
		/*
		 * Row row = sheet.getRow(4); Cell cell = row.getCell(3);
		 */
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				CellType type = cell.getCellType();

				switch (type) {
				case STRING:
					String text = cell.getStringCellValue();
					System.out.println(text);
					break;

				case NUMERIC:
					/*
					 * double d = cell.getNumericCellValue(); BigDecimal b = BigDecimal.valueOf(d);
					 * String num = b.toString(); System.out.println(num);
					 */
					if (DateUtil.isCellDateFormatted(cell)) {
						Date date = cell.getDateCellValue();
						SimpleDateFormat dateformat = new SimpleDateFormat("dd-MMM-YY");
						String format = dateformat.format(date);
						System.out.println(format);

					} else {
						double d = cell.getNumericCellValue();
						BigDecimal bd = BigDecimal.valueOf(d);
						String num = bd.toString();
						System.out.println(num);

					}
					break;
				}

			}

		}
	}
}