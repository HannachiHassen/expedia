package run;

import org.testng.Reporter;
import org.testng.annotations.Test;

import flight.Book_card_info;
import flight.Browser;
import flight.HomePage;

public class Execute extends Browser{
	@Test(priority = 0)
	public void testHomepage () throws InterruptedException {
		HomePage field=new HomePage();
		field.closeChildWindow();
		field.findElementofExpedia();
		field.departurDate();
		field.returnDate();
		field.search_ClosePopupWindow();
		field.departure_Return();
		Reporter.log("Executed Successfully");
	}
  @Test(priority = 1)
  public void passengersInfo() {
	  Book_card_info selec=new Book_card_info();
	  selec.bookingFlight("Taylor", "James", "Cesar"); 
	  Reporter.log("Executed Successfully");
  }
}