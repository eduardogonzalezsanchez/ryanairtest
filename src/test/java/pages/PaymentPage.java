package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import base.BaseTest;


public class PaymentPage extends BaseTest {

	// Log in Btn
	@FindBy(xpath = "//button[@class='core-btn-secondary']")
	public WebElement logInBtn;
	// First passenger
	@FindBy(xpath = "/html[1]/body[1]/div[2]/main[1]/div[1]/payment[1]/div[2]/div[1]/form[1]/div[1]/div[1]/passengers-form[1]/div[2]/ng-form[1]/passenger-input-group[1]/div[1]/ng-form[1]/div[1]/div[1]/div[1]/select[1]")
	public WebElement titleCombo1;
	@FindBy(xpath = "/html[1]/body[1]/div[2]/main[1]/div[1]/payment[1]/div[2]/div[1]/form[1]/div[1]/div[1]/passengers-form[1]/div[2]/ng-form[1]/passenger-input-group[1]/div[1]/ng-form[1]/div[1]/div[2]/input[1]")
	public WebElement name1;
	@FindBy(xpath = "/html[1]/body[1]/div[2]/main[1]/div[1]/payment[1]/div[2]/div[1]/form[1]/div[1]/div[1]/passengers-form[1]/div[2]/ng-form[1]/passenger-input-group[1]/div[1]/ng-form[1]/div[1]/div[3]/input[1]")
	public WebElement surname1;
	// Second passenger
	@FindBy(xpath = "/html[1]/body[1]/div[2]/main[1]/div[1]/payment[1]/div[2]/div[1]/form[1]/div[1]/div[1]/passengers-form[1]/div[2]/ng-form[1]/passenger-input-group[2]/div[1]/ng-form[1]/div[1]/div[1]/div[1]/select[1]")
	public WebElement titleCombo2;
	@FindBy(xpath = "/html[1]/body[1]/div[2]/main[1]/div[1]/payment[1]/div[2]/div[1]/form[1]/div[1]/div[1]/passengers-form[1]/div[2]/ng-form[1]/passenger-input-group[2]/div[1]/ng-form[1]/div[1]/div[2]/input[1]")
	public WebElement name2;
	@FindBy(xpath = "/html[1]/body[1]/div[2]/main[1]/div[1]/payment[1]/div[2]/div[1]/form[1]/div[1]/div[1]/passengers-form[1]/div[2]/ng-form[1]/passenger-input-group[2]/div[1]/ng-form[1]/div[1]/div[3]/input[1]")
	public WebElement surname2;
	// Kid data
	@FindBy(xpath = "/html[1]/body[1]/div[2]/main[1]/div[1]/payment[1]/div[2]/div[1]/form[1]/div[1]/div[1]/passengers-form[1]/div[2]/ng-form[1]/passenger-input-group[3]/div[1]/ng-form[1]/div[1]/div[1]/input[1]")
	public WebElement name3;
	@FindBy(xpath = "/html[1]/body[1]/div[2]/main[1]/div[1]/payment[1]/div[2]/div[1]/form[1]/div[1]/div[1]/passengers-form[1]/div[2]/ng-form[1]/passenger-input-group[3]/div[1]/ng-form[1]/div[1]/div[2]/input[1]")
	public WebElement surname3;
	// Insurance
	@FindBy(xpath = "//button[@class='csi-card__btn csi-card__actions-no']")
	public WebElement insuranceBtn;
	// Contact details
	// Mobile phone number
	@FindBy(xpath = "//select[@name='phoneNumberCountry']")
	public WebElement selectCountry;
	@FindBy(xpath = "//input[@name='phoneNumber']")
	public WebElement phoneNumber;
	// Card Number
	@FindBy(xpath = "/html[1]/body[1]/div[2]/main[1]/div[1]/payment[1]/div[2]/div[1]/form[1]/div[1]/div[3]/div[2]/payment-details-form[1]/div[1]/div[2]/div[1]/div[2]/div[1]/payment-method-retrieved-cards[1]/payment-method-card[1]/div[1]/input[1]")
	public WebElement cardNumber;
	@FindBy(xpath = "/html[1]/body[1]/div[2]/main[1]/div[1]/payment[1]/div[2]/div[1]/form[1]/div[1]/div[3]/div[2]/payment-details-form[1]/div[1]/div[2]/div[1]/div[2]/div[1]/payment-method-retrieved-cards[1]/payment-method-card[1]/div[2]/div[1]/div[1]/div[1]/select[1]")
	public WebElement cardMonth;
	@FindBy(xpath = "/html[1]/body[1]/div[2]/main[1]/div[1]/payment[1]/div[2]/div[1]/form[1]/div[1]/div[3]/div[2]/payment-details-form[1]/div[1]/div[2]/div[1]/div[2]/div[1]/payment-method-retrieved-cards[1]/payment-method-card[1]/div[2]/div[1]/div[2]/div[1]/div[1]/select[1]")
	public WebElement cardYear;
	@FindBy(xpath = "//input[@placeholder='CVV']")
	public WebElement cardCVV;
	@FindBy(xpath = "/html[1]/body[1]/div[2]/main[1]/div[1]/payment[1]/div[2]/div[1]/form[1]/div[1]/div[3]/div[2]/payment-details-form[1]/div[1]/div[2]/div[1]/div[2]/div[1]/payment-method-retrieved-cards[1]/payment-method-card[1]/div[3]/div[1]/input[1]")
	public WebElement cardName;
	// Billing address
	@FindBy(xpath = "//input[@id='billingAddressAddressLine1']")
	public WebElement address;
	@FindBy(xpath = "//input[@id='billingAddressCity']")
	public WebElement city;
	@FindBy(xpath = "//input[@id='billingAddressPostcode']")
	public WebElement postalCode;
	@FindBy(xpath = "//select[@id='billingAddressCountry']")
	public WebElement country;
	@FindBy(xpath = "//body[@class='tpl-homepage homepage']/div[@class='FR']/main/div[@class='body-section']/payment/div[@id='checkout']/div[@class='row']/form[@name='bookingPaymentForm']/div[@class='main-area']/div[@class='core-card available-step after-pax-validation-step']/div[@class='body']/div[@class='cta']/div[@class='terms']/label[@class='core-checkbox-label']/span[@class='core-checkbox-label--icon']/core-icon[@class='tick-icon']/div/*[1]")
	public WebElement termsAndConditions;
	@FindBy(xpath = "//button[@class='core-btn-primary core-btn-medium']")
	public WebElement payNowBtn;
	// Currency
	@FindBy(xpath = "//select[@name='currency']")
	public WebElement currency;
	// prompt error payment
	@FindBy(xpath = "//prompt[@class='error prompt-text']")
	public WebElement promptError;

