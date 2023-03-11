<%@page import="entities.Teacher"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Teachers List</title>
<link type="text/css" rel="stylesheet" href="css/style.css">
</head>
<body>
<div id="page" >
   <jsp:include page="side-bar.jsp"></jsp:include>
   
		<div id="wrapper">

			<div id="header">
				<h3>Teachers</h3>
			</div>
		</div>
     
  <div id="container">

			<div id="content">

				<table>

					<tr>
                        <th>Teacher ID</th>
						<th>Teacher Name</th>

					</tr>
					
					<c:forEach var="te" items="${TeacherList }">
					
					<tr>
					<td>${te.teacherID }</td>
					<td>${te.teacherName }</td>
					</tr>
					
					
					</c:forEach>


				</table>
			</div>
		</div>
 </div>      
</body>
</html>