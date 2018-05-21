package com.org.commons.driver.browser.chrome;

import java.io.File;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import com.org.commons.driver.DriverManager;
import com.org.commons.driver.browser.BrowserOptions;

/**
 * 
 * @author victor.santos
 *
 */
public class ChromeDriverManager extends DriverManager {

	private ChromeDriverService chromeService;

	private static ChromeDriverManager instance = null;

	private ChromeDriverManager() {
		// sem inicializacao via new
	}

	public static ChromeDriverManager instance() {
		synchronized (ChromeDriverManager.class) {
			if (instance == null)
				instance = new ChromeDriverManager();
			return instance;
		}

	}

	@Override
	protected void startService() {
		if (chromeService == null) {
			try {
				chromeService = new ChromeDriverService.Builder()
						.usingDriverExecutable(new File("src/main/resources/drivers/chromedriver.exe"))
						.usingAnyFreePort()
						.build();
				chromeService.start();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	protected void createDriver() {
		driver = new ChromeDriver(chromeService, BrowserOptions.chrome());
	}

	@Override
	protected void stopService() {
		if (chromeService != null && chromeService.isRunning()) {
			chromeService.stop();
		}
	}

}