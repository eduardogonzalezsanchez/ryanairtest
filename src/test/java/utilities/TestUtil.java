package utilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BaseTest;

public class TestUtil extends BaseTest {
	
	
	// method explicitwait for one webelement
	public static WebElement ExplicitWaitOne(WebElement account) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(account));
		return element;
	}
	
	// method explicitwait for more than one webelement
	public static List<WebElement> ExplicitWaitList(List<WebElement> ListwebElement) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		List<WebElement> listelement = wait.until(ExpectedConditions.visibilityOfAllElements(ListwebElement));
		return listelement;
	}



}
