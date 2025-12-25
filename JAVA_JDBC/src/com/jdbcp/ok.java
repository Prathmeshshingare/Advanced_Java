package com.jdbcp;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.mysql.cj.jdbc.MysqlDataSource;

public class ok {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn;
		PreparedStatement prp;
		MysqlDataSource ds;

		ds = new MysqlDataSource();
		try {
			ds.setUser("root");
			ds.setPassword("1234");
			ds.setServerName("localhost");
			ds.setDatabaseName("db_j2ee");
			String qry = "insert into students values(?,?)";
			conn = ds.getConnection();
			prp = conn.prepareStatement(qry);
			prp.setInt(1, 122);
			prp.setString(2, "vikas");
			int row = prp.executeUpdate();
			if (row > 0) {
				System.out.println("data entered ");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
