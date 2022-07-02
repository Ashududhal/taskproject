package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.BlManager;
import com.pojo.Contactus;


@WebServlet("/ContactServlet")
public class ContactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	BlManager bm=new BlManager();
	Contactus cu=new Contactus();

    public ContactServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
			response.setContentType("text/html");
			PrintWriter pw=response.getWriter();
			
			String fname=request.getParameter("fname");
			String lname=request.getParameter("lname");
			String email=request.getParameter("email");
			String message=request.getParameter("message");
			
			cu.setFname(fname);
			cu.setLname(lname);
			cu.setEmail(email);
			cu.setMessage(message);
			
			bm.savecontactus(cu);
			
			pw.println("<script type=\"text/javascript\">");
			pw.println("alert('We will contact soon...');");
			pw.println("location='index.html';");
			pw.println("</script>");
			
			

	}

}
