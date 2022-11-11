<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>list</title>
</head>
<body>
	<a href="viewContactPage">create new contact</a>
	<h2>List All Contacts</h2>
	<table>
		<tr>
			<th>firstname</th>
			<th>lastname</th>
			<th>email</th>
			<th>Mobile</th>
			<th>source</th>
			<th>Billing</th>
		</tr>
		<c:forEach var="contact" items="${c}" >
		<tr>
			<td><a href="findcontactById?id=${contact.id}">${contact.firstname }</a></td>
			<td>${contact.lastname }</td>
			<td>${contact.email }</td>
			<td>${contact.mobile }</td>
			<td>${contact.source }</td> 
			
			<td><a href="generateBill?id=${contact.id}">generate Bill</a></td>

		</tr>
		</c:forEach>

	</table>
</body>
</html>