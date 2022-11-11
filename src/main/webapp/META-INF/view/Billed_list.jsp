<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib prefix="c" url="http://java.sun.com/jsp/jstl/core"%>
 <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
         <h2>Billed List Here </h2>
         <table>
             <tr>
                  <th>Firstname</th>
                  <th>lastname</th>
                  <th>email</th>
                  <th>mobile</th>
                  <th>product</th>
                  <th>amount</th>
                  
             </tr>
             <c:forEach var="b" items="${B}">
             <tr>
                 <td>${b.firstname } </td>
                 <td>${b.lastname } </td>
                 <td>${b.email } </td>
                 <td>${b.mobile } </td>
                 <td>${b.product } </td>
                 <td>${b.amount } </td>
               
             </tr>
             
           </c:forEach>
         
         
         
         </table>
</body>
</html>