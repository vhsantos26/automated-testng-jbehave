package com.org.commons.driver;

import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;

import com.org.commons.environment.ProjectEnvironment;

/**
 * 
 * @author anderson.tavares
 *
 */
public class LoadDriver {

	private static DriverManager driverManager;
	private static DriverType driverType;
	private static ProjectEnvironment projectEnvironment = ConfigFactory.create(ProjectEnvironment.class);

	public static WebDriver getDriver() {
		return projectEnvironment.getLocal() ? getLocalChromeDriver() : getRemoteChromeDriver();
	}

	private static WebDriver getLocalChromeDriver() {
		driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
		driverType = DriverType.CHROME;
		return driverManager.getDriver();
	}

	private static WebDriver getRemoteChromeDriver() {
		driverManager = DriverManagerFactory.getManager(DriverType.CHROME_REMOTE);
		driverType = DriverType.CHROME_REMOTE;
		return driverManager.getDriver();
	}

	public static DriverType getDriverType() {
		return driverType;
	}

	public static void quitDriver() {
		driverManager.quitDriver();
	}
}