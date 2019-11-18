package com.lemon.web.auto.day02.section01.testcase.login;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

import com.lemon.web.auto.day02.section01.utils.DataProviderUtils;

public class LoginDataProvider {
	// 反向测试用例：由于其他类调用方法时，使用类名.方法名，所以方法需要静态声明
	@DataProvider
	public static Object[][] dp1(Method method) {
		System.out.println(method.getName());
		return DataProviderUtils.getData("/testcase/login/login.xlsx", 0, LoginFailData.class);
	}

	// 正向测试用例
	@DataProvider
	public static Object[][] dp2(Method method) {
		System.out.println(method.getName());
		return DataProviderUtils.getData("/testcase/login/login.xlsx", 1, LoginSuccessData.class);
	}
}
