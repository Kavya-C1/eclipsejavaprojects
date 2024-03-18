<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="employeeServlet" >
Enter name<input type="text" name="employeeName"><br>
Enter employeeId<input type="text" name="employeeId"><br>
Enter salary<input type="number" name="salary"><br>
Enter city<input type="text" name="city"><br>

Course <select name="Language">
<option value="Java">Java</option>
<option value="Spring">Spring</option>
<option value="Html">HTML</option>
</select>


<input type="submit" value="submit"><br>

</form>
</body>
</html>