package com.org.quality.ui.selenium.elements.implementation;

import org.openqa.selenium.WebElement;

import com.org.quality.ui.selenium.elements.Input;

public class InputImplementation extends ElementImplementation implements Input {

	public InputImplementation(WebElement element) {
		super(element);
	}

	public void fillWith(String value) {
		this.clear();
		sendKeys(value);
	}

}
