package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.BlManager;
import com.pojo.Cart;
import com.pojo.Customer;
import com.pojo.Stock;


@WebServlet("/AddToCartController")
public class AddToCartController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	BlManager bm=new BlManager();
	Stock s=new Stock();
	Cart c=new Cart();
	Customer cm=new Customer();

    public AddToCartController() {
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
			String mname=request.getParameter("mname");
			double price=Double.valueOf(request.getParameter("price"));
			int quantity1=Integer.parseInt(request.getParameter("quantity"));
			
			System.out.println(price);
			
			System.out.println(s.getQuantity());
			
			cm=bm.searchbycustomername(cname);
			s=bm.searchbystockname(mname);
			
			int total = (int) (quantity1 * price);
			
			c.setTotal(total);
			c.setPrice(price);
			c.setCustomer(cm);
			c.setSelectedmedicine(mname);
			c.setSelectedquantity(quantity1);
			c.setCustname(cname);
		
			int q1=s.getQuantity();
			
			if(quantity1 < q1)
			{
					bm.addtocart(c);
					int q2 = quantity1 - q1;
					s.setQuantity(quantity1);
					bm.updatestock(s);
					pw.println("<script type=\"text/javascript\">");
					pw.println("alert('Medicine Added to Cart...');");
					pw.println("location='sellmedicine.jsp';");
					pw.println("</script>");
			}
			else
			{
				pw.println("<script type=\"text/javascript\">");
				pw.println("alert('Stock is not available...');");
				pw.println("location='sellmedicine.jsp';");
				pw.println("</script>");
			}
			
	}

}
	