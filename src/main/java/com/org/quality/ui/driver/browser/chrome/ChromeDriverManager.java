package com.org.quality.ui.driver.browser.chrome;

import java.io.File;
import java.util.Arrays;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.org.quality.ui.driver.DriverManager;
import com.org.quality.ui.driver.browser.BrowserOptions;

public class ChromeDriverManager extends DriverManager {

    private static final Logger LOGGER = LoggerFactory.getLogger(ChromeDriverManager.class);
    
    private ChromeDriverService chromeService;

    private static ChromeDriverManager instance = null;

    /**
     * Blank constructor to avoid the following sonar issue.
     * <b>Utility classes should not have public constructors (squid:S1118)</b>
     */
    private ChromeDriverManager() {}

    public static ChromeDriverManager instance() {
        synchronized (ChromeDriverManager.class) {
            if (instance == null) {
                instance = new ChromeDriverManager();
            }
            return instance;
        }
    }

    @Override
    protected void startService() {
        if (chromeService == null) {
            try {
                chromeService = new ChromeDriverService.Builder().usingDriverExecutable(
                    new File("src/main/resources/drivers/chrome/windows/74.0.3729.6.exe"))
                        .usingAnyFreePort()
                        .build();
                chromeService.start();
            } catch (Exception e) {
                LOGGER.error(Arrays.toString(e.getStackTrace()));
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
