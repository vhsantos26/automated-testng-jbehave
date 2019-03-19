package com.org.quality.ui.selenium.elements.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;

public class WindowConditions {

    /**
     * Blank constructor to avoid the following sonar issue.
     * <b>Utility classes should not have public constructors (squid:S1118)</b>
     */
    private WindowConditions() {}
    
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
