package com.yuwen.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SerializeUtils {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException
	{
		List<Sperson> list=new ArrayList<Sperson>();
		for (int i = 0; i < 10; i++) {
			Sperson p=new Sperson();
			p.setName("yuxinf"+i);
			p.setAge(16+i);
			p.setGender(i%2==0);
			list.add(p);
		}
		
		//序列化到文件
		ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream(new File("d:/demo/jserialize.txt")));
		os.writeObject(list);
		os.close();
		System.out.println("序列化成功");
		//反序列化
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream(new File("d:/demo/jserialize.txt")));
		List<Sperson> dlist= (List<Sperson>)ois.readObject();
		
		System.out.println(dlist);
		
		
		
	}
	
}

class Sperson implements Serializable
{
	
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	private boolean gender;
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
	@Override
	public String toString() {
		return "Sperson [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
	
	
}
