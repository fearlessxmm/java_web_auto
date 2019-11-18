package com.lemon.web.auto.day01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeTester {

	public static void main(String[] args) {
		// 自动打开浏览器 版本是18的，官网上18的驱动器需要指令？？
		System.setProperty("webdriver.edge.driver", "src/main/resources/driver/MicrosoftWebDriver.exe");
		EdgeDriver driver = new EdgeDriver();
		// 自动输入url
		driver.get("https://baidu.com");
		// 自动找到搜索框
		WebElement input = driver.findElement(By.id("kw"));
		System.out.println(input.getAttribute("name"));
	}

}
