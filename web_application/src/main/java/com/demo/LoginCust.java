package com.demo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import com.mysql.cj.jdbc.MysqlDataSource;

/**
 * Servlet implementation class LoginCust
 */
@WebServlet("/log")
public class LoginCust extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginCust() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String user=request.getParameter("user");
		String pwd=request.getParameter("pwd");
		
		Connection conn;
		PreparedStatement prp;
		MysqlDataSource ds=new MysqlDataSource();
		ds.setUser("root");
		ds.setPassword("1234");
		ds.setServerName("localhost");
		ds.setDatabaseName("db_j2ee");
		try {
			 String qry="insert into students values(?,?)";
			conn=ds.getConnection();
			prp=conn.prepareStatement(qry);
			prp.setString(1,user);
			prp.setString(2,pwd);
			int row=prp.executeUpdate();
			if(row > 0) {
				
				response.sendRedirect("Welcome.html");
				out.print("Done");
			}
			else {
				out.print("Not passs");
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			
			e.printStackTrace();
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
