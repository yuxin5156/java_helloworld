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
			String url = "jdbc:mysql://localhost:3306/school_db?characterEncoding=utf-8&useSSL=false&useAffectedRows=true&serverTimezone=GMT%2B8&allowPublicKeyRetrieval=true";
			Connection conn = DriverManager.getConnection(url, "root", "123456");
			PreparedStatement ps = conn.prepareStatement("select * from ts_student");
			ResultSet rs = ps.executeQuery();
			int count = rs.getMetaData().getColumnCount();
			while (rs.next()) {
				for (int i = 1; i < count + 1; i++) {
					System.out.print(rs.getString(i)+"--");
				}

				System.out.println();
			}

		} catch (Exception e) {

			e.printStackTrace();
		}
	}
}
