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
<title>My MovieDetail.jsp</title>
</head>
<body>
<center><h2> Information of movies (Title, Region, Language, Year, Rating, Votes) which have average rating greater than 7 and number of votes greater than 1000. </h2> </center>
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
		<th>Region</th>
		<th>Language</th>
		<th>Start Year</th>
		<th>Average Rating</th>
		<th>No.of Votes</th>
	</tr>
	<c:forEach var="moviedetail" items="${moviedetails}">
		<tr>
			<td>${moviedetail.primaryTitle}</td>
			<td>${moviedetail.region}</td>
			<td>${moviedetail.language}</td>
			<td>${moviedetail.startYear}</td>
			<td>${moviedetail.averageRating}</td>
			<td>${moviedetail.numVotes}</td>
		</tr>
	</c:forEach>
</table>