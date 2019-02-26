package com.yuwen.mybaits;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionFactoryUtils {

	private static SqlSessionFactory sqlSessionFactory;
	
	static {
		
		SqlSessionFactoryBuilder sb = new SqlSessionFactoryBuilder();
		InputStream inputStream;
		try {
			inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
			 sqlSessionFactory= sb.build(inputStream);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	};
	public static SqlSessionFactory getSqlSessionFactory()
	{
		return sqlSessionFactory;
	}
	 
	
	
}
