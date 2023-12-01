package tendablePages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import config.elementaction;

public class contactUs extends elementaction {
	public elementaction act = new elementaction();

	@FindBy(xpath = "(//button[text()='Contact'])[1]")
	private WebElement marketingBtn;

	@FindBy(xpath = "(//input[@id='form-input-fullName'])[1]")
	private WebElement Name;

	@FindBy(xpath = "(//input[@id='form-input-organisationName'])[1]")
	private WebElement orgName;

	@FindBy(xpath = "(//input[@id='form-input-cellPhone'])[1]")
	private WebElement mobileNo;

	@FindBy(xpath = "(//input[@id='form-input-email'])[1]")
	private WebElement mailID;

	@FindBy(xpath = "(//select[@id='form-input-jobRole'])[1]")
	private WebElement role;

	@FindBy(xpath = "(//input[@type='radio'])[1]")
	private WebElement radioButton;

	@FindBy(xpath = "(//button[text()='Submit'])[1]")
	private WebElement submitButton;

	@FindBy(xpath = "//div[@class='ff-form-errors']//p")
	private WebElement error;

	public void clickOnMarketingbtn() {
		marketingBtn.click();
	}

	public void entermobileNumber(String mobileno) {
		mobileNo.sendKeys();
	}

	public void enterName(String name) {
		Name.sendKeys(name);
	}

	public void enterOrgname(String orgname) {
		orgName.sendKeys(orgname);
	}

	public void enterMailID(String mailid) {
		mailID.sendKeys(mailid);
	}

	public void selectRole(String Role) {
		implicitwait(getDriver());
		Select s = new Select(role);
		s.selectByVisibleText(Role);
	}

	public contactUs(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickOnAgreeradioBtn() {
		explicitwaitClickibility(getDriver(), radioButton);
		radioButton.click();
	}

	public void clickOnSubmitbtn() {
		explicitwaitClickibility(getDriver(), submitButton);
		submitButton.click();
	}

	public String getErrortext() {
		explicitwaitvisibility(getDriver(), error);
		String texterror = error.getText();
		return texterror;
	}
	public boolean isErrormsgDisplyed() {
		return error.isDisplayed();
	}

	public static void explicitwaitClickibility(WebDriver driver, WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
}
