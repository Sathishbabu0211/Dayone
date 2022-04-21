package org.pom;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends BaseClass{
	public SelectHotel() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "radiobutton_0")
	private WebElement selectHotel;
	
	@FindBy(id = "continue")
	private WebElement Continue;

	public WebElement getSelectHotel() {
		return selectHotel;
	}

	public WebElement getContinue() {
		return Continue;
	}
	

	
	
	

}
