package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseTest {

	/*
	 * Excel - done Logs - done Properties - done WebDriver - done Keywords - done
	 * Maven - Build tool
	 */

	public static WebDriver driver;
	public static Properties Config = new Properties();
	public static FileInputStream fis;
	public static Logger log = Logger.getLogger(BaseTest.class);

	public static void setUp() {

		if (driver == null) {
			PropertyConfigurator
					.configure(System.getProperty("user.dir") + "//src//test//resources//properties//log4j.properties");
			try {
				fis = new FileInputStream(
						System.getProperty("user.dir") + "//src//test//resources//properties//Config.properties");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			try {
				Config.load(fis);
				log.info("Config file loaded !!!");
			} catch (IOException e) {
				e.printStackTrace();
			}

			if (Config.getProperty("browser").equals("firefox")) {

				System.setProperty("webdriver.gecko.driver",
						System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\geckodriver.exe");
				driver = new FirefoxDriver();
				log.info("Firefox Launched");

			} else if (Config.getProperty("browser").equals("chrome")) {

				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "//src//test//resources//executables//chromedriver");
				driver = new ChromeDriver();
				log.info("Chrome Launched");

			} else if (Config.getProperty("browser").equals("ie")) {

				System.setProperty("webdriver.ie.driver",
						System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
				log.info("IE Launched");
			}

			driver.get(Config.getProperty("testsiteurl"));
			log.info("Navigated to : " + Config.getProperty("testsiteurl"));
			driver.manage().window().maximize();

		}
	}

	public void tearDown() {

		driver.quit();
		log.info("Test Execution Completed !!!");
	}

}
