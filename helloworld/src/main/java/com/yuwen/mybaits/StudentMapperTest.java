package com.yuwen.mybaits;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

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
		openSession.close();
	
	}
	
	
	@Test
	public void testGetStudentByName() {
		SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();
		SqlSession openSession = sqlSessionFactory.openSession();
		StudentMapper studentMapper= openSession.getMapper(StudentMapper.class);
		List<StudentModel> students = studentMapper.getStudentByName("张");
		System.out.println(students);
		openSession.close();
	
	}
	@Test
	public void testgetStudentByIds() {
		SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();
		SqlSession openSession = sqlSessionFactory.openSession();
		StudentMapper studentMapper= openSession.getMapper(StudentMapper.class);
		List<StudentModel> students = studentMapper.getStudentByIds(Arrays.asList(1,2,3,4));
		System.out.println(students);
		openSession.close();
	
	}
	

}
