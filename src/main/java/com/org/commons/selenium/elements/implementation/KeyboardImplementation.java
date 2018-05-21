package com.org.commons.selenium.elements.implementation;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.org.commons.selenium.elements.Keyboard;

public class KeyboardImplementation extends ElementImplementation implements Keyboard {

	public KeyboardImplementation(WebElement element) {
		super(element);
	}

	public void pressEnter() {
		wait.forVisibilityOf(element);
		element.sendKeys(Keys.ENTER);
	}

	public void pressSpace() {
		wait.forVisibilityOf(element);
		element.sendKeys(Keys.SPACE);
	}

	public void pressEscape() {
		wait.forVisibilityOf(element);
		element.sendKeys(Keys.ESCAPE);
	}

	public void pressTab() {
		wait.forVisibilityOf(element);
		element.sendKeys(Keys.TAB);
	}
}
