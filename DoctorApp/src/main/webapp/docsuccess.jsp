<%@page import="com.doctorapp.model.Doctor"%>

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
Doctor doctor = (Doctor) request.getAttribute("doctor");

String name = doctor.getDoctorName();
out.print("Welcome "+name+"<br>");

%>


</body>
</html>