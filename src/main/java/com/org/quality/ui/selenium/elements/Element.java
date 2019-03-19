package com.org.quality.ui.selenium.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Locatable;
import org.openqa.selenium.internal.WrapsElement;

import com.org.quality.ui.selenium.ImplementedBy;
import com.org.quality.ui.selenium.elements.implementation.ElementImplementation;

@ImplementedBy(ElementImplementation.class)
public interface Element extends WebElement, WrapsElement, Locatable {

	Keyboard keyboard();

}
