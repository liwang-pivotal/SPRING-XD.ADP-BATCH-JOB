package io.spring.app;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class App {
	public static void main(String[] args) throws SQLException,
			ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = (Connection) DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/test", "lwang", "aaa");
		Statement stmt = (Statement) conn.createStatement();
		String query = "select * from Persons ;";
		ResultSet rs = stmt.executeQuery(query);
		System.out.println(rs.toString());
	}
}
