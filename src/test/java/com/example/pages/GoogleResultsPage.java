package com.example.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.examples.utils.IsLoaded;

public class GoogleResultsPage {

	private final WebDriver driver;

	By CLUSTERS_OF_RESULTS = By.className("rc");
	By TITLES_OF_RESULTS = By.className("r");
	By URL_OF_RESULTS = By.className("_Rm");
	By DESCRIPTION_OF_RESULTS = By.className("st");
	By SEARCH_BUTTON = By.name("btnG");

	public GoogleResultsPage(WebDriver driver) {

		this.driver = driver;
	}

	protected void isLoaded() throws Error {

		IsLoaded.forThis(driver)
				.

				whenElementIsEnabled(CLUSTERS_OF_RESULTS,
						"Clusters of results of google")
				.whenElementIsEnabled(TITLES_OF_RESULTS,
						"Titles of results of google")
				.whenElementIsEnabled(URL_OF_RESULTS,
						"URL Links of results of google")
				.whenElementIsEnabled(DESCRIPTION_OF_RESULTS,
						"Description of results of google")
				.whenElementIsVisible(SEARCH_BUTTON,
						"Button Google to Press search, in the result Page");

	}

	public GoogleResultsPage verifyResult(String toVerify, WebDriver driver) {

		@SuppressWarnings("unused")
		WebElement waiter = (new WebDriverWait(driver, 20))
				.until(ExpectedConditions
						.presenceOfElementLocated(CLUSTERS_OF_RESULTS));

		switch (toVerify) {
		case "title":
			Assert.assertTrue(driver.findElement(TITLES_OF_RESULTS)
					.isDisplayed());
			break;
		case "url":
			Assert.assertTrue(driver.findElement(URL_OF_RESULTS).isDisplayed());
			break;
		case "description":
			Assert.assertTrue(driver.findElement(DESCRIPTION_OF_RESULTS)
					.isDisplayed());
			break;
		default:
			Assert.assertTrue(driver.findElement(TITLES_OF_RESULTS)
					.isDisplayed());
			break;

		}

		return this;
	}

}
