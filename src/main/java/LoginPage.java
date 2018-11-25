import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	@FindBy(name = "adminid")
	private WebElement adminID;

	public void enterAdminID(String text) {

		adminID.sendKeys(text);

	}

	@FindBy(name = "password")
	private WebElement password;

	public void enterPassword(String text) {

		password.sendKeys(text);

	}

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/form/div[3]/div/button")
	private WebElement logIn;

	public void logInButton() {

		logIn.click();

	}

}
