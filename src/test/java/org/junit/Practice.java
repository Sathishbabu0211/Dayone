package org.junit;

import java.io.IOException;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;

public class Practice extends BaseClass {
	@Before
	public void before() throws IOException {
		browserConfig();
		openUrl(excelRead("C:\\Users\\vigensh\\eclipse-workspace\\FrameWork\\Excel sheet\\Adactin hotel.xlsx", "data", 8, 0));
		maximizeWin(); 
	}
	/*@After
	public void after() {
		closeBrowser();
*/
	
	@Test
	public void tc1() throws IOException, InterruptedException {
		WebElement txtusername = locateById(excelRead
				("C:\\Users\\vigensh\\eclipse-workspace\\FrameWork\\Excel sheet\\Adactin hotel.xlsx", "data", 0, 0));
		inputText(txtusername, excelRead("C:\\Users\\vigensh\\eclipse-workspace\\FrameWork\\Excel sheet\\Adactin hotel.xlsx", "data", 1, 0));
		WebElement txtpass = locateById(excelRead("C:\\Users\\vigensh\\eclipse-workspace\\FrameWork\\Excel sheet\\Adactin hotel.xlsx", "data", 0, 1));
		inputText(txtpass, excelRead("C:\\Users\\vigensh\\eclipse-workspace\\FrameWork\\Excel sheet\\Adactin hotel.xlsx", "data", 1, 1));
		WebElement btnclick = locateById(excelRead("C:\\Users\\vigensh\\eclipse-workspace\\FrameWork\\Excel sheet\\Adactin hotel.xlsx", "data", 9,0));
		click(btnclick);
		
		WebElement txtlocation = locateById(excelRead("C:\\Users\\vigensh\\eclipse-workspace\\FrameWork\\Excel sheet\\Adactin hotel.xlsx", "data", 11, 0));
		click(txtlocation);
		ddByVisibleText(txtlocation, excelRead("C:\\Users\\vigensh\\eclipse-workspace\\FrameWork\\Excel sheet\\Adactin hotel.xlsx", "data", 12, 0));
		
		WebElement ddhotel = locateById(excelRead("C:\\Users\\vigensh\\eclipse-workspace\\FrameWork\\Excel sheet\\Adactin hotel.xlsx", "data", 13, 0));
		ddByVisibleText(ddhotel, excelRead("C:\\Users\\vigensh\\eclipse-workspace\\FrameWork\\Excel sheet\\Adactin hotel.xlsx", "data", 14, 0));
		
		WebElement ddrooms = locateById(excelRead("C:\\Users\\vigensh\\eclipse-workspace\\FrameWork\\Excel sheet\\Adactin hotel.xlsx", "data", 15, 0));
		ddByVisibleText(ddrooms, excelRead("C:\\Users\\vigensh\\eclipse-workspace\\FrameWork\\Excel sheet\\Adactin hotel.xlsx", "data", 16, 0));
		Thread.sleep(3000);
		
		WebElement ddroomnum = locateById(excelRead("C:\\Users\\vigensh\\eclipse-workspace\\FrameWork\\Excel sheet\\Adactin hotel.xlsx", "data", 17, 0));
		ddByIndex(ddroomnum, 4); 
		
		WebElement txtindate = locateById(excelRead("C:\\Users\\vigensh\\eclipse-workspace\\FrameWork\\Excel sheet\\Adactin hotel.xlsx", "data", 19, 0));
		inputText(txtindate, excelRead("C:\\Users\\vigensh\\eclipse-workspace\\FrameWork\\Excel sheet\\Adactin hotel.xlsx", "data", 20, 0));
		
		WebElement txtoutdate = locateById(excelRead("C:\\Users\\vigensh\\eclipse-workspace\\FrameWork\\Excel sheet\\Adactin hotel.xlsx", "data", 11, 1));
		inputText(txtoutdate, excelRead("C:\\Users\\vigensh\\eclipse-workspace\\FrameWork\\Excel sheet\\Adactin hotel.xlsx", "data", 12, 1));
		
		
		WebElement ddadultroom = locateById(excelRead("C:\\Users\\vigensh\\eclipse-workspace\\FrameWork\\Excel sheet\\Adactin hotel.xlsx", "data", 13, 1));
		ddByIndex(ddadultroom, 3);
		
		WebElement ddchildroom = locateById(excelRead("C:\\Users\\vigensh\\eclipse-workspace\\FrameWork\\Excel sheet\\Adactin hotel.xlsx", "data", 15, 1));
		ddByIndex(ddchildroom, 3);
		
		WebElement btnsearch = locateById(excelRead("C:\\Users\\vigensh\\eclipse-workspace\\FrameWork\\Excel sheet\\Adactin hotel.xlsx", "data", 17, 1));
		click(btnsearch);
		
		WebElement btnradio = locateById("radiobutton_0");
		click(btnradio);
		
		WebElement btncontinue = locateById("continue");
		click(btncontinue);
		
		WebElement txtfirstname = locateById("first_name");
		inputText(txtfirstname, excelRead("C:\\Users\\vigensh\\eclipse-workspace\\FrameWork\\Excel sheet\\Adactin hotel.xlsx", "data", 1, 6));
		
		WebElement txtlastname = locateById("last_name");
		inputText(txtlastname, excelRead("C:\\Users\\vigensh\\eclipse-workspace\\FrameWork\\Excel sheet\\Adactin hotel.xlsx", "data", 1, 7));
		
		WebElement txtaddress = locateById("address");
		inputText(txtaddress, excelRead("C:\\Users\\vigensh\\eclipse-workspace\\FrameWork\\Excel sheet\\Adactin hotel.xlsx", "data", 1, 8));
		
		WebElement txtcreditcard = locateById("cc_num");
		inputText(txtcreditcard, excelRead("C:\\Users\\vigensh\\eclipse-workspace\\FrameWork\\Excel sheet\\Adactin hotel.xlsx", "data", 1, 9));
		
		WebElement ddcardtype = locateById("cc_type");
		ddByVisibleText(ddcardtype, "VISA");
		
		WebElement ddexpmonth = locateById("cc_exp_month");
		ddByIndex(ddexpmonth, 3);
		
		WebElement ddexpyear = locateById("cc_exp_year");
		ddByVisibleText(ddexpyear, "2022");
		
		WebElement txtCVV = locateById("cc_cvv");
		inputText(txtCVV, excelRead("C:\\Users\\vigensh\\eclipse-workspace\\FrameWork\\Excel sheet\\Adactin hotel.xlsx", "data", 1, 10));
		
		WebElement btnbook = locateById("book_now");
		click(btnbook);
		
		WebElement btnlogout = locateByxPath("//a[text()='Logout']");
		click(btnlogout);
		


	}
	}
			