package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import base.BaseTest;

public class SelectFlyPage extends BaseTest {
	// first result appeared
	@FindBy(xpath = "//div[@class='flight-header']//div[@class='flight-header__min-price hide-mobile']//div[@class='core-btn-primary']")
	public WebElement firstChoice;
	// plus option
	//@FindBy(xpath = "//div[@class='flights-table-price__price-wraper']//div//span[@class='flights-table-fares__fare-radio']")
	@FindBy(xpath="/html[1]/body[1]/div[2]/main[1]/div[1]/section[1]/div[1]/div[1]/flight-list[1]/form[1]/div[4]/div[1]/flights-table[1]/div[1]/div[1]/div[1]/div[1]/flights-table-fares[1]/div[1]/div[1]/div[3]/div[5]/flights-table-price[1]/div[1]/div[1]/div[1]/span[1]")
	public WebElement plusOption;
	// Continue Btn
	@FindBy(xpath = "//button[@id='continue']")
	public WebElement continueBtn;
	// Select seats. Ok,got it
	@FindBy(xpath = "//button[@class='core-btn-primary seat-map-plus-dialog__button']")
	public WebElement okGotItBtn;
	// Select first adult
	@FindBy(xpath = "//div[20]//div[1]//span[1]//span[1]")
	public WebElement firstAdultSeat;
	// Select second adult
	@FindBy(xpath = "//div[20]//div[2]//span[1]//span[1]")
	public WebElement secondAdultSeat;
	// Select first child
	@FindBy(xpath = "//div[20]//div[3]//span[1]//span[1]")	
	public WebElement firstChildSeat;
	//Review Seats Btn
	@FindBy(xpath="//button[@class='core-btn-primary dialog-overlay-footer__ok-button']")
	public WebElement reviewSeatsBtn;
	//Confirm Btn
	@FindBy(xpath="//button[@class='core-btn-primary dialog-overlay-footer__ok-button']")
	public WebElement confirmBtn;
	
	
	public SelectFlyPage() {
		PageFactory.initElements(driver, this);
	}

	//method to tap on first choice
	public void tapOnFirstChoice() {
		utilities.TestUtil.ExplicitWaitOne(firstChoice).click();
		log.info("I tap on first tryp");
	}
	
	//method to tap on plus option
	public void tapOnPlusOption() throws InterruptedException {
		// i know that this is not a good practice but i tried to use implicit wait,
		// explicit, fluent and javascript option but don´t work
		Thread.sleep(1000);
		utilities.TestUtil.ExplicitWaitOne(plusOption).click();
		log.info("I tap on Plus Option");
	}
	
	//method to tap on Continue Btn
	public void tapOnContinueBtn() throws InterruptedException {
		utilities.TestUtil.ExplicitWaitOne(continueBtn).click();
		log.info("I tap on Continue Btn");
	}
	
	// method to tap on Ok Got it Btn
	public void tapOkGotItBtn() {
		utilities.TestUtil.ExplicitWaitOne(okGotItBtn).click();
		log.info("I tap on Go It Btn");
	}
	
	//method to select seats and confirm
	public void selectSeats() throws InterruptedException {
		// i know that this is not a good practice but i tried to use implicit wait,
		// explicit, fluent and javascript option but don´t work
		Thread.sleep(2000);
		utilities.TestUtil.ExplicitWaitOne(firstAdultSeat).click();
		utilities.TestUtil.ExplicitWaitOne(secondAdultSeat).click();
		utilities.TestUtil.ExplicitWaitOne(firstChildSeat).click();
		utilities.TestUtil.ExplicitWaitOne(reviewSeatsBtn).click();
		Thread.sleep(2000);
		utilities.TestUtil.ExplicitWaitOne(confirmBtn).click();
		log.info("I selected seats");
	}
	

}
