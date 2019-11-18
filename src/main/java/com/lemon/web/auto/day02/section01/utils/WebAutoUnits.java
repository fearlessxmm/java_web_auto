package com.lemon.web.auto.day02.section01.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;

public class WebAutoUnits {
	/**
	 * 获得driver
	 * 
	 * @param browserName浏览器名称
	 * @return
	 */
	public static WebDriver getDriver(String browserName, String selenuimVersion) {
		WebDriver driver = null;
		if ("ie".equalsIgnoreCase(browserName)) {
			return getIEDriver();
		} else if ("chrome".equalsIgnoreCase(browserName)) {
			return getChromeDriver();
		} else if ("firefox".equalsIgnoreCase(browserName)) {
			return getFireFoxDriver(selenuimVersion);
		} else if ("edge".equalsIgnoreCase(browserName)) {
			return getEdgeDriver();
		} else if ("opera".equalsIgnoreCase(browserName)) {
			return getOperaDriver();
		} else {
			throw new RuntimeException("没有对应的浏览器！");
		}
	}

	private static WebDriver getOperaDriver() {
		// TODO Auto-generated method stub
		return null;
	}

	public static WebDriver getEdgeDriver() {
		System.setProperty(EdgeDriverService.EDGE_DRIVER_EXE_PROPERTY,
				"src/main/resources/driver/MicrosoftWebDriver.exe");
		return new EdgeDriver();
	}

	public static WebDriver getFireFoxDriver(String selenuimVersion) {
		WebDriver driver;
		if (!"2.x".equalsIgnoreCase(selenuimVersion)) {
			// System.setProperty(火狐驱动);
		}
		return new FirefoxDriver();
	}

	public static WebDriver getChromeDriver() {
		WebDriver driver;
		System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY,
				"src/main/resources/driver/chromedriver.exe");
		return new ChromeDriver();
	}

	public static WebDriver getIEDriver() {
		WebDriver driver;
		System.setProperty(InternetExplorerDriverService.IE_DRIVER_EXE_PROPERTY,
				"src/main/resources/driver/IEDriverServer.exe");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
		capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		capabilities.setCapability(InternetExplorerDriver.INITIAL_BROWSER_URL, "https://www.baidu.com");
		return new InternetExplorerDriver(capabilities);
	}

}
