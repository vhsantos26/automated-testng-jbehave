package com.org.quality.ui.driver;

import com.org.quality.ui.driver.browser.chrome.ChromeDriverManager;
import com.org.quality.ui.driver.browser.remote.RemoteChromeDriverManager;

public class DriverManagerFactory {

    /**
     * Blank constructor to avoid the following sonar issue.
     * <b>Utility classes should not have public constructors (squid:S1118)</b>
     */
    private DriverManagerFactory() {}
    
	public static DriverManager getManager(DriverType type) {
		DriverManager driverManager;

		switch (type) {
		case CHROME:
			driverManager = ChromeDriverManager.instance();
			break;
		case CHROME_REMOTE:
			driverManager = RemoteChromeDriverManager.instance();
			break;
		default:
			driverManager = ChromeDriverManager.instance();
			break;
		}
		return driverManager;
	}
}
