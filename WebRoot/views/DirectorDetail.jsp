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
<title>My DirectorDetail.jsp</title>
</head>
<body>
<center><h2> Names of persons who have directed more than 10 movies. </h2> </center>
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
		<th>Director Name</th>
	</tr>
	<c:forEach var="directordetail" items="${directordetails}">
		<tr>
			<td>${directordetail.primaryName}</td>
		</tr>
	</c:forEach>
</table>