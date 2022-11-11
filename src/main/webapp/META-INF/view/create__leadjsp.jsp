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
<h2>Create | Lead</h2>
<form action= "savelead" method="post">
<pre>
     First name<input type="text"name="firstname"/>
     Last name<input type="text"name="lastname"/>
     Email <input type="email" name="email"/>
     Mobile<input type="number"name="mobile"/>
     Source :
		<select name="source">
		  <option value="news paper">news paper</option>
		  <option value="social media">social media</option>
		  <option value="online">online</option>
		  <option value="friends">friends</option>
		</select>
		 <input type="submit" value="save"/>
</pre>
</form>
</body>
</html>