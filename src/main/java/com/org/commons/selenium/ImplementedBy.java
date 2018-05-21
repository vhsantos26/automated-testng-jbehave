package com.org.commons.selenium;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.org.commons.selenium.elements.implementation.ElementImplementation;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface ImplementedBy {
	Class<?> value() default ElementImplementation.class;
}