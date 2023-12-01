package tendable.Script;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import config.BaseTest;
import config.elementaction;
import config.propertydata;
import tendablePages.contactUs;
import tendablePages.ourSolutionPage;
import tendablePages.ourStoryPage;
import tendablePages.tendableHomepage;
import tendablePages.whyTendable;

public class allTestCases extends BaseTest {

	contactUs contact;
	ourSolutionPage solution;
	ourStoryPage story;
	tendableHomepage home;
	whyTendable why;
	SoftAssert soft;

	@Test
	public void checkAccessibility() {

		home = new tendableHomepage(getDriver());
		soft = new SoftAssert();

		soft.assertTrue(home.isDisplayedTendabledLogo());
		soft.assertTrue(home.isDisplayedourStoryMenu());
		soft.assertTrue(home.isDisplayedourSolutionMenu());
		soft.assertTrue(home.isDisplayedWhyTendableMenu());

	}

	@Test
	public void checkRequestAdemobutton() {
		home = new tendableHomepage(getDriver());
		why = new whyTendable(getDriver());
		story = new ourStoryPage(getDriver());
		solution = new ourSolutionPage(getDriver());
		soft = new SoftAssert();
		home.clickTendableLogo();
		// To check whether request a demot button is visible on tendable home page
		soft.assertTrue(home.isDisplayedTendabledLogo());
		soft.assertTrue(home.isenabledRequestaemoBtn());

		// To check whether request a demot button is visible on our story page
		home.clickOurStoryMenu();
		soft.assertTrue(story.isDisplayedReqAdemoBtn());
		soft.assertTrue(story.isenabledReqAdemoBtn());

		// To check whether request a demot button is visible on our solution page
		home.clickOurSolutionMenu();
		soft.assertTrue(solution.isDisplayedReqAdemoBtn());
		soft.assertTrue(solution.isenabledReqAdemoBtn());

		// To check whether request a demot button is visible on why tendable page
		home.clickWhyTendableMenu();
		soft.assertTrue(why.isDisplayedReqAdemoBtn());
		soft.assertTrue(why.isenabledReqAdemoBtn());

	}

	@Test
	public void contatUS_marketingForm() throws IOException {
		contact = new contactUs(getDriver());
		home = new tendableHomepage(getDriver());
		elementaction act = new elementaction();
		propertydata p = new propertydata();
		home.clickContactUs();
		soft = new SoftAssert();
		contact.clickOnMarketingbtn();

		contact.enterName(p.getPropertyFileData("name"));

		contact.enterOrgname(p.getPropertyFileData("orgname"));
		contact.entermobileNumber(p.getPropertyFileData("mobileno"));
		contact.enterMailID(p.getPropertyFileData("mailId-"));

		contact.selectRole("Other");

		
		contact.clickOnAgreeradioBtn();

		contact.clickOnSubmitbtn();
		String errormsg = contact.getErrortext();
		soft.assertTrue(contact.isErrormsgDisplyed());
		soft.assertEquals(errormsg, "Sorry, there was an error submitting the form. Please try again.");
	}

}
