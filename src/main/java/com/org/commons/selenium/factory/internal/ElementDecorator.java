package com.org.commons.selenium.factory.internal;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.internal.Locatable;
import org.openqa.selenium.internal.WrapsElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.pagefactory.ElementLocator;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;
import org.openqa.selenium.support.pagefactory.FieldDecorator;
import org.openqa.selenium.support.pagefactory.internal.LocatingElementListHandler;

import com.org.commons.selenium.ImplementedBy;
import com.org.commons.selenium.elements.Element;

public class ElementDecorator implements FieldDecorator {
	private ElementLocatorFactory factory;

	public ElementDecorator(ElementLocatorFactory factory) {
		this.factory = factory;
	}

	public Object decorate(ClassLoader loader, Field field) {
		if (!(WebElement.class.isAssignableFrom(field.getType()) || isDecoratableList(field))) {
			return null;
		}

		if (field.getDeclaringClass() == com.org.commons.selenium.elements.implementation.ElementImplementation.class) {
			return null;
		}

		ElementLocator locator = factory.createLocator(field);
		if (locator == null) {
			return null;
		}

		Class<?> fieldType = field.getType();
		if (WebElement.class.equals(fieldType)) {
			fieldType = Element.class;
		}

		if (WebElement.class.isAssignableFrom(fieldType)) {
			return proxyForLocator(loader, fieldType, locator);
		} else if (List.class.isAssignableFrom(fieldType)) {
			Class<?> erasureClass = getErasureClass(field);
			return proxyForListLocator(loader, erasureClass, locator);
		} else {
			return null;
		}
	}

	private Class<?> getErasureClass(Field field) {
		Type genericType = field.getGenericType();
		if (!(genericType instanceof ParameterizedType)) {
			return null;
		}
		return (Class<?>) ((ParameterizedType) genericType).getActualTypeArguments()[0];
	}

	private boolean isDecoratableList(Field field) {
		if (!List.class.isAssignableFrom(field.getType())) {
			return false;
		}

		Class<?> erasureClass = getErasureClass(field);
		if (erasureClass == null) {
			return false;
		}

		if (!WebElement.class.isAssignableFrom(erasureClass)) {
			return false;
		}

		if (field.getAnnotation(FindBy.class) == null && field.getAnnotation(FindBys.class) == null
				&& field.getAnnotation(FindAll.class) == null) {
			return false;
		}

		return true;
	}

	protected <T> T proxyForLocator(ClassLoader loader, Class<T> interfaceType, ElementLocator locator) {
		InvocationHandler handler = new ElementHandler(interfaceType, locator);

		T proxy;
		proxy = interfaceType.cast(Proxy.newProxyInstance(loader,
				new Class[] { interfaceType, WebElement.class, WrapsElement.class, Locatable.class }, handler));
		return proxy;
	}

	@SuppressWarnings("unchecked")
	protected <T> List<T> proxyForListLocator(ClassLoader loader, Class<T> interfaceType, ElementLocator locator) {
		InvocationHandler handler;
		if (interfaceType.getAnnotation(ImplementedBy.class) != null) {
			handler = new ElementListHandler(interfaceType, locator);
		} else {
			handler = new LocatingElementListHandler(locator);
		}
		List<T> proxy;
		proxy = (List<T>) Proxy.newProxyInstance(loader, new Class[] { List.class }, handler);
		return proxy;
	}
}
