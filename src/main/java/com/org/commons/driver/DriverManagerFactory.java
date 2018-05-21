package com.org.commons.driver;

import com.org.commons.driver.browser.chrome.ChromeDriverManager;
import com.org.commons.driver.browser.remote.RemoteChromeDriverManager;

/**
 * Responsável por realizar a chamada da classe que irá realizar a criação e a
 * inicialização do driver.
 * 
 * @author victor.santos
 *
 */
public class DriverManagerFactory {

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
