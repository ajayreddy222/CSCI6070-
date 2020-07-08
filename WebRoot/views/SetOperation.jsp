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
<title>My SetOperation.jsp</title>
</head>
<body>
<center><h2> Set Operations - Information of Movies whose average rating is greather than 7 and No.Of Votes greather than 10. </h2> </center>
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
		<th>Average Rating</th>
		<th>Number of Votes</th>
	</tr>
	<c:forEach var="setoperation" items="${setoperations}">
		<tr>
			<td>${setoperation.tconst}</td>
			<td>${setoperation.averageRating}</td>
			<td>${setoperation.numVotes}</td>
		</tr>
	</c:forEach>
</table>