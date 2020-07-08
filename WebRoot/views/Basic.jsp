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
<center><h2> Name.Basic Table Result </h2> </center>
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
		<th>NConst</th>
		<th>Primary Name</th>
		<th>Birth Year</th>
		<th>Death Year</th>
		<th>Primary Profession</th>
		<th>Knows For Title</th>
	</tr>
	<c:forEach var="basic" items="${basics}">
		<tr>
			<td>${basic.nconst}</td>
			<td>${basic.primaryName}</td>
			<td>${basic.birthYear}</td>
			<td>${basic.deathYear}</td>
			<td>${basic.primaryProfession}</td>
			<td>${basic.knownForTitles}</td>
		</tr>
	</c:forEach>
</table>

