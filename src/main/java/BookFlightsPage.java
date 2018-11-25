import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookFlightsPage {

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/h3/p")
	private WebElement getWelcome;

	public String loggedInBookFlight() {

		return getWelcome.getText();

	}
}
