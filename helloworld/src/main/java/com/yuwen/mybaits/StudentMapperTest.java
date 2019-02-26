package com.yuwen.mybaits;

import static org.junit.Assert.*;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

public class StudentMapperTest {

	@Test
	public void testGetStudentById() {
		SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();
		SqlSession openSession = sqlSessionFactory.openSession();
		StudentMapper studentMapper= openSession.getMapper(StudentMapper.class);
		StudentModel student = studentMapper.getStudentById(1);
		System.out.println(student);
		
		
	}

}
