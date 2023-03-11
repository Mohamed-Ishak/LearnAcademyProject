<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student List</title>
<link type="text/css" rel="stylesheet" href="css/style.css">
</head>
<body>
<div id="page" >
   <jsp:include page="side-bar.jsp"></jsp:include>
   
		<div id="wrapper">

			<div id="header">
				<h3>Students</h3>
			</div>
		</div>



		<div id="container">

			<div id="content">

				<table>

					<tr>
                        <th>Student ID</th>
                        <th>classID</th>
						<th>Student Name</th>
						<th>Student Email</th>						
						<th>Student Phone</th>
					</tr>
					
					<c:forEach var="st" items="${StudentList }">
					
					<tr>
					<td>${st.studentID }</td>
					<td>${st.classID}</td>
					<td>${st.studentName }</td>
					<td>${st.stEmail }</td>				
					<td>${st.stPhone }</td>
					</tr>
					
					
					</c:forEach>


				</table>
			</div>
		</div>
	</div>





</body>
</html>