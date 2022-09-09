package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public final class HomePage extends BasePage{

	private HomePage() {}
	
	@FindBy(xpath = "button[@id='tab-flight-tab-hp']/span[2]")
	private WebElement flight;
	
	@FindBy(id = "flight-type-roundtrip-label-hp-flight")
	private WebElement roundtrip;
	
	@FindBy(id = "flight-origin-hp-flight")
	private WebElement depart;
	
	@FindBy(id = "flight-origin-hp-flight")
	private WebElement destination;
	
	@FindBy(id = "flight-origin-hp-flight")
	private WebElement departurDate;
	
	@FindBy(id = "flight-origin-hp-flight")
	private WebElement returnDate;

	public WebElement getFlight() {
		return flight;
	}

	public WebElement getDepart() {
		return depart;
	}

	public WebElement getDestination() {
		return destination;
	}

	public WebElement getRoundtrip() {
		return roundtrip;
	}	

}
