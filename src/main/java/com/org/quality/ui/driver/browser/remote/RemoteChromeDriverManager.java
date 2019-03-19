package com.org.quality.ui.driver.browser.remote;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.org.quality.ui.driver.DriverManager;
import com.org.quality.ui.driver.browser.BrowserOptions;

public class RemoteChromeDriverManager extends DriverManager {

    private static final Logger LOGGER = LoggerFactory.getLogger(RemoteChromeDriverManager.class);
    
	private static RemoteChromeDriverManager instance = null;

    /**
     * Blank constructor to avoid the following sonar issue.
     * <b>Utility classes should not have public constructors (squid:S1118)</b>
     */
	private RemoteChromeDriverManager() {}

	public static RemoteChromeDriverManager instance() {
		synchronized (RemoteChromeDriverManager.class) {
			if (instance == null)
				instance = new RemoteChromeDriverManager();
			return instance;
		}

	}
	
	@Override
	protected void startService() {
		// NOP
	}

	@Override
	protected void createDriver() {
		try {
			driver = new RemoteWebDriver(new URL("http://localhost:4000/wd/hub"), BrowserOptions.chrome());
		} catch (MalformedURLException e) {
			LOGGER.error(Arrays.toString(e.getStackTrace()));
		}
	}

	@Override
	protected void stopService() {
		// NOP
	}
}
