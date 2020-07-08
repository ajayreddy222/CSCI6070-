<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<base href="<%=basePath%>">

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Nested Queries Result</title>
</head>
<body>
<center><h2> Title.Principal Table Result </h2> </center>
<hr>
</body>
</html>

<style>
table, th, td {
  border: 1px solid black;
}
</style>
<table>
	<tr>
		<th>TConst</th>
		<th>Ordering</th>
		<th>Nconst</th>
		<th>Category</th>
		<th>Job</th>
		<th>characters</th>
	</tr>
	<c:forEach var="principal" items="${principals}">
		<tr>
			<td>${principal.tconst}</td>
			<td>${principal.ordering}</td>
			<td>${principal.nconst}</td>
			<td>${principal.category}</td>
			<td>${principal.job}</td>
			<td>${principal.characters}</td>
		</tr>
	</c:forEach>
</table>