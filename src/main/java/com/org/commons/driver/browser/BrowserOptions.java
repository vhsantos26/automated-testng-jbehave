package com.org.commons.driver.browser;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * 
 * @author victor.santos
 *
 */
public class BrowserOptions {

	public static ChromeOptions chrome() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("test-type", "no-sandbox", "start-maximized", "disable-infobars");

		return options;
	}

	public static DesiredCapabilities chromeCapabilities() {
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(ChromeOptions.CAPABILITY, chrome());

		return capabilities;
	}
}
