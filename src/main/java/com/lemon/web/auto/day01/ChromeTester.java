package com.lemon.web.auto.day01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTester {

	public static void main(String[] args) throws InterruptedException {
		// 自动打开浏览器
		System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
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
