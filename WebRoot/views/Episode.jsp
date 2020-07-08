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
<center><h2> Title.Episode Table Result </h2> </center>
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
		<th>Parent Tconst</th>
		<th>Season Number</th>
		<th>Episode Number</th>
	</tr>
	<c:forEach var="episode" items="${episodes}">
		<tr>
			<td>${episode.tconst}</td>
			<td>${episode.parentTconst}</td>
			<td>${episode.seasonNumber}</td>
			<td>${episode.episodeNumber}</td>
		</tr>
	</c:forEach>
</table>
