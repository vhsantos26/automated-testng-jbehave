package com.org.commons.driver;

import org.openqa.selenium.WebDriver;

/**
 * Classe base para os demais drives. Neste, contém os métodos para criar,
 * iniciar e parar o serviço de um driver.
 * 
 * @author victor.santos
 *
 */
public abstract class DriverManager {

	protected WebDriver driver;

	protected abstract void startService();

	protected abstract void createDriver();

	protected abstract void stopService();

	public void quitDriver() {
		if (driver != null) {
			driver.close();
			driver.quit();
			driver = null;
		}
	}

	public WebDriver getDriver() {
		if (driver == null) {
			startService();
			createDriver();
		}
		return driver;
	}
}
