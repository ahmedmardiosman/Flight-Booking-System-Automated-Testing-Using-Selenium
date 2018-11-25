import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EstimateFlightPricePage {

	@FindBy(name = "destinationid")
	private WebElement destinationID;

	public void enterDestinationID(String text) {

		destinationID.sendKeys(text);
	}

	@FindBy(name = "adultticket")
	private WebElement noAdultTickets;

	public void enterNumAdultTickets(String text) {

		noAdultTickets.sendKeys(text);

	}

	@FindBy(name = "childticket")
	private WebElement noChildTickets;

	public void enterNumChildTickets(String text) {

		noChildTickets.sendKeys(text);

	}

	@FindBy(name = "oapticket")
	private WebElement noOapTickets;

	public void enterNumOapTickets(String text) {

		noOapTickets.sendKeys(text);

	}

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/form[1]/div[5]/div/button")
	private WebElement estimateFlightPriceButton;

	public void estimateFlightPriceButtonSubmit() {

		estimateFlightPriceButton.click();

	}

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/form[2]/div[2]/div/p")
	private WebElement getDestinationCountry;

	public String getDestinationCountry() {

		return getDestinationCountry.getText();

	}

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/form[2]/div[9]/div/p")
	private WebElement getFlightPrice;

	public String getFlightPrice() {

		return getFlightPrice.getText();

	}

}
