
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
out.println("SessionId "+session.getId()+"<br>");
out.println("Maxinactive "+session.getMaxInactiveInterval()+"<br>");
String username = (String)session.getAttribute("username");
session.setMaxInactiveInterval(1);
out.println("Welcome "+username+"<br>");

%>
<form action="movieServlet">
Language
<select name="language">
<option value="kannada">Kannada</option>
<option value="english">English</option>
<option value="hindi">Hindi</option>
</select>
<input type="submit" value="show movies">
</form>

</body>
</html>