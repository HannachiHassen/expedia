package flight;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HomePage  extends Browser{	
	
@Test(priority = 0)
public void closeChildWindow() {
	String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
	String subWindowHandler = null;
	
	System.out.println("Main window Title: "+ driver.switchTo().window(parentWindowHandler).getTitle());
	System.out.println("Main window URL is: "+driver.switchTo().window(parentWindowHandler).getCurrentUrl());

	Set<String> handles = driver.getWindowHandles(); // get all window handles
	System.err.println("No of windows :  " + handles.size());
	Iterator<String> iterator = handles.iterator();
	   while (iterator.hasNext()){
		   subWindowHandler = iterator.next();
	   }
	  driver.switchTo().window(subWindowHandler); // switch to popup window
	  // Now you are in the popup window, perform necessary actions here
	    System.out.println("Popus URL is: "+driver.switchTo().window(subWindowHandler).getCurrentUrl());
	    System.out.println("Popups Title: "+ driver.switchTo().window(subWindowHandler).getTitle().contains(subWindowHandler));
      	driver.close();
       	driver.switchTo().window(parentWindowHandler);  // switch back to parent window
    }
	
@Test (priority = 1)
public void findElementofExpedia(){
	//Locate flight button element 
    WebElement flight=driver.findElement(By.xpath("//button[@id='tab-flight-tab-hp']/span[2]"));
    flight.click();
    
    //Locate flight round trip button element 
	WebElement roundtrip=driver.findElement(By.id("flight-type-roundtrip-label-hp-flight"));
	roundtrip.click();
	
	//Locate Departure button element 
	WebElement depart=driver.findElement(By.id("flight-origin-hp-flight"));
	if(depart.isDisplayed() && depart.isEnabled()) {
		depart.click();
		depart.sendKeys("Philadelphia, PA (PHL-Philadelphia Intl.)");
	}
	
	
	//Locate Destination button element
	WebElement destination=driver.findElement(By.id("flight-destination-hp-flight"));
	if(destination.isDisplayed() && destination.isEnabled()) {
		destination.click();
		destination.sendKeys("New York, NY (JFK-John F. Kennedy Intl.)");
	 }		
 }
@Test(priority = 2)	
public void departurDate() {
	driver.findElement(By.id("flight-departing-hp-flight")).click();	
	String month="May 2020";
	String exp_date="26";
		
	while(true) {
	String text=driver.findElement(By.xpath("//caption")).getText();
	  if(text.equals(month)) {
	     break;
      } else {
	   driver.findElement(By.xpath("//div[@class='datepicker-cal']//button[2]")).click();
     }
   }
	
   List<WebElement> allDate=driver.findElements(By.xpath("//div[@class='datepicker-cal']//div[2]//table[1]//tbody[1]//tr//td//button[1]"));
   for(WebElement ele:allDate) {
	   String date_text=ele.getText();
	   String date[]=date_text.split("\n");	
	   if(date[1].equals(exp_date)) {
		   ele.click();
		   break;
	      }
   }
	//Wait for 4 Seconds to see Today's date selected.
	    try {
	        Thread.sleep(3000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	}
}

@Test(priority = 3)	
public void returnDate() {
	driver.findElement(By.xpath("//input[@id='flight-returning-hp-flight']")).click();
	String month="Jun 2020";
	String exp_date="29";
		
	while(true) {
	String text=driver.findElement(By.xpath("//caption")).getText();
	  if(text.equals(month)) {
	     break;
     } else {
	   driver.findElement(By.xpath("//*[@id='flight-returning-wrapper-hp-flight']/div/div[2]/button[2]")).click();
    }
  }
	
  List<WebElement> allDate=driver.findElements(By.xpath("//div[@class='datepicker-cal']//div[2]//table[1]//tbody[1]//tr//td//button[1]"));
  for(WebElement ele:allDate) {
	   String date_text=ele.getText();
	   String date[]=date_text.split("\n");	
	   if(date[1].equals(exp_date)) {
		   ele.click();
		   break;
	      }
   }
	//Wait for 4 Seconds to see Today's date selected.
	    try {
	        Thread.sleep(2000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
 }

/*
  @Test(priority = 3)
  public void travelers() {
	driver.findElement(By.xpath("//*[@id='traveler-selector-hp-flight']/div/ul/li/button")).click();
	
	String traveler_number="2";
	while(true) {
	String text=driver.findElement(By.xpath("//span")).getText();
	  if(text.equals(traveler_number)) {
	     break;
      }
	  driver.findElement(By.cssSelector("button.uitk-step-input-button.uitk-step-input-plus > span.uitk-icon > svg.uitk-icon-svg.uitk-step-input-icon")).click();
   }
}
 */

@Test(priority = 4)
public void search_ClosePopupWindow() {
	driver.findElement(By.xpath("//form[@id='gcw-flights-form-hp-flight']//button[@class='btn-primary btn-action gcw-submit']")).click();
	
	String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
	String subWindowHandler = null;
	
	System.out.println("Main window Title: "+ driver.switchTo().window(parentWindowHandler).getTitle());
	System.out.println("Main window URL is: "+driver.switchTo().window(parentWindowHandler).getCurrentUrl());

	Set<String> handles = driver.getWindowHandles(); // get all window handles
	System.err.println("No of windows :  " + handles.size());
	Iterator<String> iterator = handles.iterator();
	   while (iterator.hasNext()){
		   subWindowHandler = iterator.next();
	   }
	  driver.switchTo().window(subWindowHandler); // switch to popup window
	  // Now you are in the popup window, perform necessary actions here
	    System.out.println("Popus URL is: "+driver.switchTo().window(subWindowHandler).getCurrentUrl());
	    System.out.println("Popups Title: "+ driver.switchTo().window(subWindowHandler).getTitle().contains(subWindowHandler));
      	driver.close();
       	driver.switchTo().window(parentWindowHandler);  // switch back to parent window
    }
@Test(priority = 5)
public void departure_Return() {
    //Select departure flight
	driver.findElement(By.xpath("//li[1]//div[1]//div[1]//div[2]//div[1]//div[2]//button[1]")).click();
	driver.findElement(By.xpath("//div[@class='toggle-pane fade open']//button[1]")).click();
	//Select return flight
	driver.findElement(By.xpath("//li[1]//div[1]//div[1]//div[2]//div[1]//div[2]//button[1]")).click();
	driver.findElement(By.xpath("//div[@class='toggle-pane fade open']//button[@class='btn-secondary btn-action t-select-btn']")).click();
}

}    
