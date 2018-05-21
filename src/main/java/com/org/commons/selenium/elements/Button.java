package com.org.commons.selenium.elements;

import com.org.commons.selenium.ImplementedBy;
import com.org.commons.selenium.elements.implementation.ButtonImplementation;

@ImplementedBy(ButtonImplementation.class)
public interface Button extends Element {

}
