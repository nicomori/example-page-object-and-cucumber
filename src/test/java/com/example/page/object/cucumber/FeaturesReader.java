package com.example.page.object.cucumber;

import org.openqa.selenium.WebDriver;

import com.example.pages.GoogleHomePage;
import com.example.pages.GoogleResultsPage;
import com.examples.utils.SelectorBrowser;

import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FeaturesReader {
	
	private static WebDriver driver;
	
	GoogleHomePage searchPage = new GoogleHomePage(driver);
	GoogleResultsPage resultPage = new GoogleResultsPage(driver);

	@Given("^I open in \"(.*)?\" and set the emulation to device \"(.*)?\"$")
	public void openbrowser(String arg1, String arg2) {
		driver = SelectorBrowser.selectBrowserAndCapabilities(arg1,arg2);
	}

	@When("^I type \"(.*)?\" in the search field$")
	public void enterValue(String arg1){
		searchPage.setWordsToFind(arg1,driver);
	}

	@Then("^I need check \"(.*)?\"$")
	public void checkJavaDowlnoad(String arg1) {
		resultPage.verifyResult(arg1, driver);
	}

	@And("^I access to this \"(.*)?\"")
	public void accessToUrl(String arg1) {
		driver.get(arg1);
	}

	@And("^I click the search button$")
	public void googleSearch() {
		searchPage.pressButtonSearch(driver);
	}
	
	@After
	public void cleanUp(){
		driver.quit();
	}
}
