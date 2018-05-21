package com.org.commons.selenium.elements.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;

public class WindowConditions {

	public static ExpectedCondition<Boolean> windowsNumberToBe(final int windowsSize) {
		return new ExpectedCondition<Boolean>() {
			int currentNumber;

			public Boolean apply(WebDriver driver) {
				currentNumber = driver.getWindowHandles().size();
				return currentNumber == windowsSize ? true : false;
			}
		};
	}
}
