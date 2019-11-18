package com.lemon.web.auto.day02.section01.bak;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.lemon.web.auto.day02.section01.utils.WebAutoUnits;

public class LoginTester {

	public static void main(String[] args) throws InterruptedException {
		// 封装浏览器driver获取方法，传入参数
		WebDriver driver = WebAutoUnits.getDriver("firefox", "2.x");
		driver.get("https://www.baidu.com");
		WebElement input = driver.findElement(By.id("kw"));
		input.sendKeys("自动化测试");
		WebElement btn = driver.findElement(By.id("su"));
		btn.click();
		Thread.sleep(5000);
		driver.quit();
	}

}
