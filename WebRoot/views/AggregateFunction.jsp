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
<title>My AggregateFunction.jsp</title>
</head>
<body>
<center><h2> Aggregate functions - Number of movies ( count )  for a same Title Type. </h2> </center>
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
		<th>Title Type</th>
		<th>Number of Titles</th>
	</tr>
	<c:forEach var="aggregatefunction" items="${aggregatefunctions}">
		<tr>
			<td>${aggregatefunction.titleType}</td>
			<td>${aggregatefunction.COUNT}</td>
		</tr>
	</c:forEach>
</table>