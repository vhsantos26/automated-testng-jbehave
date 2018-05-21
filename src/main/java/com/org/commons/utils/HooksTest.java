package com.org.commons.utils;

import org.jbehave.core.annotations.AfterStory;
import org.jbehave.core.annotations.BeforeStory;
import org.openqa.selenium.WebDriver;

import com.org.commons.driver.LoadDriver;

public abstract class HooksTest {

	protected WebDriver driver;

	@BeforeStory
	public void Given_DriverWasStarted() {
		this.driver = LoadDriver.getDriver();
	}

	@AfterStory
	public void Then_DriverCanBeKilled() {
		LoadDriver.quitDriver();
	}

}
