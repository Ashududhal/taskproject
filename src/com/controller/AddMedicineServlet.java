package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.BlManager;
import com.pojo.Stock;


@WebServlet("/AddMedicineServlet")
public class AddMedicineServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	BlManager bm=new BlManager();
	Stock s=new Stock();
       

    public AddMedicineServlet() {
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
			
			String mcompany=request.getParameter("mcompany");
			String mname=request.getParameter("mname");
			String mdescription=request.getParameter("mdescription");
			int quantity=Integer.parseInt(request.getParameter("quantity"));
			double price=Double.valueOf(request.getParameter("price"));
			String mdate=request.getParameter("mdate");
			String edate=request.getParameter("edate");
			
			System.out.println(mcompany);
			
			s.setMcompany(mcompany);
			s.setMname(mname);
			s.setMdescription(mdescription);
			s.setQuantity(quantity);
			s.setPrice(price);
			s.setMdate(mdate);
			s.setEdate(edate);
			
			bm.savemedicine(s);
			
			pw.println("<script type=\"text/javascript\">");
			pw.print("alert('Medicine Addded Succecfully.....');");
			pw.print("location='addmedicine.jsp';");
			pw.print("</script>");
			
	}

}
