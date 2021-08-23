package com.argentina.tools;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	private String url = "jdbc:mysql://localhost:3306/tumercadito";
	private String user = "root";
	private String pass = "";
	private Connection conn = null;
	
	public DBConnection() {
		
		try {
			
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			conn = DriverManager.getConnection(url, user, pass);
			System.out.println("Database connected" );
		} catch (Exception e) {
			System.out.println("Database not connect");
			e.printStackTrace();
		}
		
	}
	
	public Connection getCon() {
		return conn;
	}
	
	public void closeCon() {
		 {
			try {
				if ( conn != null)
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
}
