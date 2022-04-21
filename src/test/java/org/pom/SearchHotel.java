package org.pom;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel extends BaseClass{
	public SearchHotel() {
		PageFactory.initElements(driver, this);
	}
	@FindAll({
		@FindBy(id = "location"), @FindBy(name = "location")
	})
	
	private WebElement location;
	@FindBy(id ="hotels")
	private  WebElement hotels;
	@FindBy(id="room_type")
	private WebElement roomtype;
	@FindBy(id = "room_nos")
	private WebElement rooms;
	@FindBy(id = "datepick_in")
	private WebElement checkInDate;
	@FindBy(id = "datepick_out")
	private WebElement checkOutDate;
	@FindBy(id ="adult_room")
	private WebElement adultPerRoom;
	@FindBy(id = "child_room")
	private WebElement childPerRoom;
	@FindBy(id = "Submit")
	private WebElement search;
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotels() {
		return hotels;
	}
	public WebElement getRoomtype() {
		return roomtype;
	}
	public WebElement getRooms() {
		return rooms;
	}
	public WebElement getCheckInDate() {
		return checkInDate;
	}
	public WebElement getCheckOutDate() {
		return checkOutDate;
	}
	public WebElement getAdultPerRoom() {
		return adultPerRoom;
	}
	public WebElement getChildPerRoom() {
		return childPerRoom;
	}
	public WebElement getSearch() {
		return search;
	}

}
