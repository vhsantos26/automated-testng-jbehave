package com.org.quality.ui.selenium.elements.implementation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Locatable;
import org.openqa.selenium.interactions.internal.Coordinates;

import com.org.quality.ui.driver.DriverManagerFactory;
import com.org.quality.ui.driver.LoadDriver;
import com.org.quality.ui.selenium.elements.Element;
import com.org.quality.ui.selenium.elements.Keyboard;
import com.org.quality.ui.selenium.elements.utils.WaitHelper;

public class ElementImplementation implements Element {

	protected final WebElement element;
	protected final WebDriver driver;
	protected final WaitHelper wait;

	public ElementImplementation(final WebElement element) {
		this.element = element;
		this.driver = DriverManagerFactory.getManager(LoadDriver.getDriverType()).getDriver();
		wait = new WaitHelper(this.driver);
	}

	public void click() {
		wait.forElementToBeClickable(element);
		element.click();
	}

	public void submit() {
		wait.forVisibilityOf(element);
		element.submit();
	}

	public void sendKeys(CharSequence... keysToSend) {
		wait.forVisibilityOf(element);
		for (CharSequence keyToSend : keysToSend) {
			for (int i = 0; i < keyToSend.length(); i++) {
				element.sendKeys(keyToSend.charAt(i) + "");
			}
		}
	}

	public void clear() {
		wait.forVisibilityOf(element);
		element.clear();
	}

	public String getTagName() {
		wait.forVisibilityOf(element);
		return element.getTagName();
	}

	public String getAttribute(String name) {
		wait.forVisibilityOf(element);
		return element.getAttribute(name);
	}

	public boolean isSelected() {
		wait.forVisibilityOf(element);
		return element.isSelected();
	}

	public boolean isEnabled() {
		wait.forVisibilityOf(element);
		return element.isEnabled();
	}

	public String getText() {
		wait.forVisibilityOf(element);
		return element.getText();
	}

	public List<WebElement> findElements(By by) {
		wait.forVisibilityOf(element);
		return element.findElements(by);
	}

	public WebElement findElement(By by) {
		wait.forVisibilityOf(element);
		return element.findElement(by);
	}

	public boolean isDisplayed() {
		return element.isDisplayed();
	}

	public Point getLocation() {
		wait.forVisibilityOf(element);
		return element.getLocation();
	}

	public Dimension getSize() {
		wait.forVisibilityOf(element);
		return element.getSize();
	}

	public Rectangle getRect() {
		wait.forVisibilityOf(element);
		return element.getRect();
	}

	public String getCssValue(String propertyName) {
		wait.forVisibilityOf(element);
		return element.getCssValue(propertyName);
	}

	public <X> X getScreenshotAs(OutputType<X> target) {
		wait.forVisibilityOf(element);
		return element.getScreenshotAs(target);
	}

	public WebElement getWrappedElement() {
		wait.forVisibilityOf(element);
		return element;
	}

	public Coordinates getCoordinates() {
		wait.forVisibilityOf(element);
		return ((Locatable) element).getCoordinates();
	}

	public Keyboard keyboard() {
		return new KeyboardImplementation(element);
	}
}
