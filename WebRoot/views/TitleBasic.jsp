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
<center><h2> Title.Basic Table Result </h2> </center>
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
		<th>Tconst</th>
		<th>Title Type</th>
		<th>Primary Title</th>
		<th>Original Title</th>
		<th>Adult</th>
		<th>Start Year</th>
		<th>End Year</th>
		<th>Runtime Minutes</th>
		<th>Genres</th>
	</tr>
	<c:forEach var="titlebasic" items="${titlebasics}">
		<tr>
			<td>${titlebasic.tconst}</td>
			<td>${titlebasic.titleType}</td>
			<td>${titlebasic.primaryTitle}</td>
			<td>${titlebasic.originalTitle}</td>
			<td>${titlebasic.isAdult}</td>
			<td>${titlebasic.startYear}</td>
			<td>${titlebasic.endYear}</td>
			<td>${titlebasic.runtimeMinutes}</td>
			<td>${titlebasic.genres}</td>
		</tr>
	</c:forEach>
</table>
