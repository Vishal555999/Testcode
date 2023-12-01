package tendablePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ourSolutionPage {

	@FindBy(xpath = "(//a[text()='Request a Demo'])[2]")
	private WebElement requestAdemoBtn;

	public ourSolutionPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public boolean isDisplayedReqAdemoBtn() {
		return requestAdemoBtn.isDisplayed();

	}

	public boolean isenabledReqAdemoBtn() {
		return requestAdemoBtn.isEnabled();

	}
}
