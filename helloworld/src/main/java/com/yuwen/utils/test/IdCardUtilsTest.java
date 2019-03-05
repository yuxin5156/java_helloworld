package com.yuwen.utils.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.junit.Test;

import com.yuwen.utils.IdCardUtil;

public class IdCardUtilsTest {

	public static final String ID_CARD = "520115201709132047";

	@Test
	public void getSex() {

		boolean sex = IdCardUtil.getSex(ID_CARD);
		System.out.println(sex);
	}

	@Test
	public void getAge() {
		int result = IdCardUtil.getAge(ID_CARD);
		System.out.println(result + "岁");
	}

	@Test
	public void getBirthDate() {
		Calendar result = IdCardUtil.getBirthDate(ID_CARD);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String ste = sdf.format(result.getTime());
		System.out.println(ste);
	}
	
	

}
