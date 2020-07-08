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
<title>JoinOperation.jsp</title>
</head>
<body>
<center><h2> Join Operations </h2> </center>
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
	<c:forEach var="joinoperation" items="${joinoperations}">
		<tr>
			<td>${joinoperation.titleid}</td>
			<td>${joinoperation.ordering}</td>
			<td>${joinoperation.title}</td>
			<td>${joinoperation.region}</td>
			<td>${joinoperation.language}</td>
			<td>${joinoperation.types}</td>
			<td>${joinoperation.attributes}</td>
			<td>${joinoperation.isOrgiginaltitle}</td>
			<td>${joinoperation.tconst}</td>
			<td>${joinoperation.titleType}</td>
			<td>${joinoperation.primaryTitle}</td>
			<td>${joinoperation.originalTitle}</td>
			<td>${joinoperation.isAdult}</td>
			<td>${joinoperation.startYear}</td>
			<td>${joinoperation.endYear}</td>
			<td>${joinoperation.runtimeMinutes}</td>
			<td>${joinoperation.genres}</td>
		</tr>
	</c:forEach>
</table>