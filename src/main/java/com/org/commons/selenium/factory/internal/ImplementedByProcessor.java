package com.org.commons.selenium.factory.internal;

import com.org.commons.selenium.ImplementedBy;
import com.org.commons.selenium.elements.Element;

/**
 * 
 * @author victor.santos
 * @since 18 de mai de 2018
 *
 */
public class ImplementedByProcessor {
	private ImplementedByProcessor() {
	}

	public static <T> Class<?> getWrapperClass(Class<T> iface) {
		if (iface.isAnnotationPresent(ImplementedBy.class)) {
			ImplementedBy annotation = iface.getAnnotation(ImplementedBy.class);
			Class<?> clazz = annotation.value();
			if (Element.class.isAssignableFrom(clazz)) {
				return annotation.value();
			}
		}
		throw new UnsupportedOperationException("Apply @ImplementedBy interface to your Interface "
				+ iface.getCanonicalName() + " if you want to extend ");
	}

}