	// Select for options
	Select select;

	// it is used for scrolldown
	JavascriptExecutor js;

	public PaymentPage() {
		PageFactory.initElements(driver, this);
	}

	// method for first passenger
	public void sendDataPassengers1(String name, String surname) {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		select = new Select(titleCombo1);
		select.selectByVisibleText("Mr");
		utilities.TestUtil.ExplicitWaitOne(name1).sendKeys(name);
		utilities.TestUtil.ExplicitWaitOne(surname1).sendKeys(surname);
		log.info("I sent Passenger 1 data");
	}

	// method for second passenger
	public void sendDataPassengers2(String name, String surname) {
		select = new Select(titleCombo2);
		select.selectByVisibleText("Mr");
		utilities.TestUtil.ExplicitWaitOne(name2).sendKeys(name);
		utilities.TestUtil.ExplicitWaitOne(surname2).sendKeys(surname);
		log.info("I sent Passenger 2 data");
	}

	// method for third passenger
	public void sendDataPassengers3(String name, String surname) {
		utilities.TestUtil.ExplicitWaitOne(name3).sendKeys(name);
		utilities.TestUtil.ExplicitWaitOne(surname3).sendKeys(surname);
		log.info("I sent Passenger 3 data");
	}

	// method to add insurance
	public void addInsurance() {
		// handle if btnInsurance exists.
		if (driver.findElements(By.xpath("//button[@class='csi-card__btn csi-card__actions-no']")).size() > 0) {
			js = (JavascriptExecutor) driver;
			// This will scroll the page till the element is found
			js.executeScript("arguments[0].scrollIntoView();", insuranceBtn);
			utilities.TestUtil.ExplicitWaitOne(insuranceBtn).click();
		}
		log.info("I add insurance");
	}

	// method to send telephone data
	public void sendTelephone(String phone) {
		js = (JavascriptExecutor) driver;
		// This will scroll the page till the element is found
		js.executeScript("arguments[0].scrollIntoView();", selectCountry);
		select = new Select(selectCountry);
		select.selectByVisibleText("Spain");
		utilities.TestUtil.ExplicitWaitOne(phoneNumber).sendKeys(phone);
		log.info("I sent telephone");
	}

	// method to send car details
	public void sendCardDetails(String card, String monthandyear, String cvv, String name) {
		utilities.TestUtil.ExplicitWaitOne(cardNumber).sendKeys(card);
		select = new Select(cardMonth);
		select.selectByVisibleText((String) monthandyear.subSequence(0, 2));
		select = new Select(cardYear);
		select.selectByVisibleText((String) monthandyear.subSequence(3, 7));
		utilities.TestUtil.ExplicitWaitOne(cardCVV).sendKeys(cvv);
		utilities.TestUtil.ExplicitWaitOne(cardName).sendKeys(name);
		log.info("I sent card details");
	}

	// method to send billing address and tap on pay now btn
	public void sendBillingAddress(String addrees1, String citytwn, String pc, String country1) {
		js = (JavascriptExecutor) driver;
		// This will scroll the page till the element is found
		js.executeScript("arguments[0].scrollIntoView();", address);
		utilities.TestUtil.ExplicitWaitOne(address).sendKeys(addrees1);
		utilities.TestUtil.ExplicitWaitOne(city).sendKeys(citytwn);
		utilities.TestUtil.ExplicitWaitOne(postalCode).sendKeys(pc);
		select = new Select(country);
		select.selectByVisibleText(country1);
		utilities.TestUtil.ExplicitWaitOne(termsAndConditions).click();
		utilities.TestUtil.ExplicitWaitOne(payNowBtn).click();
		select = new Select(utilities.TestUtil.ExplicitWaitOne(currency));
		select.selectByIndex(1);
		utilities.TestUtil.ExplicitWaitOne(payNowBtn).click();
		log.info("I sent billing address");
	}
	//method to validate if Error message displayed
	public void cardErrorIsShows() {
		Assert.assertTrue("Card data is wrong",utilities.TestUtil.ExplicitWaitOne(promptError).isDisplayed());
		log.info("Card data is right");
		tearDown();
	}

}
