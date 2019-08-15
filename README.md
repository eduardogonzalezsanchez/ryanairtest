# ryanairtest

I have chosen Java( maven, junit) and cucumber because I use them in my daily work.

Page Object Pattern is used as well. So, I think that I have used all what Ryanair is fan.

I think that Ryanair testers would like dependencies as well so in pom.xml there are all that the project needs.

I use this kind of code to set the routes so It is not necessary to change anything.
System.getProperty("user.dir")+"\\src\\test\\resources\\executables\\chromedriver.exe");

BaseTest is a class where all pages are extended. The idea is to get the information of the driver and log without the necessity to pass from page to page the driver.

TestUtils has 2 methods ExplicitWaitOne and ExplicitWaitList, the first one is used to wait to load for one WebElement to be clickable and the other for a list of WebElements.

I don´t use ImplicitWait because sometimes create conflict with ExplicitWait.

The project has four times Thread.sleep, I know that it is not a good practice, but I have used ExplicitWait, ImplicitWait  ( ExpectedConditions.elementToBeClickable, ExpectedConditions.visibilityOfAllElements, ExpectedConditions.elementToBeSelected,..) FluentWait and options with js but all of them failed.

I found a problem with the final step to contract the fly. Sometimes there was an option to hire an insurance and another not. So, my solution was to handle like this:

		if (driver.findElements(By.xpath("//button[@class='csi-card__btn csi-card__actions-no']")).size() > 0) {
			js = (JavascriptExecutor) driver;
			// This will scroll the page till the element is found
			js.executeScript("arguments[0].scrollIntoView();", insuranceBtn);
			utilities.TestUtil.ExplicitWaitOne(insuranceBtn).click();
		}
If it finds the WebElement then click in another case don´t do anything.

Finally there is an assert to check if the prompt with the error has been displayed.
		Assert.assertTrue("Card data is wrong",utilities.TestUtil.ExplicitWaitOne(promptError).isDisplayed());

To Run the project go to Eclipse, to pom.xml, and run as maven test.

I really enjoyed doing this test, i know that a lot of things can be improved but time is time and i didn´t have too much.

