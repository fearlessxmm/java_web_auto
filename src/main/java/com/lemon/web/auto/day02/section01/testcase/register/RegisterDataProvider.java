package com.lemon.web.auto.day02.section01.testcase.register;

import org.testng.annotations.DataProvider;

public class RegisterDataProvider {
	// 反向测试用例：由于其他类调用方法时，使用类名.方法名，所以方法需要静态声明
	@DataProvider
	public static Object[][] dp1() {
		return new Object[][] { new Object[] { "", "", "", "", "用户名不能为空" },
				new Object[] { "xmm", "", "", "", "非法的手机号" }, new Object[] { "13888888888", "", "", "", "密码不能为空" },
				new Object[] { "13888888888", "12345", "", "", "密码长度至少为6位" },
				new Object[] { "13888888888", "123456", "", "", "重复密码不能为空" },
				new Object[] { "13888888888", "123456", "123456", "", "验证码不能为空" } };
	}

	// 正向测试用例
	@DataProvider
	public static Object[][] dp2() {
		return new Object[][] { new Object[] { "13888888888", "123456", "123456", "LM19", "用户名不能为空" } };
	}
}
