package com.jdbcp;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.MysqlDataSource;

public class BulkOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection conn=null;
		Statement st;
		MysqlDataSource ds;
		ds=new MysqlDataSource();
		ds.setUser("root");
		ds.setPassword("1234");
		ds.setServerName("localhost");
		ds.setDatabaseName("db_j2ee");
		try {
			conn=ds.getConnection();
			conn.setAutoCommit(false);
			st=conn.createStatement();
			st.addBatch("insert into students values(03,'css')");
			st.addBatch("insert into students values(04,'css3')");
			st.executeBatch();
			System.out.println("Done");
			
			
		} catch (SQLException e) {
			try {
				conn.rollback();
				
			}
		   catch (Exception e2) {
			// TODO: handle exception
			   e2.printStackTrace();
		}
		}
		
		finally {
			try {
				conn.commit();
			}
			catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}

	}

}
