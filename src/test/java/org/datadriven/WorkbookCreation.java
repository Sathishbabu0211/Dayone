package org.datadriven;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkbookCreation {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		WebElement draganddrop = driver.findElement(By.id("Skills"));
		draganddrop.click();
		Select select = new Select(draganddrop);
		List<WebElement> options = select.getOptions();
		
		
		File file = new File("C:\\Users\\vigensh\\eclipse-workspace\\FrameWork\\Excel sheet\\New.xlsx");
		Workbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet("Skills");
		for (int i = 0; i < options.size(); i++) {
			WebElement e = options.get(i);
			String text = e.getText();
			
		Row row = sheet.createRow(i);
		Cell cell = row.createCell(0);
		cell.setCellValue(text);
		FileOutputStream stream = new FileOutputStream(file);
		workbook.write(stream);
		
		
		
		
		
	}

}
}