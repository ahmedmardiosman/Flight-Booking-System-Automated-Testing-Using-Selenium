import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BrowseFlightsPage {

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/header/h1")
	private WebElement browseFlightPage;

	public String getBrowseFlightPageTitle() {

		return browseFlightPage.getText();

	}

}
