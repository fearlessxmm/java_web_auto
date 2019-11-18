package com.lemon.web.auto.day02.section01.testcase.register;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.lemon.web.auto.day02.section01.base.BaseTester;

public class RegisterTester extends BaseTester {
	@Test(dataProvider = "dp1", dataProviderClass = RegisterDataProvider.class)
	public void test_case(String mobilephone, String password, String pwdconfirm, String verifycode, String expected) {
		to("register_url");
		sendKeys(By.id("mobilephone"), mobilephone);
		sendKeys(By.id("password"), password);
		sendKeys(By.id("pwdconfirm"), pwdconfirm);
		sendKeys(By.id("verifycode"), verifycode);
		click(By.id("signup-button"));
		String actual = getElementTextNotNull(By.className("tips"));
		Assert.assertEquals(actual, expected);
	}
}
