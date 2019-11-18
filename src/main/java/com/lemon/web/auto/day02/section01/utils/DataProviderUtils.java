package com.lemon.web.auto.day02.section01.utils;

import java.util.ArrayList;

import com.lemon.web.auto.day02.section01.pojo.ExcelObject;

public class DataProviderUtils {
	/**
	 * 测试用例类的公共方法
	 * 
	 * @param excelName
	 * @param sheetIndex
	 * @param clazz
	 * @return
	 */
	public static Object[][] getData(String excelName, int sheetIndex, Class<? extends ExcelObject> clazz) {
		ArrayList<Object> objs = ExcelUtils.readExcel(excelName, sheetIndex, clazz);
		// 创建一个二维数组
		Object[][] datas = new Object[objs.size()][];
		// 遍历所有的LoginFailData对象，每个LoginFailData对象保存到一个一维数组--》4个一维数组---》二维数组
		for (int i = 0; i < objs.size(); i++) {
			Object[] itemArray = { objs.get(i) };
			datas[i] = itemArray;
		}
		return datas;
	}

}
