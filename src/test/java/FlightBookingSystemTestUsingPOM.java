import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

public class FlightBookingSystemTestUsingPOM {

	private String url = "http://localhost:3000/";
	private WebDriver driver;

	@Before
	public void setup() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ahmed\\Ahmeds Applications\\ChromeDriver/chromedriver.exe");
		driver = new ChromeDriver();

	}

	@After
	public void teardown() {
		driver.quit();
	}

	@Test
	public void testBrowseFlightsPage() {

		driver.manage().window().maximize();
		driver.get(url);

		// This test will ensure we are on the Browse Flights Page

		HomePage homePage = PageFactory.initElements(driver, HomePage.class);

		homePage.selectBrowseFlights();

		BrowseFlightsPage browseFlightPage = PageFactory.initElements(driver, BrowseFlightsPage.class);

		assertEquals("Browse Flights", browseFlightPage.getBrowseFlightPageTitle());

	}

	@Test
	public void testEstimateFlightPricePage() {

		driver.manage().window().maximize();
		driver.get(url);

		// This test will ensure that the correct price and destination is returned

		HomePage homePage = PageFactory.initElements(driver, HomePage.class);

		homePage.selectEstimateFlightPrice();

		EstimateFlightPricePage estimateFligthPricePage = PageFactory.initElements(driver,
				EstimateFlightPricePage.class);

		estimateFligthPricePage.enterDestinationID("3");

		estimateFligthPricePage.enterNumAdultTickets("2");

		estimateFligthPricePage.enterNumChildTickets("4");

		estimateFligthPricePage.enterNumOapTickets("1");

		estimateFligthPricePage.estimateFlightPriceButtonSubmit();

		// Checks if the destination country is correct
		assertEquals("Egypt", estimateFligthPricePage.getDestinationCountry());

		// Checks if the Flight Price is calculated correctly

		assertEquals("£3400", estimateFligthPricePage.getFlightPrice());

	}

	@Test
	public void testLoginPage() {

		driver.manage().window().maximize();
		driver.get(url);

		// This test will ensure that the login works

		HomePage homePage = PageFactory.initElements(driver, HomePage.class);

		homePage.bookFlightsPage();

		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

		loginPage.enterAdminID("1");

		loginPage.enterPassword("ahmedmardiosman");

		loginPage.logInButton();

		BookFlightsPage bookFlightsPage = PageFactory.initElements(driver, BookFlightsPage.class);

		assertEquals("Welcome Admin User!", bookFlightsPage.loggedInBookFlight());
	}

}
