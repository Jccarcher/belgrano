package com.argentina.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.argentina.entity.Mercado;
import com.argentina.tools.DBConnection;

public class DaoMercado {

private DBConnection db;	
private Mercado mc;
	
	public DaoMercado() {
	
		db = new DBConnection();
		Connection cone = null;
		String query = "SELECT id,nombre,ubicacion FROM `mercado`";
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		try {
			cone = db.getCon();
			pst = cone.prepareStatement(query);
			pst.setInt(1, mc.getId());
			pst.setString(2, mc.getNombre());
			pst.setString(3, mc.getUbicacion());
			pst.execute();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (cone != null) {
					db.closeCon();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	

}
