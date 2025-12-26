package com.jdbcp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.MysqlDataSource;

public class RetriveData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn;
		PreparedStatement prp;
		
		ResultSet rs;
		MysqlDataSource ds;
		
		ds=new MysqlDataSource();
		ds.setUser("root");
		ds.setPassword("1234");
		ds.setServerName("localhost");
		ds.setDatabaseName("db_j2ee");
		try {
			String qry="select * from students";
		conn=ds.getConnection();
		prp=conn.prepareStatement(qry);
		rs=prp.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
		}
		}
		catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}

	}

}
