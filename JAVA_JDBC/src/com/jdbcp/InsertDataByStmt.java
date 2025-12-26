package com.jdbcp;

import java.sql.Connection;
import java.sql.Statement;

import com.mysql.cj.jdbc.MysqlDataSource;

public class InsertDataByStmt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn;
		Statement st;
		MysqlDataSource ds=new MysqlDataSource();
		ds.setUser("root");
		ds.setPassword("1234");
		ds.setServerName("localhost");
		ds.setDatabaseName("db_j2ee");
		try {
			String qry="insert into students values(05,'JPA')";
		conn=ds.getConnection();
		st=conn.createStatement();
		int row=st.executeUpdate(qry);
		if(row > 0) {
			System.out.println("Data Inserted ");
		}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
