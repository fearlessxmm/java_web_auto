package com.lemon.web.auto.day01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class IETester {

	public static void main(String[] args) throws InterruptedException {
		// 自动打开浏览器
		System.setProperty("webdriver.ie.driver", "src/main/resources/driver/IEDriverServer.exe");

		// 能力映射
		DesiredCapabilities capabilities = new DesiredCapabilities();
		// 缩放
		capabilities.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
		// 安全模式
		capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		// 重开浏览器窗口
		capabilities.setCapability(InternetExplorerDriver.INITIAL_BROWSER_URL, "https://www.baidu.com");

		InternetExplorerDriver driver = new InternetExplorerDriver(capabilities);
		// 自动输入url
		driver.get("https://baidu.com");
		// 自动找到搜索框,输入指定内容
		WebElement input = driver.findElement(By.id("kw"));
		// System.out.println(input.getAttribute("name"));
		input.sendKeys("自动化测试");
		// 自动找到百度一下按钮，点击
		driver.findElement(By.id("su")).click();
		// 线程休息5秒
		Thread.sleep(5000);
		// 关闭浏览器
		driver.quit();
	}

}
