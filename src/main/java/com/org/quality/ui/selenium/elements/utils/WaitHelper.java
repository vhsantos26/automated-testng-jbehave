package com.org.quality.ui.selenium.elements.utils;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WaitHelper {

    private static final Logger LOGGER = LoggerFactory.getLogger(WaitHelper.class);
    
	private WebDriverWait wait;

	public WaitHelper(WebDriver driver) {
		wait = new WebDriverWait(driver, 10);
	}
	
	public void forWindowToBeOpen(int windowsNumber) {
		wait.ignoring(StaleElementReferenceException.class).pollingEvery(Duration.ofMillis(200))
			.until(WindowConditions.windowsNumberToBe(windowsNumber));
	}

	public void forInvisibilityOfAllElements(List<? extends WebElement> elements) {
		@SuppressWarnings("unchecked")
		List<WebElement> webs = (List<WebElement>) (List<?>) elements;
		wait.ignoring(StaleElementReferenceException.class).pollingEvery(Duration.ofMillis(200))
			.until(ExpectedConditions.invisibilityOfAllElements(webs));
	}

	public void forElementToBeClickable(WebElement element) {
		wait.ignoring(StaleElementReferenceException.class).pollingEvery(Duration.ofMillis(200))
			.until(ExpectedConditions.elementToBeClickable(element));
	}

	public void forAlertPresent() {
		wait.ignoring(StaleElementReferenceException.class).pollingEvery(Duration.ofMillis(200))
			.until(ExpectedConditions.alertIsPresent());
	}

	public void forInvisibilityOf(WebElement element) {
		wait.ignoring(StaleElementReferenceException.class).pollingEvery(Duration.ofMillis(200))
			.until(ExpectedConditions.invisibilityOf(element));
	}

	public void forFrameToBeAvailableAndSwitchToIt(WebElement element) {
		wait.ignoring(StaleElementReferenceException.class).pollingEvery(Duration.ofMillis(200))
			.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(element));
	}

	public void forVisibilityOf(WebElement element) {
		wait.ignoring(StaleElementReferenceException.class).pollingEvery(Duration.ofMillis(200))
			.until(ExpectedConditions.visibilityOf(element));
	}

	public void forElementeNotContainsAttributeValue(WebElement element, String attribute, String value) {
		wait.ignoring(StaleElementReferenceException.class).withTimeout(Duration.ofMillis(15000))
			.pollingEvery(Duration.ofMillis(200))
			.until(ExpectedConditions.not(ExpectedConditions.attributeContains(element, attribute, value)));
	}

	public void forNumberOfWindowToBe(int windowsNumber) {
		wait.ignoring(StaleElementReferenceException.class).pollingEvery(Duration.ofMillis(200))
			.until(ExpectedConditions.numberOfWindowsToBe(windowsNumber));
	}

	public void forUrlContains(String url, int time) {
		try {
			wait.ignoring(StaleElementReferenceException.class).withTimeout(Duration.ofMillis(time))
				.pollingEvery(Duration.ofMillis(100)).until(ExpectedConditions.urlContains(url));
		} catch (TimeoutException e) {
		    LOGGER.error(Arrays.toString(e.getStackTrace()));
		}
	}
}
