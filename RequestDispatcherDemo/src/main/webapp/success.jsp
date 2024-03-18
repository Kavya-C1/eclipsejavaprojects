<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="errorHandler.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">     
<title>Insert title here</title>
</head>
<body>

<h2>User Details</h2>

<%
	String employeename = (String)request.getAttribute("employeename");
String city = (String)request.getAttribute("city");
double salary = (Double)request.getAttribute("salary");
String course = (String)request.getAttribute("course");
Long mobile = (Long)request.getAttribute("mobile");
String[] hobbies = (String[])request.getAttribute("hobbies");

out.println("Name: "+employeename+"<br>");
out.println("City: "+city+"<br>");
out.println("Salary: "+salary+"<br>");
out.println("Selected course: "+course+"<br>");
out.println("Mobile: "+mobile+"<br>");
out.println("Hobbies: ");
for(String hobby:hobbies){
	out.println("hobby: "+hobby.toUpperCase()+"<br>");
}
%>

</body>
</html>