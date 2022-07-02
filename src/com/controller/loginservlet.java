package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.BlManager;
import com.pojo.Admin;


@WebServlet("/loginservlet")
public class loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       BlManager bm=new BlManager();
       Admin a=new Admin();

    public loginservlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		if(username.equals("admin")&&password.equals("admin"))
		{
			pw.println("<script type=\"text/javascript\">");
			pw.println("alert('Welcome To Admin Panel...');");
			pw.println("location='PharmacyDashboard.jsp';");
			pw.println("</script>");
		}
		else
		{
			pw.println("<script type=\"text/javascript\">");
			pw.println("alert('Invalid Credentials...');");
			pw.println("location='login.jsp';");
			pw.println("</script>");
		}
		a.setUsername(username);
		a.setPassword(password);
		bm.saveadmin(a);
		
		
		
	}

}
