package com.lemon.web.auto.day02.section01.testcase.login;

import com.lemon.web.auto.day02.section01.pojo.ExcelObject;

public class LoginSuccessData extends ExcelObject {
	// Phone PassWord partiaUrl
	private String phone;
	private String password;
	private String partiaUrl;

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPartiaUrl() {
		return partiaUrl;
	}

	public void setPartiaUrl(String partiaUrl) {
		this.partiaUrl = partiaUrl;
	}

	@Override
	public String toString() {
		return "LoginSuccessData [phone=" + phone + ", password=" + password + ", partiaUrl=" + partiaUrl + "]";
	}

}
