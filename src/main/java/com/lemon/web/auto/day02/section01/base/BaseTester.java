package com.lemon.web.auto.day02.section01.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.lemon.web.auto.day02.section01.utils.PropertiesFileUtils;
import com.lemon.web.auto.day02.section01.utils.WebAutoUnits;

public class BaseTester {
	protected static WebDriver driver = null;

	@BeforeSuite
	public void beforeSuite() {
		driver = WebAutoUnits.getDriver("chrome", "2.x");
	}

	@AfterSuite
	public void AfterSuite() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}

	/**
	 * 获取当前的页面的路径
	 * 
	 * @return
	 */
	protected String getCurrentPageUrl(String partiaUrl) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		String currentPageUrl = wait.until(new ExpectedCondition<String>() {
			@Override
			public String apply(WebDriver input) {
				System.out.println("=================");
				if (driver.getCurrentUrl().contains(partiaUrl)) {
					return driver.getCurrentUrl();
				}
				return null;
			}

		});
		return currentPageUrl;
	}

	/**
	 * 获取元素（dom结构中存在）（加入等待）
	 * 
	 * @param by
	 * @return
	 */
	protected WebElement getElement(By by) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(new ExpectedCondition<WebElement>() {
			@Override
			public WebElement apply(WebDriver input) {
				return driver.findElement(by);// dom结构中存在
			}
		});
		return element;

	}

	/**
	 * 获取元素文本（加入等待）
	 * 
	 * @param by
	 * @return
	 */
	protected String getElementTextNotNull(By by) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		String elementText = wait.until(new ExpectedCondition<String>() {
			@Override
			public String apply(WebDriver input) {
				// 先去获取元素
				WebElement element = getElement(by);
				// 如果元素不为空，元素文本不为空，元素文本长度大于0
				// 真正能返回非空是下面条件成立的时候
				if (element != null && element.getText() != null && element.getText().length() > 0) {
					return element.getText();
				}
				return null;
			}
		});
		return elementText;
	}

	/**
	 * 点击元素
	 * 
	 * @param by元素定位器Locator
	 */
	protected void click(By by) {
		getElement(by).click();
	}

	/**
	 * 输入内容
	 * 
	 * @param by
	 * @param content
	 */
	protected void sendKeys(By by, String content) {
		getElement(by).sendKeys(content);
	}

	/**
	 * 获取文本内容
	 * 
	 * @param by
	 * @return
	 */
	protected String getText(By by) {
		return getElement(by).getText();
	}

	/**
	 * 去到某个url
	 * 
	 * @param url
	 */
	protected void to(String url) {
		driver.get(PropertiesFileUtils.getUrl(url));
	}
}
