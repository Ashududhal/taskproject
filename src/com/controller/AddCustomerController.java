package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.BlManager;
import com.pojo.Customer;


@WebServlet("/AddCustomerController")
public class AddCustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    BlManager bm=new BlManager();
    Customer c=new Customer();
    
    
    
    public AddCustomerController() 
    {
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
			
			String cname=request.getParameter("cname");
			String cphone=request.getParameter("cphone");
			
			c.setCname(cname);
			c.setCphone(cphone);
			
			bm.saveCustomer(c);
			
			pw.println("<script type=\"text/javascript\">");
			pw.println("alert('Customer Added Succesfully....');");
			pw.println("location='addcustomer.jsp';");
			pw.println("</script>");
	}

}
