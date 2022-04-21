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

public class CreateWorkbook {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		WebElement draganddrop = driver.findElement(By.id("Skills"));
		draganddrop.click();
		Select select = new Select(draganddrop);
		List<WebElement> options = select.getOptions();
		for (int i = 0; i < options.size(); i++) {
			WebElement S = options.get(i);
			String text = S.getText();
			System.out.println(text);
		
		File file = new File("C:\\Users\\vigensh\\eclipse-workspace\\FrameWork\\Excel sheet\\Sample workspace.xlsx");
		Workbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet("Data1");
		Row row = sheet.createRow(10);
		Cell cell = row.createCell(0);	
		
	/*	
	for (int j = 0; j < sheet.getPhysicalNumberOfRows(); i++) {
		Row row = sheet.createRow(j);
		for (int k = 0; k < row.getPhysicalNumberOfCells(); j++) {
			Cell cell = row.createCell(k);
			
			System.out.println(cell);
			}*/
		FileOutputStream stream = new FileOutputStream(file);
		workbook.write(stream);
		
		
	}	
		
		
		
		
		
		
		
		
	}

	}
