<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Contact us</title>
<link rel="icon" type="pic/png" href="pic/download (1).png" sizes="16x16">
</head>
<body bgcolor="lightblue">
<form action="ContactServlet" method="post">

		<div style="background-color:black;color:white;padding:50px;/">
  <h2 align="center">Contact us</h2>
  
</div>
		
				<div style="background-color:cyan;color:white;padding:50px;/">
				<p align="center"><input type="text" name="fname" placeholder="First name"></p>
				<p align="center"><input type="text" name="lname" placeholder="Last name"></p>
				<p align="center"><input type="email" name="email" placeholder="Email"></p>
				<p align="center"><input type="text" name="message" placeholder="Message"></p>
				<p align="center"><input type="submit" value="submit"></p>
				
				</div>

</form>
</body>


</html>