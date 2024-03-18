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

<form action="addServlet">
Enter doctorName<input type="text" name="doctorName"><br><br>
Enter doctorId<input type="text" name="doctorId"><br><br>


Speciality 
<select values="speciality">
<option value="gynec">Gynec</option>
<option value="ortho">Ortho</option>
<option value="derma">Derma</option>
</select>
<br><br>

Fees<input type="text" name="fees"><br><br>
Ratings<input type="text" name="ratings"><br><br>
Experience<input type="text" name="experience"><br><br>


<input type="submit" value="submit">

</form>

</body>
</html>