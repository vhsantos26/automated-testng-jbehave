package com.org.quality.ui.driver.browser;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BrowserOptions {

    /**
     * Blank constructor to avoid the following sonar issue.
     * <b>Utility classes should not have public constructors (squid:S1118)</b>
     */
    private BrowserOptions() {}
    
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
