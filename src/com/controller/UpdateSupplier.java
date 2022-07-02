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
import com.pojo.Supplier;


@WebServlet("/UpdateSupplier")
public class UpdateSupplier extends HttpServlet {
	private static final long serialVersionUID = 1L;
       BlManager bm=new BlManager();
       Supplier s=new Supplier();

    public UpdateSupplier() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
			String id1=request.getParameter("id");
			int id=Integer.parseInt(id1);
			
			s=bm.searchbyid1(id);
			
			HttpSession session = request.getSession();
			session.setAttribute("list", s);

			response.sendRedirect("updatesupplier.jsp");

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
			response.setContentType("text/html");
			PrintWriter pw=response.getWriter();
			
			String sname=request.getParameter("sname");
			String scontact=request.getParameter("scontact");
			String semail=request.getParameter("semail");
			String saddress=request.getParameter("saddress");
			
			s.setSname(sname);
			s.setSemail(semail);
			s.setSmobile(scontact);
			s.setSaddress(saddress);
			
			bm.updateSupplier(s);
			
			pw.println("<script type=\"text/javascript\">");
			pw.println("alert('Supplier Update Done...');");
			pw.println("location='viewallsupplier.jsp';");
			pw.println("</script>");
	}

}
