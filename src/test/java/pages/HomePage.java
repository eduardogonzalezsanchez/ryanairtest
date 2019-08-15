package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import base.BaseTest;

public class HomePage extends BaseTest {
	// x of cookies
	@FindBy(xpath = "//div[@class='cookie-popup__close']//div//*[@id='glyphs.close']")
	public WebElement xcookies;
	// Icon to change language
	@FindBy(xpath = "//li[@id='markets']//span[@class='ico-flag ie']")
	public WebElement languageIcon;
	// English option language
	@FindBy(xpath = "//global-header//div[2]//ul[1]//li[4]//a[1]")
	public WebElement languageEnglish;
	// Log In MainMenu
	@FindBy(xpath = "//span[@class='username'][contains(text(),'Log in')]")
	public WebElement logInLink;
	// Check out btn
	@FindBy(xpath = "//button[@class='core-btn-primary core-btn-block core-btn-medium']")
	public WebElement checkOutBtn;
	// email address textbox
	@FindBy(xpath = "/html[1]/body[1]/div[5]/div[2]/signup-home-form[1]/div[1]/div[1]/div[2]/div[1]/dialog-body[1]/div[2]/signup-home-tabs[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/input[1]")
	public WebElement emailTxtBox;
	// password address pwdtbox
	@FindBy(xpath = "/html[1]/body[1]/div[5]/div[2]/signup-home-form[1]/div[1]/div[1]/div[2]/div[1]/dialog-body[1]/div[2]/signup-home-tabs[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/password-input[1]/input[1]")
	public WebElement pwdTxtBox;
	// log in btn
	@FindBy(xpath = "//div[@class='modal-form-group']//button-spinner")
	public WebElement loginBtn;
	// One way option
	@FindBy(xpath = "//input[@id='flight-search-type-option-one-way']")
	public WebElement oneWayOption;
	// TestBox from option Airport
	@FindBy(xpath = "//input[@placeholder='Departure airport']")
	public WebElement fromWhere;
	@FindBy(xpath = "//span[contains(text(),'lin')]")
	public WebElement DublinChoice;
	// TestBox to option Airport
	@FindBy(xpath = "//input[@placeholder='Destination airport']")
	public WebElement toWhere;
	@FindBy(xpath = "//span[contains(text(),'Berlin Schönefeld')]")
	public WebElement BerlinChoice;
	// Flysdates
	@FindBy(xpath = "//div[@class='focused']//input[@placeholder='DD']")
	public WebElement flyoutPickDay;
	@FindBy(xpath = "//div[@class='focused']//input[@placeholder='MM']")
	public WebElement flyoutPickMonth;
	@FindBy(xpath = "//div[@class='focused']//input[@placeholder='YYYY']")
	public WebElement flyoutPickYear;
	// choose passengers
	@FindBy(xpath = "//div[@class='value']")
	public WebElement passengers;
	@FindBy(xpath = "//div[6]//div[1]//div[3]//core-inc-dec[1]//button[2]")
	public WebElement addPax;
	@FindBy(xpath = "//div[8]//div[1]//div[3]//core-inc-dec[1]//button[2]")
	public WebElement addChild;
	// Let´s go button
	@FindBy(xpath = "//button[@class='core-btn-primary core-btn-block core-btn-big']")
	public WebElement letsgoBtn;
	// WebTerms optins
	@FindBy(xpath = "//span[@class='terms-conditions-checkbox-span']")
	public WebElement webTerms;

	public HomePage() {
		PageFactory.initElements((driver), this);
	}

	public void changeLanguage() {
		// explicitWaitOne is a method that gives 20 second to a WebElement to charge
		// xcookies is to skip the cookies policy
		utilities.TestUtil.ExplicitWaitOne(xcookies).click();
		// to change language
		utilities.TestUtil.ExplicitWaitOne(languageIcon).click();
		utilities.TestUtil.ExplicitWaitOne(languageEnglish).click();
		log.info("Language has been changed");
	}

	// funtion to log in
	public void funcitonLogin() {
		logInLink.click();
		utilities.TestUtil.ExplicitWaitOne(emailTxtBox).sendKeys("eduardogonzalezsanchez@gmail.com");
		utilities.TestUtil.ExplicitWaitOne(pwdTxtBox).sendKeys("Prueba2.0");
		utilities.TestUtil.ExplicitWaitOne(loginBtn).click();
		log.info("I am logged");
	}

	//method to choose Airports, flyDate and passengers
	public void chooseTryp(String fromAirport, String toAirport, String flyOutDate, String addPassenger,
			String addChildren) {

		//FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(30, TimeUnit.SECONDS)
		//		.pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);

		//WebElement element = wait.until(new Function<WebDriver, WebElement>() {
		//	public WebElement apply(WebDriver driver) {
		//		if (oneWayOption.isDisplayed()) {
		//			return oneWayOption;
		//		} else {
		//			System.out.println("FluentWait Failed");
		//			return null;
		//		}
		//	}
		//});

		// i know that this is not a good practice but i tried to use implicit wait,
		// explicit, fluent and javascript option but don´t work
		
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		oneWayOption.click();
		// select Dublin (DUB)
		utilities.TestUtil.ExplicitWaitOne(fromWhere).clear();
		fromWhere.sendKeys(fromAirport);
		utilities.TestUtil.ExplicitWaitOne(DublinChoice).click();
		// select Berlin Schönefeld (SXF)
		utilities.TestUtil.ExplicitWaitOne(toWhere).clear();
		toWhere.sendKeys(toAirport);
		utilities.TestUtil.ExplicitWaitOne(BerlinChoice).click();
		// select date
		utilities.TestUtil.ExplicitWaitOne(flyoutPickDay).clear();
		utilities.TestUtil.ExplicitWaitOne(flyoutPickDay).sendKeys(flyOutDate.substring(0, 2));
		utilities.TestUtil.ExplicitWaitOne(flyoutPickMonth).clear();
		utilities.TestUtil.ExplicitWaitOne(flyoutPickMonth).sendKeys(flyOutDate.substring(3, 5));
		utilities.TestUtil.ExplicitWaitOne(flyoutPickYear).clear();
		utilities.TestUtil.ExplicitWaitOne(flyoutPickYear).sendKeys(flyOutDate.substring(6, 10));
		// select passengers
		// it is going to click as much times as passengers are in Payments.feature
		utilities.TestUtil.ExplicitWaitOne(passengers).click();
		for (int x = 0; x < (Integer.parseInt(addPassenger) - 1); x++) {
			utilities.TestUtil.ExplicitWaitOne(addPax).click();
		}
		// it is going to click in child as much times as children are in
		// Payments.feature
		for (int x = 0; x < Integer.parseInt(addChildren); x++) {
			utilities.TestUtil.ExplicitWaitOne(addChild).click();
		}
		utilities.TestUtil.ExplicitWaitOne(passengers).click();
		log.info("I have choosen passengers");
	}

	//method to accept web terms
	public void tapWebTerms() {
		utilities.TestUtil.ExplicitWaitOne(webTerms).click();
		log.info("I accepted web  terms");
	}

	//method to tap on Lets go Btn
	public void letsgoBtn() {
		utilities.TestUtil.ExplicitWaitOne(letsgoBtn).click();
		log.info("I tap on Lets Go Btn");
	}

}
