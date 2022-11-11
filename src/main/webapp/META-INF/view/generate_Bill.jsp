<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>create</title>
</head>
<body>
<h2>Create | Bill</h2>
<form action= "savebill" method="post">
<pre>
     First name<input type="text"name="firstname" value="${contact.firstname}"/>
     Last name<input type="text"name="lastname" value="${contact.lastname}"/>
     Email <input type="email" name="email" value="${contact.email}"/>
     Mobile<input type="number"name="mobile" value="${contact.mobile}"/>
     Product<input type="text" name="product"/>
     Amount<input type="text" name="amount"/>
	 <input type="submit" value="generate bill"/>
</pre>
</form>
</body>
</html>