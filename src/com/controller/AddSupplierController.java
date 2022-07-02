package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.BlManager;
import com.pojo.Supplier;

/**
 * Servlet implementation class AddSupplierController
 */
@WebServlet("/AddSupplierController")
public class AddSupplierController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	BlManager bm=new BlManager();
	Supplier s=new Supplier();
	
   
    public AddSupplierController() {
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
			
			String sname=request.getParameter("sname");
			String scontact=request.getParameter("scontact");
			String semail=request.getParameter("semail");
			String saddreess=request.getParameter("saddress");
			
			s.setSname(sname);
			s.setSmobile(scontact);
			s.setSemail(semail);
			s.setSaddress(saddreess);
			
			bm.saveSupplier(s);
			
			pw.println("<script type=\"text/javascript\">");
			pw.println("alert('Supplier Added Succesfully.....');");
			pw.println("location='addsupplier.jsp';");
			pw.print("</script>");
			
			
	}

}
