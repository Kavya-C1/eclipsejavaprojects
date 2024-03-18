<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head> 
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="register" method="post">
Enter name<input type="text" name="employeename"><br>
Enter city<input type="text" name="city"><br>
Enter salary<input type="number" name="salary"><br>
Enter mobileNum<input type="tel" name="mobile"><br>

Course <select name="course">
<option value="Java">Java</option>
<option value="Spring">Spring</option>
<option value="Html">HTML</option>
</select>

Hobby
<input type="checkbox" name="hobbies" value="sports">Sports
<input type="checkbox" name="hobbies" value="music">Music
<input type="checkbox" name="hobbies" value="dance">Dance
<input type="checkbox" name="hobbies" value="travel">Travel

<input type="submit" value="submit">
</form> 
</body>
</html>