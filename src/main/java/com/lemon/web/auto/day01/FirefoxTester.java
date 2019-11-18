package com.lemon.web.auto.day01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxTester {

	public static void main(String[] args) throws InterruptedException {
		// 自动启动浏览器
		FirefoxDriver driver = new FirefoxDriver();
		// 自动输入url
		driver.get("https://www.baidu.com");
		// 自动找到百度输入框，输入要查找的内容
		WebElement input = driver.findElement(By.id("kw"));
		// System.out.println(input.getAttribute("name"));
		input.sendKeys("自动化测试");
		// 自动找到百度一下按钮，点击
		WebElement btn = driver.findElement(By.id("su"));
		btn.click();
		// System.out.println(btn.getAttribute("type"));
		// 自动关闭浏览器
		Thread.sleep(5000);
		driver.quit();
	}

}
