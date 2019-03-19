package com.org.quality.ui.selenium.elements;

import com.org.quality.ui.selenium.ImplementedBy;
import com.org.quality.ui.selenium.elements.implementation.InputImplementation;

@ImplementedBy(InputImplementation.class)
public interface Input extends Element {
	void fillWith(String value);
}
