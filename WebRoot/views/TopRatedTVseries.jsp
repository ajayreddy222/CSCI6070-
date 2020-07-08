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
<title>My TopRatedTVseries.jsp</title>
</head>
<body>
<center><h2>Top 10 TV series (more than 1 season) which most average ratings.</h2> </center>
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
		<th>Primary Title</th>
		<th>Title Type</th>
		<th>Average Rating</th>
	</tr>
	<c:forEach var="tvseries" items="${tvseriess}">
		<tr>
			<td>${tvseries.primaryTitle}</td>
			<td>${tvseries.titleType}</td>
			<td>${tvseries.averageRating}</td>
		</tr>
	</c:forEach>
</table>