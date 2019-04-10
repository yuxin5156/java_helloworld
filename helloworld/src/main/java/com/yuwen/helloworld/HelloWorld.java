package com.yuwen.helloworld;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import com.yuwen.mybaits.poco.Student;

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

	public static void main(String[] args) {
	
		Student p=new Student();
		p.setStudentId(1);
		p.setAge(18);
		p.setCreateTime(new Date());
		p.setName("惠惠");
		p.setGender(false);
		
		try {
			BeanInfo beanInfo = Introspector.getBeanInfo(Student.class);
			PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
			
		Arrays.stream(propertyDescriptors).forEach(r->{
				try {
					String filedName=r.getName();
					if(!filedName.equals("class"))
					{
						System.out.println(filedName+":"+r.getReadMethod().invoke(p));
					}
				
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
			
			
		});
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}


