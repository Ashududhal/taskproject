package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.Id;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.BlManager;
import com.pojo.Supplier;


@WebServlet("/DeleteSupplier")
public class DeleteSupplier extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	BlManager bm=new BlManager();
	Supplier s=new Supplier();
	

    public DeleteSupplier() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		int id = Integer.parseInt(request.getParameter("id"));

		s = bm.searchbysid(id);

		bm.deletesid(s);

		pw.println("<script type=\"text/javascript\">");
		pw.println("alert('Supplier Deleted..');");
		pw.println("location='viewallsupplier.jsp';");
		pw.println("</script>");

		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	
	}

}
