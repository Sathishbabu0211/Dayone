package org.pom;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

//Pojo class
public class Login extends BaseClass {

	public Login() {
		PageFactory.initElements(driver, this);
	}

	//@CacheLookup
	@FindBys({
	@FindBy(id = "username"), 
	@FindBy(xpath = "//input[@id='username']")

	})
	private WebElement txtEmail;
	
	@CacheLookup
	@FindAll({ @FindBy(id = "password"), @FindBy(id = "pass") })
	
	private WebElement txtpass;

	@CacheLookup
	@FindBy(name = "login")
	
	private WebElement btnlogin;

	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public WebElement getTxtpass() {
		return txtpass;
	}

	public WebElement getBtnlogin() {
		return btnlogin;
	}

}
