<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="pink">
<form action="second.jsp">
<%
String name=request.getParameter("ename");
out.println("Welcome: "+name);
session.setAttribute("user_session",name);
%>
<br>
<br>For second JSP page
<a href="second.jsp">Click here</a>


</body>
</html>