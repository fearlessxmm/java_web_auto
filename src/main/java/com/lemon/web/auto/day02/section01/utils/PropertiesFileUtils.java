package com.lemon.web.auto.day02.section01.utils;

import java.io.IOException;
import java.util.Properties;

public class PropertiesFileUtils {
	static Properties properties = new Properties();
	static {
		try {
			properties.load(PropertiesFileUtils.class.getResourceAsStream("/url.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String getUrl(String urlKey) {
		return properties.getProperty(urlKey);
	}

}
