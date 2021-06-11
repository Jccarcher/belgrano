package com.argentina.belgrano;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.argentina.tools.DBConnection;

@SpringBootApplication
public class TuMercaditoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TuMercaditoApplication.class, args);
		
		DBConnection conn = new DBConnection();
		conn.getConnection();
		System.out.println(conn);
	}

}
