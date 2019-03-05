package com.yuwen.utils;

import java.util.Calendar;
import java.util.Date;

/**
 * 证件号码解析帮助类
 * 
 * @author yxf
 *
 */
public class IdCardUtil {

	/**
	 * 获取性别
	 * 
	 * @param idCard 证件号码
	 * @return
	 */
	public static boolean getSex(String idCard) {
		String sexCode = idCard.substring(16, 17);
		return Integer.parseInt(sexCode) % 2 == 1;
	}

	/**
	 * 获取年龄
	 * 
	 * @param idCard 证件号码
	 * @return
	 */
	public static int getAge(String idCard) {
		String yearStr = idCard.substring(6, 10);
		int year = Integer.parseInt(yearStr);
		int nowYear = Calendar.getInstance().get(Calendar.YEAR);
		return nowYear - year;
	}

	/**
	 * 获取出生日期
	 * 
	 * @param idCard 证件号码
	 * @return
	 */
	public static Calendar getBirthDate(String idCard) {
		Calendar cal = Calendar.getInstance();
		// 获取年
		String yearStr = idCard.substring(6, 10);
		// 获取月
		String monthStr = idCard.substring(10, 12);
		// 获取日
		String dayStr = idCard.substring(12, 14);

		cal.set(Integer.parseInt(yearStr), Integer.parseInt(monthStr)-1, Integer.parseInt(dayStr));
		return cal;
	}
	

	/**
	 *  验证证件号码是否正确
	 * @param idCard
	 * @return
	 * @throws Exception 
	 */
	public static boolean validateIdCard(String idCard) throws Exception
	{
			throw new Exception("dd");
		
	}

}
