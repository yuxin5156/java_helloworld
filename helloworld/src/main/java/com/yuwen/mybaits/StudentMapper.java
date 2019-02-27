package com.yuwen.mybaits;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface StudentMapper {
	/**
	 * 获取用户
	 * @param student_id
	 * @return
	 */
	StudentModel getStudentById(int student_id);
	
	

	
	/**
	 * 根据姓名查询
	 * @param name
	 * @return
	 */
	List<StudentModel> getStudentByName(String name);
	
	/**
	 * @param ids
	 * @return
	 */
	List<StudentModel> getStudentByIds(@Param("ids") List<Integer> ids);

}
