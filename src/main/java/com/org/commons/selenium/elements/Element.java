package com.org.commons.selenium.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.internal.Locatable;
import org.openqa.selenium.internal.WrapsElement;

import com.org.commons.selenium.ImplementedBy;
import com.org.commons.selenium.elements.implementation.ElementImplementation;

@ImplementedBy(ElementImplementation.class)
public interface Element extends WebElement, WrapsElement, Locatable {

	Keyboard keyboard();

}
