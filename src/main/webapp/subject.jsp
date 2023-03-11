<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Subject Page</title>
<link type="text/css" rel="stylesheet" href="css/style.css">
</head>
<body>
<div id="page">
		<jsp:include page="side-bar.jsp" />


		<div id="wrapper">

			<div id="header">
				<h3>Subjects</h3>
			</div>
		</div>


		<div id="container">

			<div id="content">

				<table>

					<tr>

						<th>Subject ID</th>
						<th>Subject Name</th>
						

					</tr>

					<c:forEach var="sub" items="${SubjectList }">
						<tr>

							<td>${sub.subjectID}</td>
							<td>${sub.subjectName}</td>
							

						</tr>


					</c:forEach>

				</table>
			</div>
		</div>
	</div>
</body>
</html>