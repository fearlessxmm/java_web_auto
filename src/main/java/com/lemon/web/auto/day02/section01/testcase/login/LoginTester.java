package com.lemon.web.auto.day02.section01.testcase.login;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.lemon.web.auto.day02.section01.base.BaseTester;

public class LoginTester extends BaseTester {
	// enabled = false不执行
	@Test(dataProvider = "dp1", dataProviderClass = LoginDataProvider.class)
	public void test_case_failure(LoginFailData failData) {
		to("login_url");
		sendKeys(By.id("mobilephone"), failData.getPhone());
		sendKeys(By.id("password"), failData.getPassword());
		click(By.id("login"));
		String actual = getElementTextNotNull(By.className("tips"));
		Assert.assertEquals(actual, failData.getExpectedTips());
	}

	@Test(dataProvider = "dp2", dataProviderClass = LoginDataProvider.class)
	public void test_case_success(LoginSuccessData successData) {
		to("login_url");
		sendKeys(By.id("mobilephone"), successData.getPhone());
		sendKeys(By.id("password"), successData.getPassword());
		click(By.id("login"));
		String url = getCurrentPageUrl(successData.getPartiaUrl());
		Assert.assertTrue(url.contains(successData.getPartiaUrl()));
	}

}
