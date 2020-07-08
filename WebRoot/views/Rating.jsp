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
<center><h2> Title.Rating Table Result </h2> </center>
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
		<th>Average Rating</th>
		<th>Number of Votes</th>
	</tr>
	<c:forEach var="rating" items="${ratings}">
		<tr>
			<td>${rating.tconst}</td>
			<td>${rating.averageRattig}</td>
			<td>${rating.numVotes}</td>
		</tr>
	</c:forEach>
</table>

