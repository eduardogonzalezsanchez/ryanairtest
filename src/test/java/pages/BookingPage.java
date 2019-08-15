package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseTest;

public class BookingPage extends BaseTest {
	
	// Check out btn
	@FindBy(xpath = "//button[@class='core-btn-primary core-btn-block core-btn-medium']")
	public WebElement checkOutBtn;
	
	public BookingPage() {
		PageFactory.initElements(driver, this);
	}

	//method to tap on CheckOutBtn
	public void tapOnCheckOutBtn() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// utilities.TestUtil.ExplicitWaitOne(checkOutBtn).click();
		checkOutBtn.click();
		log.info("I tap on Check Out Btn");
	}
	

}
