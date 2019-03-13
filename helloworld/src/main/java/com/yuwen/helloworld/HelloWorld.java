package com.yuwen.helloworld;

import java.util.Collections;

public class HelloWorld {

	public String getTest() {

		return "ddd";
	}

	public void rtTest() {
		String test = getTest();
	}
	
	public static String hideSensitiveInfo(String plainText, int left, int right) {
		String replaceChar = "*";
		String result = "";
		if (plainText.length() < left + right) {
			result = String.join("", Collections.nCopies(left + right, replaceChar));
		} else {
			String leftStr = plainText.substring(0, left);
			String rightStr = plainText.substring(plainText.length() - right, plainText.length());
			String rchars = String.join("", Collections.nCopies(plainText.length() - left - right, replaceChar));
			result = leftStr + rchars + rightStr;

		}
		return result;
	}
	
	public static void main(String[] args)
	{
	String result1=	hideSensitiveInfo("贵州省贵阳市观山湖区世纪城龙耀苑", 4, 4);
	System.out.println(result1);
	String result2=	hideSensitiveInfo("18786703675", 3, 4);
	System.out.println(result2);
	}

}


