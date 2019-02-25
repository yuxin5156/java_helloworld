package com.yuwen.mybaits;

import java.util.Date;

public class StudentModel {

	private String student_id;
	
	private String name;
	
	private int age;
	
	private boolean gender;
	
	private Date create_time;

	public String getStudent_id() {
		return student_id;
	}

	public void setStudent_id(String student_id) {
		this.student_id = student_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	@Override
	public String toString() {
		return "StudentModel [student_id=" + student_id + ", name=" + name + ", age=" + age + ", gender=" + gender
				+ ", create_time=" + create_time + "]";
	}
	
	
}
