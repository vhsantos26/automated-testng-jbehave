package com.org.quality.ui.utils;

import org.openqa.selenium.WebDriver;

import com.org.quality.ui.selenium.factory.api.ElementFactory;

public abstract class Page {

	protected WebDriver driver;
	
	public Page(WebDriver driver) {
		this.driver = driver;
		ElementFactory.initElements(this.driver, this);
	}

	public abstract boolean isAt();

}
