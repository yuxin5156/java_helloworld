package com.yuwen.mybaits;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

public class MybatisTest {

	@Test
	public void GetStudentById() throws IOException {
		SqlSessionFactoryBuilder sb = new SqlSessionFactoryBuilder();
		InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
		SqlSessionFactory sqlSessionFactory= sb.build(inputStream);
		SqlSession sqlSession= sqlSessionFactory.openSession();
		Object obj=sqlSession.selectOne("student.getStudentById");
		System.out.println(obj);
 
		sqlSession.close();
	}
}
