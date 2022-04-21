package org.pom;

import org.baseclass.BaseClass;

public class Main extends BaseClass {
	public static void main(String[] args) {

		browserConfig();
		openUrl("http://adactinhotelapp.com/");
		maximizeWin();
		implicitWait(30);
		
		//Login
		Login L = new Login();
		inputText(L.getTxtEmail(), "sathishbabu");
		driver.navigate().refresh();
		inputText(L.getTxtEmail(), "sathishbabu0211");
		inputText(L.getTxtpass(), "coimbatore");
		click(L.getBtnlogin());

		// Search Hotel page
		SearchHotel h = new SearchHotel();
		ddByIndex(h.getLocation(), 3);
		ddByIndex(h.getHotels(), 2);
		ddByIndex(h.getRoomtype(), 4);
		ddByIndex(h.getRooms(), 3);
		inputText(h.getCheckInDate(), "14/05/2022");
		inputText(h.getCheckOutDate(), "16/05/2022");
		ddByIndex(h.getAdultPerRoom(), 3);
		ddByIndex(h.getChildPerRoom(), 2);
		click(h.getSearch());

		// Select Hotel
		SelectHotel H = new SelectHotel();
		click(H.getSelectHotel());
		click(H.getContinue());

		//BookHotel
		BookHotel b = new BookHotel();
		inputText(b.getFirstName(), "Sathish");
		inputText(b.getLastName(), "Babu");
		inputText(b.getAddress(), "Coimbatore");
		inputText(b.getCardNum(), "1234567891234567");
		ddByIndex(b.getCardType(), 2);
		ddByIndex(b.getExpiryMonth(), 4);
		ddByIndex(b.getExpiryYear(), 4);
		inputText(b.getCvvNum(), "322");
		click(b.getBookNow());

		// Booking confirmation page
		BookingConfirmation c = new BookingConfirmation();
		click(c.getLogout());
	}
}
