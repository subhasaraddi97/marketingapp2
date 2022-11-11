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
	<a href="viewLeadPage">create new lead</a>
	<h2>List All Leads</h2>
	<table>
		<tr>
			<th>firstname</th>
			<th>lastname</th>
			<th>email</th>
			<th>Mobile</th>
			<th>source</th>
		</tr>
		<c:forEach var="lead" items="${leads}" >
		<tr>
			<td><a href="findLeadById?id=${lead.id}">${lead.firstname }</a></td>
			<td>${lead.lastname }</td>
			<td>${lead.email }</td>
			<td>${lead.mobile }</td>
			<td>${lead.source }</td>

		</tr>
		</c:forEach>

	</table>
</body>
</html>