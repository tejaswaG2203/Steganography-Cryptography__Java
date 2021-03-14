<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Form</title>
</head>
<body>
<h1>Registration Form</h1>
<form action="Register" method="post"><table style="width:60%">
<tr>
<td><h3>First Name :</h3></td>
<td><input type="text" name="firstname" placeholder="enter first name" /></td>
</tr>
<tr>
<td><h3>Last Name :</h3></td>
<td><input type="text" name="lastname" placeholder="enter last name" /></td>
</tr>
<tr>
<td><h3>User Name :</h3></td>
<td><input type="text" name="username" placeholder="enter user name" /></td>
</tr>
<tr>
<td><h3>Password :</h3></td>
<td><input type="password" name="password" placeholder="enter password" /></td>
</tr>
<tr><td></td><td><input type="submit" value="register"></td></tr>
</table></form>
</body>
</html>

