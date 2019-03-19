package com.org.quality.ui.driver;

import org.openqa.selenium.WebDriver;

public abstract class DriverManager {

	protected WebDriver driver;

	protected abstract void startService();

	protected abstract void createDriver();

	protected abstract void stopService();

	public void quitDriver() {
		if (driver != null) {
			driver.close();
			driver.quit();
			driver = null;
		}
	}

	public WebDriver getDriver() {
		if (driver == null) {
			startService();
			createDriver();
		}
		return driver;
	}
}
