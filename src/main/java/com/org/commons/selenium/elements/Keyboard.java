package com.org.commons.selenium.elements;

import com.org.commons.selenium.ImplementedBy;
import com.org.commons.selenium.elements.implementation.KeyboardImplementation;

@ImplementedBy(KeyboardImplementation.class)
public interface Keyboard extends Element {

	void pressEnter();

	void pressSpace();

	void pressEscape();

	void pressTab();
}
