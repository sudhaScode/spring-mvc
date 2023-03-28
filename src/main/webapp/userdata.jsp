<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%-- <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring Boot Application</title>
</head>
<body style="text-align: center;">
<h1 style="color:Green; font-size: 30px">User details</h1>
<h2>First Name: ${firstName}</h2>
<h2>Last Name: ${lastName}</h2>
<h2>Email: ${email}</h2>	
<%-- <c:forEach var="i" items="${data}" >
<h3>First Name: ${items.}</h3>
<h3>Last Name: ${i.lastName}</h3>
<h3>Email: ${i.email}</h3>
<br></br>
</c:forEach> --%>
</body>
</html>