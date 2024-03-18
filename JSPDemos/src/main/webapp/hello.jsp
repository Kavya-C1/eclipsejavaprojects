<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="errorHandler.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Welcome to JS</h1>
<%String name = "Sri";
out.println("welcome "+name);
%>

<%int x=10,y=20; %>
<%out.println("Sum "+(x+y)); %>
<br>
<%String name1 = "Srilk";%>
<%="welcome "+name1%>
<%="Sum "+(x+y)%>
<br>
<%int counter=1; %>
<%=counter++ %>
<br>
<%!int counter = 0; %>
You are visitor no: <%= ++counter %>
<br>
<%! String greet(){
	return "Welcome back";
}
	%>
	<%=greet()  %>
	
	
	
	<%int z=10/0; %>


</body>
</html>