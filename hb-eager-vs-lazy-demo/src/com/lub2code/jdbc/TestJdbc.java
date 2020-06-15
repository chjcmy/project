package com.lub2code.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

	public static void main(String[] args) {
		
		String jdbcUrl = "jdbc:mariadb://localhost:3306/hb-01-one-to-one-uni?useSSL=false&amp;serverTimezone=UTCe";
		String user = "root";
		String pass = "1234";
		
		try {
			System.out.println("Connecting to database: " + jdbcUrl);
			
			Connection myConn = 
					DriverManager.getConnection(jdbcUrl, user, pass);
			System.out.println("Connection success");
			
		} catch (Exception exc) {
			exc.printStackTrace();
		}
		
	}

}
