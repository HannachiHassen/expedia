package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.HomePage;

public final class HomePageTest extends BaseTest{

	private HomePageTest() {}
	
	@Test(dataProvider="PickTestDataProvider")	
    public void reservationFlightTecket(String departureFrom, String goingTo) {    	
    	
    	String title= new HomePage()
    			.enterDeparture(departureFrom)
    			.enterDestination(goingTo)
    			.getTitle();
 
    	Assert.assertEquals(title,"Expedia Travel: Vacation Homes, Hotels, Car Rentals, Flights & More");
	}
	
	@DataProvider(name="PickTestDataProvider", parallel = true)
    public Object[][] getData() {
    	return new Object[][] {
			{"Philadelphia","Madrid"}
			/*{"Admin","admin1234"}
			{"Admin","admin123"},
			{"Admin123","admin1234"}*/
		};    	
    }

}
