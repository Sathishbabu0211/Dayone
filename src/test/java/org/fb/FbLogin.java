package org.fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FbLogin {
	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
		 
		 
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
		 
		 WebElement txtemail = driver.findElement(By.id("email"));
		 txtemail.sendKeys("sathish@123");
		 WebElement txtpass = driver.findElement(By.id("pass"));
		 txtpass.sendKeys("afarerad");
		 WebElement btnlogin = driver.findElement(By.name("login"));
		 btnlogin.click();
		 
		 
		 
		 
		 
	
		 
	
		 
	}

}
