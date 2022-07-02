package com.model;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;


import com.pojo.Admin;
import com.pojo.Cart;
import com.pojo.Contactus;
import com.pojo.Customer;
import com.pojo.Stock;
import com.pojo.Supplier;

public class BlManager 
{
		SessionFactory con=new Configuration().configure().buildSessionFactory();
		
		public void saveadmin(Admin a)
		{
			Session s1=con.openSession();
			Transaction t1=s1.beginTransaction();
			s1.save(a);
			t1.commit();
			s1.close();
		}
	
		public void savemedicine(Stock s)
		{
			Session s1=con.openSession();
			Transaction t1=s1.beginTransaction();
			s1.save(s);
			t1.commit();
			s1.close();
			
		}
		
		public List<Stock> viewallm()
		{
			Session s1=con.openSession();
			Criteria cr=s1.createCriteria(Stock.class);
			List<Stock> e=cr.list();
			return e;
		}
		
		public Stock searchbyid(int id) 
		{
			Session s1=con.openSession();
			Criteria cr=s1.createCriteria(Stock.class);
			cr.add(Restrictions.eq("sid", id));
			Stock s=(Stock) cr.uniqueResult();
			return s;
			
		}
		
		public void updatemedicine(Stock s)
		{
			Session s1=con.openSession();
			Transaction t1=s1.beginTransaction();
			s1.update(s);
			t1.commit();
			s1.close();
			
		}
		
		public void deleteid(Stock s) 
		{
			Session s1=con.openSession();
			Transaction t1=s1.beginTransaction();
			s1.delete(s);
			t1.commit();
			s1.close();
			
		}
		
		public void saveSupplier(Supplier s) 
		{
			Session s1=con.openSession();
			Transaction t1=s1.beginTransaction();
			s1.save(s);
			t1.commit();
			s1.close();
			
		}
		
		public List<Supplier> viewallsupplier()
		{
			Session s1=con.openSession();
			Criteria cr=s1.createCriteria(Supplier.class);
			List<Supplier> e=cr.list();
			return e;
		}
		
		public Supplier searchbyid1(int id) 
		{
			Session s1=con.openSession();
			Criteria cr=s1.createCriteria(Supplier.class);
			cr.add(Restrictions.eq("supid", id));
			Supplier c=(Supplier)cr.uniqueResult();
			return c;
		}
		
		public void updateSupplier(Supplier s) 
		{
			Session s1=con.openSession();
			Transaction t1=s1.beginTransaction();
			s1.update(s);
			t1.commit();
			s1.close();
			
		}
		
		public void deletesid(Supplier s) 
		{
			Session s1=con.openSession();
			Transaction t1=s1.beginTransaction();
			s1.delete(s);
			t1.commit();
			s1.close();
			
		}
		
		public Supplier searchbysid(int id)
		{
			Session s1=con.openSession();
			Criteria cr=s1.createCriteria(Supplier.class);
			cr.add(Restrictions.eq("supid", id));
			Supplier c=(Supplier) cr.uniqueResult();
			return c;
		}
		
		public void saveCustomer(Customer c)
		{
			Session s1=con.openSession();
			Transaction t1=s1.beginTransaction();
			s1.save(c);
			t1.commit();
			s1.close();
			
		}
		
		public List<Customer> viewcustomer()
		{
			Session s1=con.openSession();
			Criteria cr=s1.createCriteria(Customer.class);
			List<Customer> e=cr.list();
			return e;
		}
		
		public List<Customer> searchcustomer()
		{
			Session s1=con.openSession();
			Criteria cr=s1.createCriteria(Customer.class);
			List<Customer> e=cr.list();
			return e;
		}
		
		public List<Stock> searchstock()
		{
			Session s1=con.openSession();
			Criteria cr=s1.createCriteria(Stock.class);
			List<Stock> e=cr.list();
			return e;
		}
		
		public void updatestock(Stock s)
		{
			Session s1=con.openSession();
			Transaction t1=s1.beginTransaction();
			s1.update(s);
			t1.commit();
			s1.close();
			
			
		}

		public Customer searchbycustomername(String cname) 
		{
			Session s1=con.openSession();
			Criteria cr=s1.createCriteria(Customer.class);
			cr.add(Restrictions.eq("cname", cname));
			Customer c=(Customer) cr.uniqueResult();
			return c;
		}

		public Stock searchbystockname(String mname) 
		{
			Session s1=con.openSession();
			Criteria cr=s1.createCriteria(Stock.class);
			cr.add(Restrictions.eq("mname", mname));
			Stock s=(Stock) cr.uniqueResult();
			return s;
		}

		public void addtocart(Cart c) 
		{
			Session s1=con.openSession();
			Transaction t1=s1.beginTransaction();
			s1.save(c);
			t1.commit();
			s1.close();
		}
		public List<Customer> searchcustlist()
		{
			Session s1=con.openSession();
			Criteria cr=s1.createCriteria(Customer.class);
			List<Customer> e=cr.list();
			return e;
		}
		public List<Cart> searchbycname(String cname)
		{
			Session s1=con.openSession();
			Criteria cr=s1.createCriteria(Cart.class);
			cr.add(Restrictions.eq("custname", cname));
			List<Cart> c=cr.list();
			return c;
			
		}
		public Customer serachbyCustomername(String cname)
		{
			Session s1=con.openSession();
			Criteria cr=s1.createCriteria(Customer.class);
			cr.add(Restrictions.eq("cname", cname));
			Customer c=(Customer) cr.uniqueResult();
			return c;
		}
		public void savecontactus(Contactus cu)
		{
			Session s1=con.openSession();
			Transaction t1=s1.beginTransaction();
			s1.save(cu);
			t1.commit();
			s1.close();
		}
		public List<Contactus> viewallmessage()
		{
			Session s1=con.openSession();
			Criteria cr=s1.createCriteria(Contactus.class);
			List<Contactus> e=cr.list();
			return e;
		}
		public void deleteid(Contactus cu)
		{
			Session s1=con.openSession();
			Transaction t1=s1.beginTransaction();
			s1.delete(cu);
			t1.commit();
			s1.close();
		}

		public Contactus searchbycid(int id) 
		{
			Session s1=con.openSession();
			Criteria cr=s1.createCriteria(Contactus.class);
			cr.add(Restrictions.eq("cid", id));
			Contactus cu=(Contactus) cr.uniqueResult();
			return cu;
		}
		
		
		

}
		
		
		
		
		

