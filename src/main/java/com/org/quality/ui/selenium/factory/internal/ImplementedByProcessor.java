package com.org.quality.ui.selenium.factory.internal;

import com.org.quality.ui.selenium.ImplementedBy;
import com.org.quality.ui.selenium.elements.Element;

public class ImplementedByProcessor {

    /**
     * Blank constructor to avoid the following sonar issue.
     * <b>Utility classes should not have public constructors (squid:S1118)</b>
     */
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
