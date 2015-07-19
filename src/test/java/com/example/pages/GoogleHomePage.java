package com.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.SlowLoadableComponent;
import org.openqa.selenium.support.ui.SystemClock;

import com.examples.utils.IsLoaded;

public class GoogleHomePage extends SlowLoadableComponent<GoogleHomePage> {

	private final WebDriver driver;

	By FILD_TO_SEARCH = By.name("q");
	By SEARCH_BUTTON_INITIAL = By.name("btnK");
	By SEARCH_BUTTON = By.name("btnG");

	public GoogleHomePage(WebDriver driver) {
		super(new SystemClock(), 10);
		this.driver = driver;
	}

	@Override
	protected void load() {
		driver.get("https://www.google.com.ar/");
	}

	@Override
	protected void isLoaded() throws Error {

		IsLoaded.forThis(driver).

		whenElementIsEnabled(FILD_TO_SEARCH, "Field to complete in google")
		.whenElementIsVisible(SEARCH_BUTTON_INITIAL, "Initial button google to Press search");
	}

	public GoogleHomePage setWordsToFind(String wordsToFind, WebDriver driver) {
		
		driver.findElement(FILD_TO_SEARCH).sendKeys(wordsToFind);
		return this;
	}

	public WebDriver pressButtonSearch(WebDriver driver) {
		driver.findElement(SEARCH_BUTTON).click();
		return driver;
	}
}
