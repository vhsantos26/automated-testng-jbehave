package com.org.commons.driver.browser.remote;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.org.commons.driver.DriverManager;
import com.org.commons.driver.browser.BrowserOptions;

/**
 * 
 * @author victor.santos
 *
 */
public class RemoteChromeDriverManager extends DriverManager {

	private static RemoteChromeDriverManager instance = null;

	private RemoteChromeDriverManager() {
		// sem inicializacao via new
	}

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
			e.printStackTrace();
		}
	}

	@Override
	protected void stopService() {
		// NOP
	}
}
