package com.yuwen.helloworld;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

/**
 * jdbc����
 * 
 * @author yxf
 *
 */
public class JdbcTest {

	@Test
	public void select() {

		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://192.168.100.250:3306/information_schema?characterEncoding=utf-8&useSSL=false&useAffectedRows=true&serverTimezone=GMT%2B8";
			Connection conn = DriverManager.getConnection(url, "root", "ktwl123456");
			PreparedStatement ps = conn.prepareStatement("select * from tables");
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
			System.out.println(rs.getString(1));	
			System.out.println(rs.getString(2));	
			System.out.println("========");
			}
			

		} catch (Exception e) {

			e.printStackTrace();
		}
	}
}
