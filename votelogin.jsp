<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
 <%@include file="navbar.html" %> 
<link rel="stylesheet" type="text/css" href="css/votelogin.css">
</head>
<body background="nature1.jpg">
<form action="login" class="container">
<h1>Login Here</h1>
<label>UserName</label>
<input type="text" placeholder="Enter Username" name="name"><br><br>
<label>Password</label>
<input type="password" placeholder="Enter Password" name="password"><br><br>
<input type="submit" class="button" value="login">
</form>
</body>
</html>