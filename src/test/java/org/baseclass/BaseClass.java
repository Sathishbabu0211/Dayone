package org.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.NoSuchElementException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	Actions action;

	public  static void browserConfig() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void openUrl(String url) {
		driver.get(url);
	}

	public static void maximizeWin() {
		driver.manage().window().maximize();
	}

	public WebElement locateById(String id) {
		WebElement login = driver.findElement(By.id(id));
		return login;
	}

	public WebElement locateByName(String name) {
		WebElement findElement = driver.findElement(By.name(name));
		return findElement;
	}

	public static void inputText(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void click(WebElement element) {
		element.click();
	}

	public void closeBrowser() {
		driver.close();
	}

	public void quitBrowser() {
		driver.quit();
	}

	public void rightClick() {
		action = new Actions(driver);
		action.contextClick();
	}

	public void doubleClick() {
		action.doubleClick();
	}

	private void moveToElement(WebElement target) {
		action.moveToElement(target).perform();
	}

	public void pageNavigateTo(String url) {
		driver.navigate().to(url);
	}

	public void pageBackward() {
		driver.navigate().back();
	}

	public void pageRefresh() {
		driver.navigate().refresh();
	}

	public void pageForwad() {
		driver.navigate().forward();
	}

	public String excelRead(String path, String sheet, int rowIndex, int cellIndex) throws IOException {
		String value = null;
		File file = new File(path);
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);

		Sheet S = workbook.getSheet(sheet);
		Row row = S.getRow(rowIndex);
		Cell cell = row.getCell(cellIndex);
		CellType celltype = cell.getCellType();
		System.out.println("Cell Type :" + celltype);

		switch (celltype) {
		case STRING:
			value = cell.getStringCellValue();
			System.out.println(value);
			break;

		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
				Date date = cell.getDateCellValue();
				SimpleDateFormat dateformat = new SimpleDateFormat("dd-MMM-YY");
				value = dateformat.format(date);
				System.out.println(value);

			} else {
				double d = cell.getNumericCellValue();
				BigDecimal bd = BigDecimal.valueOf(d);
				value = bd.toString();
				System.out.println(value);

			}
			break;
		}
		return value;

	}

	public void excelWrite(String path, String sheet, int rowindex, int cellindex, String value) throws IOException {
		File file = new File(path);
		Workbook workbook = new XSSFWorkbook();
		Sheet S = workbook.createSheet(sheet);
		Row row = S.getRow(rowindex);
		Cell cell = row.getCell(cellindex);
		cell.setCellValue(value);
		FileOutputStream stream = new FileOutputStream(file);
	}

	public String getTheText(WebElement element) {
		String text = element.getText();
		return text;
	}

	public String getAttribute(WebElement element, String value) {
		String attribute = element.getAttribute(value);
		return attribute;
	}

	public static Select ddByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
		return select;

	}

	public Select ddByValue(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
		return select;

	}

	public Select ddByVisibleText(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByVisibleText(value);
		return select;

	}

	public Select ddByGetOptions(WebElement element) {
		Select select = new Select(element);
		select.getOptions();
		return select;
	}

	public Select ddByFirstSelectedOptions(WebElement element) {
		Select select = new Select(element);
		select.getAllSelectedOptions();
		return select;
	}

	public Select ddByAllSelectedOptions(WebElement element) {
		Select select = new Select(element);
		select.getAllSelectedOptions();
		return select;

	}

	public Select ddByIsMultiple(WebElement element) {
		Select select = new Select(element);
		select.isMultiple();
		return select;
	}

	public Select ddByDeSelectByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.deselectByIndex(index);
		return select;
	}

	public Select ddByDeSelectByValue(WebElement element, String value) {
		Select select = new Select(element);
		select.deselectByValue(value);
		return select;

	}

	public Select ddByDeSelectByVisibleText(WebElement element, String value) {
		Select select = new Select(element);
		select.deselectByVisibleText(value);
		return select;
	}

	public Select ddByDeSelectAll(WebElement element) {
		Select select = new Select(element);
		select.deselectAll();
		return select;

	}

	public Actions mouseOverAction(WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		return action;
	}

	public Actions dragAndDrop(WebElement source, WebElement destination) {
		Actions action = new Actions(driver);
		action.dragAndDrop(source, destination);
		return action;

	}

	public Robot robotKeyPress(int arguements) throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(arguements);
		return robot;
	}

	public Robot robotKeyRelease(int arguement) throws AWTException {
		Robot robot = new Robot();
		robot.keyRelease(arguement);
		return robot;
	}

	public Actions actionKeyDown(WebElement element, String value) {
		Actions action = new Actions(driver);
		action.keyDown(element, value);
		return action;

	}

	public void actionKeyUp(WebElement element, String value) {
		Actions action = new Actions(driver);
		action.keyUp(element, value);

	}

	public void actionSendKeys(WebElement element, String value) {
		Actions action = new Actions(driver);
		action.sendKeys(element, value);
	}

	public  static void implicitWait(long seconds) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));

	}

	public WebDriverWait webDirverWait(long seconds) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
		return wait;

	}

	public WebElement locateByxPath(String value) {
		WebElement findElement = driver.findElement(By.xpath(value));
		return findElement;
	}

	public void frameByStringId(String value, String value1) {
		driver.findElement(By.xpath(value));
		driver.switchTo().frame(value1);
	}

	public void frameByStringName(String value, String value1) {
		driver.findElement(By.xpath(value));
		driver.switchTo().frame(value1);
	}

	public void frameByIndex(String value, int index) {
		driver.findElement(By.xpath(value));
		driver.switchTo().frame(index);
	}

	public void frameByWebElement(String value, WebElement element) {
		driver.findElement(By.xpath(value));
		driver.switchTo().frame(element);
}
}

