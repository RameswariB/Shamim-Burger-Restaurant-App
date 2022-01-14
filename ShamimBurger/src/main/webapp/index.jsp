<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-image:url('background.jpg');background-repeat: no-repeat;background-attachment: fixed;background-size: 100% 100%;">
	<h1 style="color:white">Hello JSP and Servlet!</h1>
	<form action="helloServlet" method="post" style="color:white">
	    Enter your name: <input type="text" name="yourName" size="20">
	    <input type="submit" value="Add to Order" />
	</form>
</body>
</html>