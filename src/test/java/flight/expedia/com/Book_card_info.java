package flight.expedia.com;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Book_card_info extends Browser {
	@Test(priority = 0)
	public void bookingFlight(String frist_name,String midlle_name,String last_name) {
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
		  
	      driver.switchTo().window(parentWindowHandler);  // switch back to parent window
	      driver.close();
		  driver.switchTo().window(subWindowHandler); // switch to popup window
	    
		  /*
		  //use this section if you want to choose other then economy class set like main cabin, first class
		  WebElement maincabin=driver.findElement(By.xpath("//input[@name='brandedFareSelect-1Out']"));
		    maincabin.click();
			  if(maincabin.isSelected()){
				  System.out.println("Checkbox for Main Cabin is Toggled on");
			  }else {
				  System.out.println("Checkbox for Main Cabin is Toggled off");
			  }
			  //Wait for 4 Seconds to see Main Cabin's radio button selected.
			    try {
			        Thread.sleep(2000);
			    } catch (InterruptedException e) {
			        e.printStackTrace();
			    }	  
		  WebElement maincabin2=driver.findElement(By.xpath("//input[@name='brandedFareSelect-1In']"));
		         maincabin2.click();
				  if(maincabin2.isSelected()){
					  System.out.println("Checkbox for Main Cabin is Toggled on");
				  }else {
					  System.out.println("Checkbox for Main Cabin is Toggled off");
				  }
				  //Wait for 4 Seconds to see Main Cabin's radio button selected.
				    try {
				        Thread.sleep(2000);
				    } catch (InterruptedException e) {
				        e.printStackTrace();
				    } 
				    
				    */
		  //scroll to the bottom of the page and click on booking button
		    JavascriptExecutor jse = (JavascriptExecutor)driver;
		    jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		    
		     driver.findElement(By.xpath("//*[@id='bookButton']")).click();
		     
			//File passenge informatins(first name,last name, country, phone,
			WebElement first=driver.findElement(By.id("firstname[0]"));
			if(first.isDisplayed() && first.isEnabled()) {
				first.sendKeys(frist_name); 
			 }
			//middlename
			WebElement midl=driver.findElement(By.id("middlename[0]"));
			if(midl.isDisplayed() && midl.isEnabled()) {
				midl.sendKeys(midlle_name); 
			 }	
			//last name
			WebElement last=driver.findElement(By.id("lastname[0]"));
			 if(last.isDisplayed() && last.isEnabled()) {
				last.sendKeys(last_name); 	
			 }
			 //country/Territory code
			 Select Country= new Select(driver.findElement(By.id("country_code[0]")));
		     Country.selectByVisibleText("Canada +1"); 
		     //phone number
		     WebElement phone=driver.findElement(By.id("phone-number[0]"));
			 if(phone.isDisplayed() && phone.isEnabled()) {
				phone.sendKeys("6875969997"); 	
			 }
			 WebElement chkTextAlert=driver.findElement(By.xpath("//*[@id='confirmation-sms-provider-checkbox']"));
			 for(int i=0;i<2;i++) {
				 chkTextAlert.click();
				 System.out.println(chkTextAlert.isSelected());
			 }
			 //click on radio button for male
			 WebElement radiobutton=driver.findElement(By.xpath("//*[@value='MALE']"));
			  radiobutton.click();
			  if(radiobutton.isSelected()){
				  System.out.println("Checkbox for Gender is Toggled on");
			  }else {
				  System.out.println("Checkbox for Gender is Toggled off");
			  }
			  
			  Select monthbrth= new Select(driver.findElement(By.id("date_of_birth_month0")));
			     monthbrth.selectByIndex(8);
			  Select daybrth= new Select(driver.findElement(By.id("date_of_birth_day[0]")));
			     daybrth.selectByVisibleText("22");
			  Select yearbrth= new Select(driver.findElement(By.id("date_of_birth_year[0]")));
			     yearbrth.selectByVisibleText("1989");
			     
			  //passnger card informations
			  WebElement nameoncard=driver.findElement(By.xpath("//*[@class='text billing-cardholder-name cko-field cardholder-above-cardname gb-whitelist']"));
			  if(nameoncard.isDisplayed() && nameoncard.isEnabled()) {
				nameoncard.sendKeys("Tayler Cesar"); 	
			   }    
			 WebElement cardnumber=driver.findElement(By.xpath("//input[@id='creditCardInput']"));
			   if(cardnumber.isDisplayed() && cardnumber.isEnabled()) {
				cardnumber.sendKeys("4111111111111111"); 	
			   }    
			 Select expirmont= new Select(driver.findElement(By.xpath("//*[@name='creditCards[0].expiration_month']")));
			   expirmont.selectByVisibleText("04-Apr");
			 Select expiryera= new Select(driver.findElement(By.xpath("//*[@name='creditCards[0].expiration_year']")));
			   expiryera.selectByVisibleText("2025");
			   
			   WebElement securitycode=driver.findElement(By.xpath("//*[@id='new_cc_security_code']"));
			   if(securitycode.isDisplayed() && securitycode.isEnabled()) {
				securitycode.sendKeys("987"); 	
			   }  
			   Select billingcountry= new Select(driver.findElement(By.xpath("//*[@name='creditCards[0].country']")));
			   billingcountry.selectByVisibleText("United Kingdom");
			   
			   WebElement billinAddress=driver.findElement(By.xpath("//*[@placeholder='(ex. 123 Main)']"));
			   if(billinAddress.isDisplayed() && billinAddress.isEnabled()) {
				billinAddress.sendKeys("222 S Moore Ave"); 	
			   }  
			   WebElement Address2=driver.findElement(By.xpath("//input[@placeholder='(ex. Suite 400, Apt. 4B)']"));
			   if(Address2.isDisplayed() && Address2.isEnabled()) {
				Address2.sendKeys("Suite 410, Apt. 5C"); 	
			   }  
			   WebElement cityAddress=driver.findElement(By.xpath("//input[@name='creditCards[0].city']"));
			   if(cityAddress.isDisplayed() && cityAddress.isEnabled()) {
				cityAddress.sendKeys("Monterey Park"); 	
			   }  
			   WebElement zipAddress=driver.findElement(By.xpath("//input[@name='creditCards[0].zipcode']"));
			   if(zipAddress.isDisplayed() && zipAddress.isEnabled()) {
				zipAddress.sendKeys("91754"); 	
			   } 
			   WebElement emailconfirmation=driver.findElement(By.xpath("//*[@id='email']/div[1]/fieldset/label/input"));
			   if(emailconfirmation.isDisplayed() && emailconfirmation.isEnabled()) {
				emailconfirmation.sendKeys("johndoe@abcschool.com"); 	
			   } 
			 
			   driver.findElement(By.xpath("//*[@id='complete-booking']")).click();
			 
	 }
}
