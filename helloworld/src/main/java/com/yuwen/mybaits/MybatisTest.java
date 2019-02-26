package com.yuwen.mybaits;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

public class MybatisTest {

	/**
	 * 根据id查询学生
	 * @throws IOException
	 */
	@Test
	public void GetStudentById() throws IOException {
		
		SqlSession sqlSession=SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
		Object obj=sqlSession.selectOne("student.getStudentById",1);
		System.out.println(obj);
 
		sqlSession.close();
	}
	/**
	 * 根据条件模糊查询学生
	 * @throws IOException
	 */
	@Test
	public void GetStudentByName() throws IOException {
		
		SqlSession sqlSession=SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
		List<StudentModel> obj=sqlSession.selectList("student.getStudentByName","小");
		System.out.println(obj);
 
		sqlSession.close();
	}
	
	
	/**
	 * 插入学生，返回自增id
	 * @throws IOException
	 */
	@Test
	public void AddStuent() throws IOException {
	
		StudentModel stu=new StudentModel();
		
		stu.setName("张飞");
		stu.setAge(18);
		stu.setGender(true);
		stu.setCreate_time(new Date());
		
		SqlSession sqlSession=SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
		sqlSession.insert("student.addStudent",stu);
		System.out.println(stu);
		sqlSession.commit();//一定要提交才会保存到数据库
		sqlSession.close();
		
	}
	
	
	/**
	 * 删除学生，返回自增id
	 * @throws IOException
	 */
	@Test
	public void RemoveStuent() throws IOException {

		
		SqlSession sqlSession=SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
		sqlSession.delete("student.removeStudentById",7);
		
		sqlSession.commit();//一定要提交才会保存到数据库
		sqlSession.close();
		
	}
	
	
	
	
	
	
	
	
	
	
}
