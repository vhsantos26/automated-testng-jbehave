package com.org.quality.ui.selenium.factory.internal;

import static com.org.quality.ui.selenium.factory.internal.ImplementedByProcessor.getWrapperClass;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.pagefactory.ElementLocator;

import com.org.quality.ui.selenium.elements.Element;

public class ElementListHandler implements InvocationHandler {

	private final ElementLocator locator;
	private final Class<?> wrappingType;

	public <T> ElementListHandler(Class<T> interfaceType, ElementLocator locator) {
		this.locator = locator;
		if (!Element.class.isAssignableFrom(interfaceType)) {
			throw new RuntimeException("interface not assignable to Element.");
		}
		this.wrappingType = getWrapperClass(interfaceType);
	}

	public Object invoke(Object proxy, Method method, Object[] objects) throws Throwable {
		List<Object> wrappedList = new ArrayList<Object>();
		Constructor<?> cons = wrappingType.getConstructor(WebElement.class);
		for (WebElement element : locator.findElements()) {
			Object thing = cons.newInstance(element);
			wrappedList.add(wrappingType.cast(thing));
		}
		try {
			return method.invoke(wrappedList, objects);
		} catch (InvocationTargetException e) {
			throw e.getCause();
		}
	}

}
