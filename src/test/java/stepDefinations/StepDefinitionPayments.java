package stepDefinations;

import base.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import pages.BookingPage;
import pages.HomePage;
import pages.PaymentPage;
import pages.SelectFlyPage;

import org.junit.runner.RunWith;

public class StepDefinitionPayments extends BaseTest {

	HomePage homePage;
	SelectFlyPage selectFlyPage;
	BookingPage bookingPage;
	PaymentPage paymentPage;

	@Given("^User is in homePage$")
	public void user_is_in_homePage() throws Throwable {
		// if it is null the set up method will start everytime
		driver = null;
		setUp();
		homePage = new HomePage();
	}

	@And("^change language	to English$")
	public void change_language_to_English() throws Throwable {
		homePage.changeLanguage();
	}

	@And("^i login$")
	public void i_login() throws Throwable {
		homePage.funcitonLogin();
	}

	@Given("^i make a booking from \"([^\"]*)\" to \"([^\"]*)\" on \"([^\"]*)\" for \"([^\"]*)\" adults and \"([^\"]*)\" child$")
	public void i_make_a_booking_from_something_to_something_on_something_for_something_adults_and_something_child(
			String strArg1, String strArg2, String strArg3, String strArg4, String strArg5) throws Throwable {
		homePage.chooseTryp(strArg1, strArg2, strArg3, strArg4, strArg5);
	}

	@And("^tap on Website terms and on Let´s go$")
	public void tap_on_Website_terms_and_on_Let_s_go() throws Throwable {
		homePage.tapWebTerms();
		homePage.letsgoBtn();
	}

	@When("^i tap on first choice fly, plus option and tap on Continue Btn$")
	public void i_tap_on_first_choice_fly_and_plus_option() throws Throwable {
		selectFlyPage = new SelectFlyPage();
		selectFlyPage.tapOnFirstChoice();
		selectFlyPage.tapOnPlusOption();
		selectFlyPage.tapOnContinueBtn();
	}

	@Then("^seats selection is loaded$")
	public void seats_selection_is_loaded() throws Throwable {
	}

	@And("^tap on 'Ok, Got it' Btn$")
	public void tap_on_Ok_Got_it_Btn() throws Throwable {
		selectFlyPage.tapOkGotItBtn();
	}

	@And("^select seats and confirm$")
	public void select_seats_and_confirms() throws Throwable {
		selectFlyPage.selectSeats();
	}

	@When("^i tap on 'Check out' Btn$")
	public void i_tap_on_check_out_btn() throws Throwable {
		bookingPage = new BookingPage();
		bookingPage.tapOnCheckOutBtn();
	}

	@Then("^'payment page' is launched$")
	public void payment_page_is_launched() throws Throwable {
		paymentPage = new PaymentPage();
	}

	@When("^I send passengers1 data \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_send_passengers1_data_something_and_something(String strArg1, String strArg2) throws Throwable {
		paymentPage.sendDataPassengers1(strArg1, strArg2);
	}

	@And("^I send passengers2 data \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_send_passengers2_data_something_and_something(String strArg1, String strArg2) throws Throwable {
		paymentPage.sendDataPassengers2(strArg1, strArg2);
	}

	@And("^I send passengers3 data \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_send_passengers3_data_something_and_something(String strArg1, String strArg2) throws Throwable {
		paymentPage.sendDataPassengers3(strArg1, strArg2);
	}
	
	@And("^I add insurance$")
    public void i_add_insurance() throws Throwable {
    	paymentPage.addInsurance();;
    }
	
    @And("^I send telephone \"([^\"]*)\"$")
    public void i_send_telephone_something(String strArg1) throws Throwable {
    	paymentPage.sendTelephone(strArg1);
    }
    
    @And("^I pay for booking with card details \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" and \"([^\"]*)\"$")
    public void i_pay_for_booking_with_card_details_and(String arg1, String arg2, String arg3, String arg4) throws Throwable {
    	paymentPage.sendCardDetails(arg1,arg2,arg3,arg4);
    }

    @And("^I send billing address \"([^\"]*)\", \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" and tap on PayNow Btn$")
    public void i_send_billing_address_something_something_something_something_and_tap_on_paynow_btn(String strArg1, String strArg2, String strArg3, String strArg4) throws Throwable {
    	paymentPage.sendBillingAddress(strArg1,strArg2,strArg3,strArg4);
    }
    
    @Then("^card error message appears$")
    public void card_error_message_appears() throws Throwable {
        paymentPage.cardErrorIsShows();
    }
}
