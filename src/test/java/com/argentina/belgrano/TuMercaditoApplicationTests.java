package com.argentina.belgrano;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.argentina.tools.DBConnection;

@SpringBootTest
class TuMercaditoApplicationTests {

	@Test
	void contextLoads() {
		
		DBConnection conn = new DBConnection();
		conn.getConnection();
		System.out.println(conn);
		
	}

}
