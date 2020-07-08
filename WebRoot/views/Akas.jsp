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
<center><h2> Title.Akas table Result </h2> </center>
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
	<c:forEach var="akas" items="${akass}">
		<tr>
			<td>${akas.titleid}</td>
			<td>${akas.ordering}</td>
			<td>${akas.title}</td>
			<td>${akas.region}</td>
			<td>${akas.language}</td>
			<td>${akas.types}</td>
			<td>${akas.attributes}</td>
			<td>${akas.isOrgiginaltitle}</td>
		</tr>
	</c:forEach>
</table>