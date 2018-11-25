import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/nav/div/ul/li[1]/a/a/h1")
	private WebElement browseFlights;

	public void selectBrowseFlights() {

		browseFlights.click();

	}

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/nav/div/ul/li[2]/a/a/h1")
	private WebElement estimateFlightPrice;

	public void selectEstimateFlightPrice() {

		estimateFlightPrice.click();

	}

	@FindBy(xpath = "//*[@id=\"dropdown-size-large\"]")
	private WebElement adminOptions;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/ul/li[1]/a/a")
	private WebElement bookFlightsPage;

	public void bookFlightsPage() {

		adminOptions.click();
		bookFlightsPage.click();

	}

}
