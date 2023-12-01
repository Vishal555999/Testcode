package tendablePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class tendableHomepage {

	@FindBy(xpath = "//a//img[@alt='Tendable Logo']")
	private WebElement tendableLogo;

	@FindBy(xpath = "//a[text()='Our Story']")
	private WebElement ourStoryMenu;

	@FindBy(xpath = "//a[text()='Our Solution']")
	private WebElement ourSolutioMenu;

	@FindBy(xpath = "//a[text()='Why Tendable?']")
	private WebElement whyTendablemenu;

	@FindBy(xpath = "(//a[text()='Request a Demo'])[1]")
	private WebElement requestAdemoBtn;

	@FindBy(xpath = "//a[text()='Contact Us']")
	private WebElement contactUS;

	public tendableHomepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public boolean isDisplayedTendabledLogo() {
		return tendableLogo.isDisplayed();

	}

	public boolean isDisplayedourStoryMenu() {
		return ourStoryMenu.isDisplayed();
		
	}

	public boolean isDisplayedourSolutionMenu() {
		return ourSolutioMenu.isDisplayed();
		
	}

	public boolean isDisplayedWhyTendableMenu() {
		return whyTendablemenu.isDisplayed();
		
	}

	public boolean isDisplayedRequestaemoBtn() {
		return requestAdemoBtn.isDisplayed();

	}

	public boolean isenabledRequestaemoBtn() {

		return requestAdemoBtn.isEnabled();
	}

	public void clickTendableLogo() {
		tendableLogo.click();
	}

	public void clickOurStoryMenu() {
		ourStoryMenu.click();
	}

	public void clickOurSolutionMenu() {
		ourSolutioMenu.click();
	}

	public void clickWhyTendableMenu() {
		whyTendablemenu.click();
	}

	public void clickContactUs() {
		contactUS.click();
	}
}
