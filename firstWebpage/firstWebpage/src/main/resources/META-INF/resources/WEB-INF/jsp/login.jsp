<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<h1 align="center">Welcome!!</h1>
<h2 align="center">Login For More Details.....</h2>
<pre align="center" color="red"	> ${errorMsg}</pre>

<form align="center" method="post">
	Name: <input type="text" name="name">
	
	Password: <input type="password" name="password">
	<input type="submit">

</form>


</body>
</html>