package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.BlManager;
import com.pojo.Stock;


public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       BlManager bm=new BlManager();
       Stock s=new Stock();

    public UpdateServlet() {
        super();

    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String id1=request.getParameter("id");
		int id=Integer.parseInt(id1);
	
		s=bm.searchbyid(id);
		
		HttpSession session=request.getSession();
		session.setAttribute("list",s);
		
		response.sendRedirect("updatemedicine.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String mcompany = request.getParameter("mcompany");
		String mname = request.getParameter("mname");
		String mdescription = request.getParameter("mdescription");
		int quantity = Integer.parseInt(request.getParameter("quantity"));
		double price = Double.valueOf(request.getParameter("price"));
		String mdate = request.getParameter("mdate");
		String edate = request.getParameter("edate");
		System.out.println(mcompany);

		s.setMcompany(mcompany);
		s.setMname(mname);
		s.setMdescription(mdescription);
		s.setQuantity(quantity);
		s.setPrice(price);
		s.setMdate(mdate);
		s.setEdate(edate);

		bm.updatemedicine(s);
		
		out.println("<script type=\"text/javascript\">");
		out.println("alert('Medicine Update Done...');");
		out.println("location='viewallmedicines.jsp';");
		out.println("</script>");
	}

}
