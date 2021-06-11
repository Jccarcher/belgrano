package com.argentina.tools;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	private String url = "jdbc:mysql://localhost:3306/tumercadito";
	private String user = "root";
	private String pass = "";
	private Connection conn = null;
	
	public void getConnection() {
		
		try {
			
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			conn = DriverManager.getConnection(url, user, pass);
			System.out.println("Database connected" );
		} catch (Exception e) {
			System.out.println("Database not connect");
			e.printStackTrace();
		}finally {
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();;
			}
		}
	}
	
	
}
