package org.datadriven;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice {
	public static void main(String[] args) throws InvalidFormatException, IOException  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement ddskills = driver.findElement(By.id("skills"));
		ddskills.click();
		Select select = new Select(ddskills);
		List<WebElement> options = select.getOptions();
		
		for (int i = 0; i < options.size(); i++) {
			WebElement element = options.get(i);
			String text = element.getText();
			
			File file = new File("C:\\Users\\vigensh\\eclipse-workspace\\FrameWork\\Excel sheet\\New2.xlsx");
			Workbook workbook = new XSSFWorkbook();
			Sheet sheet = workbook.createSheet("Datas");
			Row rows = sheet.createRow(i);
			rows.createCell(0);
			FileOutputStream stream = new FileOutputStream(file);
			workbook.write(stream);
			
		}
		
		}
		

}
