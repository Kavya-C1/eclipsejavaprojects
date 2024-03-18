<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="searchServlet">
Enter doctorName<input type="text" name="doctorName">

Speciality 
<select values="speciality">
<option value="gynec">Gynec</option>
<option value="ortho">Ortho</option>
<option value="derma">Derma</option>
</select>

<br><br>
<input type="submit" value="submit">

<br><br><br><br>


<a href="login.jsp" name="loginadmin">Admin</a>

</body>
</html>