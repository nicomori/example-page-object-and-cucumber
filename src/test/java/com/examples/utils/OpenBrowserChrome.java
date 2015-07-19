package com.examples.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class OpenBrowserChrome {

	public static WebDriver openBowserWithCapabilities(DesiredCapabilities capabilities) {

		System.setProperty("webdriver.chrome.driver",
				"C:/DriversBrowser/chromedriver.exe");

		WebDriver driver = new ChromeDriver(capabilities);

		driver.manage().window().maximize();

		return driver;
	}
	
	public static WebDriver openBowserWithOutCapabilities() {

		System.setProperty("webdriver.chrome.driver",
				"C:/DriversBrowser/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		return driver;
	}

}
