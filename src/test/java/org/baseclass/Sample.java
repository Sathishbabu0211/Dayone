package org.baseclass;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class Sample extends BaseClass {
	public static void main(String[] args) throws IOException, InterruptedException {
		Sample S = new Sample();
		S.browserConfig();
		S.openUrl(S.excelRead("C:\\Users\\vigensh\\eclipse-workspace\\FrameWork\\Excel sheet\\Adactin hotel.xlsx", "data", 8, 0));
		S.maximizeWin();
		
		//WebElement txtnewuser = S.xPath("//a[contains(text(),'New User Register Here')]");
		//S.click(txtnewuser);
	/*		
		WebElement txtusername = S.locateById("username");
		S.inputText(txtusername, S.excelRead("C:\\Users\\vigensh\\eclipse-workspace\\FrameWork\\Excel sheet\\Sample workspace.xlsx", "Datas", 1, 0));
		WebElement txtpass = S.locateById("password");
		S.inputText(txtpass
				, S.excelRead("C:\\Users\\vigensh\\eclipse-workspace\\FrameWork\\Excel sheet\\Sample workspace.xlsx", "Datas", 1, 1));
		WebElement txtconfirmpass = S.locateById("re_password");
		S.inputText(txtconfirmpass, S.excelRead("C:\\Users\\vigensh\\eclipse-workspace\\FrameWork\\Excel sheet\\Sample workspace.xlsx", "Datas", 1, 1));
		WebElement txtfullname = S.locateById("full_name");
		S.inputText(txtfullname, S.excelRead("C:\\\\Users\\\\vigensh\\\\eclipse-workspace\\\\FrameWork\\\\Excel sheet\\\\Sample workspace.xlsx", "Datas", 6, 0));
		WebElement txtemail = S.locateById("email_add");
		S.inputText(txtemail, S.excelRead("C:\\Users\\vigensh\\eclipse-workspace\\FrameWork\\Excel sheet\\Sample workspace.xlsx", "Datas", 6, 1));
		WebElement btnlogin = S.locateByName("login");
		S.click(btnlogin);
*/
		WebElement txtusername = S.locateById("username");
		S.inputText(txtusername, S.excelRead("C:\\Users\\vigensh\\eclipse-workspace\\FrameWork\\Excel sheet\\Adactin hotel.xlsx", "data", 1, 0));
		WebElement txtpass = S.locateById("password");
		S.inputText(txtpass, S.excelRead("C:\\\\Users\\\\vigensh\\\\eclipse-workspace\\\\FrameWork\\\\Excel sheet\\\\Adactin hotel.xlsx", "data", 1, 1));
		WebElement btnlogin = S.locateById("login");
		S.click(btnlogin);
		
		WebElement txtlocation = S.locateById("location");
		S.click(txtlocation);
		
		WebElement ddlocation = S.locateById("location");
		S.ddByVisibleText(ddlocation, "Melbourne");
		
		WebElement ddhotel = S.locateById("hotels");
		S.ddByVisibleText(ddhotel, "Hotel Cornice");
		
		WebElement ddrooms = S.locateById("room_type");
		S.ddByVisibleText(ddrooms, "Deluxe");
		Thread.sleep(3000);
		
		WebElement ddroomnum = S.locateById("room_nos");
		S.ddByIndex(ddroomnum, 3);
		
		WebElement txtindate = S.locateById("datepick_in");
		S.inputText(txtindate, "16/05/2022");
		
		WebElement txtoutdate = S.locateById("datepick_out");
		S.inputText(txtoutdate, "18/05/2022");
		
		
		WebElement ddadultroom = S.locateById("adult_room");
		S.ddByIndex(ddadultroom, 2);
		
		WebElement ddchildroom = S.locateById("child_room");
		S.ddByIndex(ddchildroom, 2);
		
		WebElement btnsearch = S.locateById("Submit");
		S.click(btnsearch);
		
		WebElement btnradio = S.locateById("radiobutton_0");
		S.click(btnradio);
		
		WebElement btncontinue = S.locateById("continue");
		S.click(btncontinue);
		
		WebElement txtfirstname = S.locateById("first_name");
		S.inputText(txtfirstname, S.excelRead("C:\\Users\\vigensh\\eclipse-workspace\\FrameWork\\Excel sheet\\Adactin hotel.xlsx", "data", 1, 6));
		
		WebElement txtlastname = S.locateById("last_name");
		S.inputText(txtlastname, S.excelRead("C:\\Users\\vigensh\\eclipse-workspace\\FrameWork\\Excel sheet\\Adactin hotel.xlsx", "data", 1, 7));
		
		WebElement txtaddress = S.locateById("address");
		S.inputText(txtaddress, S.excelRead("C:\\Users\\vigensh\\eclipse-workspace\\FrameWork\\Excel sheet\\Adactin hotel.xlsx", "data", 1, 8));
		
		WebElement txtcreditcard = S.locateById("cc_num");
		S.inputText(txtcreditcard, S.excelRead("C:\\Users\\vigensh\\eclipse-workspace\\FrameWork\\Excel sheet\\Adactin hotel.xlsx", "data", 1, 9));
		
		WebElement ddcardtype = S.locateById("cc_type");
		S.ddByVisibleText(ddcardtype, "VISA");
		
		WebElement ddexpmonth = S.locateById("cc_exp_month");
		S.ddByIndex(ddexpmonth, 3);
		
		WebElement ddexpyear = S.locateById("cc_exp_year");
		S.ddByVisibleText(ddexpyear, "2022");
		
		WebElement txtCVV = S.locateById("cc_cvv");
		S.inputText(txtCVV, S.excelRead("C:\\Users\\vigensh\\eclipse-workspace\\FrameWork\\Excel sheet\\Adactin hotel.xlsx", "data", 1, 10));
		
		WebElement btnbook = S.locateById("book_now");
		S.click(btnbook);
		
		WebElement btnlogout = S.locateByxPath("//a[text()='Logout']");
		S.click(btnlogout);
		
		
		
		
		
		
		
		
		
		
		
		}

}
