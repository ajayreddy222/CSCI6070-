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
<center><h2>Nested/Sub Queries Result</h2> </center>
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
		<th>Title Id</th>
		<th>Ordering</th>
		<th>Title</th>
		<th>Region</th>
		<th>Language</th>
		<th>Types</th>
		<th>Attributes</th>
		<th>Original Title</th>
	</tr>
	<c:forEach var="nestedqueries" items="${nestedqueriess}">
		<tr>
			<td>${nestedqueries.titleid}</td>
			<td>${nestedqueries.ordering}</td>
			<td>${nestedqueries.title}</td>
			<td>${nestedqueries.region}</td>
			<td>${nestedqueries.language}</td>
			<td>${nestedqueries.types}</td>
			<td>${nestedqueries.attributes}</td>
			<td>${nestedqueries.isOrgiginaltitle}</td>
		</tr>
	</c:forEach>
</table>
