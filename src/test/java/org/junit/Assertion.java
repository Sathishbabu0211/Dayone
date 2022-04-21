package org.junit;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertion {
	@Test
	public void tc1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		String currentUrl = driver.getCurrentUrl();
		boolean contains = currentUrl.contains("facebook");
		System.out.println(contains);
		Assert.assertTrue(contains);//pass
		
		WebElement txtusername = driver.findElement(By.id("email"));
		txtusername.sendKeys("Sathish@123");
		String attribute = txtusername.getAttribute("value");
		Assert.assertEquals("Sathish@123", attribute);//pass
		
		
		WebElement txtpass = driver.findElement(By.id("pass"));
		txtpass.sendKeys("12345");
		String attribute2 = txtpass.getAttribute("value");
		Assert.assertEquals("41243", attribute2);//fail

		WebElement btnlogin = driver.findElement(By.name("login"));
		btnlogin.click();
		
		
		
		
		

	}

}
