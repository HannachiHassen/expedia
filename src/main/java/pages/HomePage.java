package pages;

import org.openqa.selenium.By;

import enums.WaitStrategy;

public final class HomePage extends BasePage {

	public HomePage() {
	}

	private final By flight = By.xpath("//span[contains(text(),'Flights')]");
	private final By roundTrip = By.xpath("//span[contains(text(),'Roundtrip')]");
	private final By textboxDeparture = By.xpath("//span[contains(text(),'Leaving from:')]");
	private final By textboxDestination = By.xpath("//div[contains(text(),'Going to')]");
	private final By departurDate = By.cssSelector("#d1-btn");
	private final By returnDate = By.cssSelector("#d2-btn");
	

	public String getTitle() {
		return getPageTitle();
	}

	public HomePage clickFlight() {
		click(flight, WaitStrategy.CLICKABLE, "flight");
		return this;
	}	
	
	public HomePage clicktRoundtrip() {
		click(roundTrip, WaitStrategy.CLICKABLE, "Round Trip");
		return this;
	}

	public HomePage enterDeparture(String departure) {
		sendKeys(textboxDeparture, WaitStrategy.PRESENCE, departure , "Leaving from");
		return this;
	}
	
	public HomePage enterDestination(String destination) {
		sendKeys(textboxDestination, WaitStrategy.PRESENCE, destination ,"Going To");
		return this;
	}

	public HomePage enterDeparturDate() {
		click(departurDate, WaitStrategy.CLICKABLE, "Departure Date");
		return this;
	}

	public HomePage enterReturnDate() {
		click(returnDate, WaitStrategy.CLICKABLE, "Return Date");
		return this;
	}
	
}
