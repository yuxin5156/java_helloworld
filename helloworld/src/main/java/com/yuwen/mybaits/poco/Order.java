package com.yuwen.mybaits.poco;

public class Order {

	
	private  String id;
	private  String studentId;
	
	private  String name;
	
	private  String address;
	
	private  String createTime;

	
	public Student student;


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getStudentId() {
		return studentId;
	}


	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}


	@Override
	public String toString() {
		return "Order [id=" + id + ", studentId=" + studentId + ", name=" + name + ", address=" + address
				+ ", createTime=" + createTime + ", student=" + student + "]";
	}


	


	
	
	
}
