package com.capg.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class MyJdbcMain {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo?characterEncoding=utf8", "root", "root");

			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from emp");
			while (rs.next()) {
				System.out.println("id :" + rs.getInt(1)+" "+"name :" + rs.getString(2)+" "+"Dept :" + rs.getString(3));
		

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
