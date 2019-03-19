package com.org.quality.ui.selenium;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.org.quality.ui.selenium.elements.implementation.ElementImplementation;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface ImplementedBy {
	Class<?> value() default ElementImplementation.class;
}