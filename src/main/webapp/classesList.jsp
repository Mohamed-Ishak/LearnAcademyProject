<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Classes List Page</title>
<link type="text/css" rel="stylesheet" href="css/style.css">
</head>
<body>
	<div id="page">
		<jsp:include page="side-bar.jsp" />


		<div id="wrapper">

			<div id="header">
				<h3>Classes List Page </h3>
			</div>
		</div>
		
		
		<div id="container">

			<div id="content">

				<table>

					<tr>

						<th>Class ID</th>
						<th>Teacher Name</th>
						<th>Subject Name</th>
						<th>Teacher ID</th>
						<th>Subject ID</th>


					</tr>

					<c:forEach var="cl" items="${ClassesList }">
						<tr>					
													
						    <td>${cl.classID}</td>
							<td>${cl.teacher_Name}</td>
							<td>${cl.subject_Name}</td>
							<td>${cl.teacher_id}</td>
							<td>${cl.subject_id}</td>


							
						</tr>


					</c:forEach>

				</table>
			</div>
		</div>
	</div>
</body>
</html>