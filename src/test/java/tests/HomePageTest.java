package tests;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import annotations.FrameworkAnnotation;
import enums.CategoryType;
import enums.DeviceType;
import pages.HomePage;

public final class HomePageTest extends BaseTest{

	private HomePageTest() {}
	
	@FrameworkAnnotation(author = { "Hassen", "Mokran" }, category = { CategoryType.REGRESSION,
			CategoryType.MINIREGRESSION }, device = { DeviceType.FIREFOX, DeviceType.CHROME })
	@Test
    public void flightTicketTest(Map<String, String> data) {   	
    	
    	String title= new HomePage()
    			.clickFlight()
    			.clicktRoundtrip()
    			.enterDeparture(data.get("departure")).enterDestination(data.get("destination"))
    			.getTitle();
 
    	Assert.assertEquals(title,"Expedia Travel: Vacation Homes, Hotels, Car Rentals, Flights & More");
	}
	
	@FrameworkAnnotation(author = { "Hassen" }, category = { CategoryType.REGRESSION,
			CategoryType.SANITY}, device = { DeviceType.FIREFOX })
	@Test
	public void newTest(Map<String, String> data) {

		String title= new HomePage()
    			.clickFlight()
    			.clicktRoundtrip()
    			.enterDeparture(data.get("departure")).enterDestination(data.get("destination"))
    			.getTitle();

		Assert.assertEquals(title,"Expedia Travel: Vacation Homes, Hotels, Car Rentals, Flights & More");
	}
}
