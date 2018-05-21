package com.org.commons.selenium.elements;

import com.org.commons.selenium.ImplementedBy;
import com.org.commons.selenium.elements.implementation.InputImplementation;

@ImplementedBy(InputImplementation.class)
public interface Input extends Element {
	void fillWith(String value);
}
