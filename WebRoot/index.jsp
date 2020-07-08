<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	
	
<style>
.button {
  background-color: #4CAF50;
  border: none;
  color: white;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer; 
}

.button2 {background-color: #008CBA;} 
.button3 {background-color: #f44336;} 
.button4 {background-color: #e7e7e7; color: black;}
.button5 {background-color: #555555;}

* {
  box-sizing: border-box;
}

/* Create three equal columns that floats next to each other */
.column {
  float: left;
  width: 33.33%;
  padding: 10px;
  height: 300px; /* Should be removed. Only for demonstration */
}

/* Clear floats after the columns */
.row:after {
  content: "";
  display: table;
  clear: both;
}

</style>


  </head>
  <BODY background="imdbhomepage.jpg">
  
  <center><h1>IMDB WEB PROJECT</h1> </center>
  <hr>
  <center><h2>   	</h2> </center>
  <center><h4>   	</h4> </center>
    <form action=/MVC/BasicsController>
    <input type="submit" style="width:25%"  class="Button button2" value="Basic"/>
    </form>
 
        <form action=/MVC/AkasController>
    <input type="submit" style="width:25%" class="Button button3" value="Akas"/>
    </form>

        <form action=/MVC/CrewController>
    <input type="submit" style="width:25%" class="Button button4" value="Crew"/>
    </form>

        <form action=/MVC/EpisodeController>
    <input type="submit" style="width:25%" class="Button button5" value="Episode"/>
    </form>

        <form action=/MVC/PrincipalController>
    <input type="submit" style="width:25%" class="Button button2" value="Principal"/>
    </form>
 
        <form action=/MVC/RatingsController>
    <input type="submit" style="width:25%" class="Button" value="Rating"/>
    </form>
 
       <form action=/MVC/TitleBasicController>
        <input type="submit" style="width:25%" class="Button button3" value="Title Basic"/>
    </form>
    
    <form action=/MVC/MovieDetailController>
        <input type="submit" style="width:25%" class="Button button4" value="Movie Detail View"/>
    </form>
    
    <form action=/MVC/DirectorDetailController>
        <input type="submit" style="width:25%" class="Button button5" value="Director Detail View"/>
    </form>
    
    <form action=/MVC//TopRatedTVseriesController>
        <input type="submit" style="width:25%" class="Button button2" value="Top Rated TVseries Procedure"/>
    </form>
    
    <form action=/MVC//AggregateFunctionController>
        <input type="submit" style="width:25%" class="Button" value="GROUP BY & ORDER BY"/>
    </form>
    
    <form action=/MVC//SetOperationController>
        <input type="submit" style="width:25%" class="Button button3" value="Set Operations"/>
    </form>
    
     <form action=/MVC//NestedQueriesController>
        <input type="submit" style="width:25%" class="Button button4" value="Nested Queries"/>
    </form>
    
    <form action=/MVC//JoinOperationController>
        <input type="submit" style="width:25%" class="Button button5" value="Join Operations"/>
    </form>
 
  </body>
</html>
